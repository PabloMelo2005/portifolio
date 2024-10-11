const express = require('express');
const mysql = require('mysql');
const bodyParser = require('body-parser');

// Criar uma instância do Express:
const app = express();
app.use(bodyParser.json());

// Configuração do banco de dados:
const db = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'api'
});

// Conectar ao banco de dados
db.connect((err) => {
    if (err) {
        console.error('Erro ao conectar com o Banco de Dados', err);
        return;
    }
    console.log('Conectado ao Banco de Dados com Sucesso!');
});

// Rota para inserir clientes
app.post('/clientes', (req, res) => {
    const { nome, email, telefone, endereco } = req.body;
    if (!nome || !email || !telefone || !endereco) {
        return res.status(400).json({ message: 'Faltam informações no seu código!' });
    }
    const query = 'INSERT INTO clientes(nome, email, telefone, endereco) VALUES (?, ?, ?, ?)';
    db.query(query, [nome, email, telefone, endereco], (err, result) => {
        if (err) {
            console.error('Erro ao inserir dados', err);
            return res.status(500).json({ message: 'Erro ao inserir os dados' });
        }
        res.status(201).json({ message: 'Inserido com sucesso', userID: result.insertId });
    });
});

// Rota para inserir produtos
app.post('/produtos', (req, res) => {
    const { nome_produto, preco, estoque } = req.body;
    if (!nome_produto || !preco || !estoque) {
        return res.status(400).json({ message: 'Faltam informações!' });
    }
    const query = 'INSERT INTO produtos(nome_produto, preco, estoque) VALUES (?, ?, ?)';
    db.query(query, [nome_produto, preco, estoque], (err, result) => {
        if (err) {
            console.error('Erro ao inserir dados', err);
            return res.status(500).json({ message: 'Erro ao inserir os dados' });
        }
        res.status(201).json({ message: 'Inserido com sucesso', productID: result.insertId });
    });
});

// Rota para inserir pedidos
app.post('/pedidos', (req, res) => {
    const { id_clientes, id_produto, data_pedido, quantidade, valor_total } = req.body;

    if (!id_clientes || !id_produto || !data_pedido || !quantidade || !valor_total) {
        return res.status(400).json({ message: 'Faltam informações no seu código!' });
    }

    const query = 'INSERT INTO pedidos(id_clientes, id_produto, data_pedido, quantidade, valor_total) VALUES (?, ?, ?, ?, ?)';
    db.query(query, [id_clientes, id_produto, data_pedido, quantidade, valor_total], (err, result) => {
        if (err) {
            console.error('Erro ao inserir dados', err);
            return res.status(500).json({ message: 'Erro ao inserir os dados' });
        }
        res.status(201).json({ message: 'Inserido com sucesso', orderID: result.insertId });
    });
});


// Iniciar o servidor na porta 3000
const PORT = 3000;
app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});
