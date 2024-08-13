package controle;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String status = "";
		
		System.out.print("[ Sistema de notas ]\n Informe a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print(" Informe a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7.0 && media <= 10) {
			status = "APROVADO";
		}
		else if (media < 7.0 && media > 4.0) {
			status = "RECUPERACAO";
		}
		else if (media <= 4.0 && media >= 0) {
			status = "REPROVADO";
		}
		else {
			status = "NOTA INSERIDA INVALIDA";
		}
		
		
		System.out.printf("\n| Media: %.2f ", media);
		System.out.printf("\n| Situacao do aluno: %s ", status);
		
		sc.close();
		

	}

}
