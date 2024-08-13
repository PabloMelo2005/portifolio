package controle;

import java.util.Scanner;

public class WhilePositivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, resultado = 0;

		do {
			System.out.print("\nInforme um numero(caso deseje encerrar o programa, informe um número negativo: ");
			num = sc.nextInt();

			resultado += num;

			System.out.println("| Soma atual: " + resultado);

		} while (num > 0); // repita o loop enquanto o número for positivo.

		System.out.println("\n\n-> Fim do programa"); // Encerre o programa quando sair do loop.
		sc.close();

	}

}
