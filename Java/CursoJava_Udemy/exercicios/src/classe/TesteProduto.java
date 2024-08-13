package classe;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		
		System.out.println("\n [ Insira os seguintes dados(Produto1): ]");
		System.out.print(" NOME: ");
		p1.nome = sc.nextLine();
		System.out.print("\n PRECO: ");
		p1.preco = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("\n [ Insira os seguintes dados)(Produto2): ]");
		System.out.print(" NOME: ");
		p2.nome = sc.nextLine();
		System.out.print("\n PRECO: ");
		p2.preco = sc.nextDouble();
		System.out.print("\n DESCONTO: ");
		double desconto = sc.nextDouble();
		
		double ValorFinal_p1 = p1.aplicarDesconto();
		double ValorFinal_p2 = p2.aplicarDesconto(desconto);
		
		System.out.printf("\n\n[ Ficha técnica do %s ] \n Nome: %s \n Preco: %.2f \n Valor com desconto: %.2f", p1.nome, p1.nome, p1.preco, ValorFinal_p1);
		System.out.printf("\n\n[ Ficha técnica do %s ] \n Nome: %s \n Preco: %.2f \n Valor com desconto: %.2f", p2.nome, p2.nome, p2.preco, ValorFinal_p2);


	}

}
