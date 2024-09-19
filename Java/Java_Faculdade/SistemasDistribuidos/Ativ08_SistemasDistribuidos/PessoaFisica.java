import java.util.Scanner;

public class PessoaFisica {

    private String nome, cpf, dataNascimento;
    Scanner sc = new Scanner(System.in);

    public PessoaFisica(String nome, String cpf, String data) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = data;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String data) {
        dataNascimento = data;
    }

    public void impressao() {

        System.out.printf(
                "\n [ Dados ]\n\n - Nome: %s \n - CPF: %s \n - Data de nascimento: %s \n",
                nome, cpf, dataNascimento);

    }

}