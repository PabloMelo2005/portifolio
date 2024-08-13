package principios;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matricula = sc.nextInt();
		sc.nextLine(); //Faz com que o scanner leia o "\n" deixado ao darmos enter e ir para a outra linha.
	
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine(); //Este comando identifica a entrada da linha completa e vai imediatamente para a próxima.
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.print("Informe a quantos anos trabalha nesta empresa: ");
		int TempoDeCasa = sc.nextInt();
		
		System.out.printf("\n\n %s %s da matricula %d trabalha na empresa a %d anos.", nome, sobrenome, matricula, TempoDeCasa);
		
		sc.close();
		
	}

}
