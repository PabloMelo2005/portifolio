package controle;

import java.util.Scanner;

public class DesafioSemana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana: ");
		String dia = sc.next().toLowerCase(); //Aceitar letras maiúsculas e minúsculas(Poderia ter sido utilizado o .equalsIgnoreCase).
		
		if (dia.equals("domingo")) {
			System.out.println("Domingo - 1");
		}

		else if (dia.equals("segunda")) {
			System.out.println("Segunda - 2");
		}
		
		else if (dia.equals("terça") || dia.equals("terca")) {
			System.out.println("Terça - 3");
		}
		
		else if (dia.equals("quarta")) {
			System.out.println("Quarta - 4");
			}
		else if (dia.equals("quinta")) {
			System.out.println("Quinta - 5");
			}
		else if (dia.equals("sexta")) {
			System.out.println("Sexta - 6");
			}
		else if (dia.equals("sabado") || dia.equals("sábado")) {
			System.out.println("Sabado -  7");
			}
		else {
				System.out.println("\n Isto não é um dia da semana!");
			}
		
		sc.close();
		}
	

}



