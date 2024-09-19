public class Atleta {

    private String nome, pais;
    private int qtdeMedalhas;

    public int getQtdeMedalhas() {
        return qtdeMedalhas;
    }

    public void setQtdeMedalhas(int qtdeMedalhas) {
        this.qtdeMedalhas = qtdeMedalhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void impressao() { //* Método de exibição das variáveis */
        System.out.printf("\n [ Dados do Atleta] \n\n Nome: %s \n País: %s \n Quantidade de medalhas: %d", nome, pais,
                qtdeMedalhas);
    }
}