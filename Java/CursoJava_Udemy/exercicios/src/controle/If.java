package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a sua nota: ");
		double nota = sc.nextDouble();
		
		System.out.println("\n[ Situação do aluno ]");
		
		 // {} = Bloco de código(Instruções).
		if (nota >= 7.0) {
			System.out.println("\nAPROVADO!");
		}
		
		if (nota < 7.0 && nota >= 5.0) {
			System.out.println("\nEM RECUPERACAO!");
		}
		
		if (nota < 5.0) {
			System.out.println("REPROVADO!");
		}
		
		sc.close();

	}

}
