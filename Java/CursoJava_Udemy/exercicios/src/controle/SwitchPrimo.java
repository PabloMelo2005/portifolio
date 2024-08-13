package controle;

import java.util.Scanner;

public class SwitchPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean IsPrimo = true;
		int casos;

		System.out.println("Informe um número: ");
		int num = sc.nextInt();

		if (num <= 1) {
			IsPrimo = false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) { // Números primos só são divisíveis por 1 e ele mesmo, "1" não é
													// primo.
			if (num % i == 0) {
				IsPrimo = false;
				break; // Sair do loop ao encontrar o resultado correto.
			} else {
				IsPrimo = true;
				break;
			}

		}

		if (IsPrimo) { //Conversão para numero, uma vez que switch não pode utilizar booleans
			casos = 1;
		} else {
			casos = 0;
		}

		switch (casos) { 
		case 1:
			System.out.println("Este e um numero primo! ");
		case 0:
			System.out.println("Este numero nao e primo. ");
		}

		sc.close();

	}

}
