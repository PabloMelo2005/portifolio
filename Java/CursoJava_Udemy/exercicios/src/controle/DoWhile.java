package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String resposta;
		
		do {
			System.out.println("Digite algo (Caso queira encerrar o programa, digite 'sair'): ");
				resposta = sc.nextLine();
		} 
		while (!resposta.equalsIgnoreCase("sair"));
		
		System.out.println("\n Fim do programa");
		sc.close(); 
		
	}

}
