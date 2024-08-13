package controle;

import java.util.Scanner;

public class DesafioWhileFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite algo: ");
		String resposta = sc.nextLine();
		
		while (!resposta.equalsIgnoreCase("sair")) { //o "!" tem a função de negar aquela condição.
			
			System.out.println("Digite algo: ");
			resposta = sc.nextLine();
			
		}
		
		System.out.println("\n Fim do programa");
		sc.close(); 
		
	}
	

}
