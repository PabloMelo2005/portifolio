package principios;

import java.util.Scanner;

public class Ternarios {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUal a média do aluno: ");
		double media = sc.nextDouble();
		
		String resultado = media >= 7.0 ? "Aprovado" : "em recuperacao"; // Delimitação para aparecer caso seja aprovado ou reprovado.
		System.out.printf("O aluno possui uma media de %.1f; Logo esta %s. ", media, resultado);

	}

}
