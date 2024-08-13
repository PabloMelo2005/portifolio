package controle;

import java.util.Scanner;

public class NumMaior {

	public static void main(String[] args) {
		int atualNum = 0; //Começa em 0 apenas para ter um ponto de partida.

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {

			System.out.println("Digite um número: ");
			int num = sc.nextInt();

			if (num > atualNum) { //valor armazenado vai se atualizar apenas se o número informado for maior que o anterior.
				atualNum = num;
			}

		}

		System.out.printf("\n| %d e o maior destes numeros! ", atualNum);
		sc.close();
	}

}
