import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Atleta atleta = new Atleta();

        System.out.print("\n [Ficha do atleta] \nInforme o nome: ");
        String nome = sc.nextLine();
        atleta.setNome(nome);

        System.out.print("Informe o país de origem: ");
        String pais = sc.nextLine();
        atleta.setPais(pais);

        System.out.print("Informe a quantidade de medalhas: ");
        int qtdeMedalhas = sc.nextInt();
        atleta.setQtdeMedalhas(qtdeMedalhas);

        atleta.impressao();

        sc.close();

    }
}