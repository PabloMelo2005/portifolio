from flask import Flask, render_template, request, redirect, url_for, flash
import sqlite3
import re

app = Flask(__name__) #Flask é um framework que facilita a criação de aplicações web.
app.secret_key = '12345'

def connect_db():
    conectar = sqlite3.connect('vendas.db') #Mesmo que o arquivo .sql não exista, aqui você cria o banco de dados.
    return conectar

def create_table():
    conectar = connect_db()
    cursor = conectar.cursor()
    cursor.execute('''CREATE TABLE IF NOT EXISTS produto (
            id INTEGER PRIMARY KEY AUTOINCREMENT
            nome TEXT NOT NULL
            preco NUMERIC
            )'''
        )
    
    conectar.commit() #Atualizar o banco de dados.
    conectar.close() #Encerrar conexão.
    
@app.route('/') #Função index é requisitada quando o "/" é utilizado.
def index():
    render_template('index.html') #Função que define o html que será utilizado no front-end.
    

@app.route('/adicionar_produto', methods = ['POST']) #Criação de um método "Adicionar produto" que dá um POST, ou seja, atualiza o banco de dados.
def add_product():
    if request.method == 'POST':
        nome = request.form['nome']
        preco = request.form['preco']
    
    connect = connect_db()
    cursor = connect.cursor()
    cursor.execute(
        'INSERT INTO produtos(nome, preco) VALUES (?,?)', (nome, preco)
    )
    connect.commit()
    connect.close()
    flash('Produto adicionado com sucesso!', 'success') #Dispara uma mensagem no navegador, em html
    return redirect(url_for('index')) #Redireciona novamente para a página inicial
     

@app.route('/produtos')
def list_products():
    
    connect = connect_db()
    cursor = connect.cursor()
    cursor.execute('SELECT * FROM produtos')
    products = cursor.fetchall #Extração de todos os dados da consulta e armazenamento na variável.
    connect.close()
    return render_template('products.html', products=products)

if __name__ = '__main__':
    create_table()
    app.run(debug=True)
    