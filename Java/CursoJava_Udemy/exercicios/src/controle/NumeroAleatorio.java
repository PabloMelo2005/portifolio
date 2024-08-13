package controle;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random NumAleatorio = new Random();
		int Sorteado = NumAleatorio.nextInt(101);

		for (int i = 10; i > 0; i--) {

			System.out.printf("\n!! RESTAM %d TENTATIVAS !!",i); //Exibir o contador.
			System.out.print(
					"\n\n [ Jogo de Advinhacao ]\n | Estou pensando em um número entre 0 e 100\n | Tente advinha-lo, digite um núuero: ");
			int num = sc.nextInt();

			if (num == Sorteado) { 
				System.out.println("-> Parabéns, voce acertou! ");
				break; //Encerrar o programa caso acerte
			} else { 
				System.out.println("-> Droga, nao foi desta vez! ");
				continue; //Caso orre, continuar o ciclo até as tentativas acabarem.
			}

		}
		
		System.out.println("\n\n !! SUAS TENTATIVAS ACABARAM !!"); 

		sc.close();

	}

}
