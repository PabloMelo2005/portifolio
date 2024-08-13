package controle;

import java.util.Scanner;

public class LetraPorLetra {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("[ Sistema de separação de palavras por letra ]\n| Digite uma palavra: ");
		String palavra = sc.next();
		System.out.println();
		
		for  (int i = 0; i < palavra.length(); i++) {
			char letra = palavra.charAt(i); //Joga cada letra naquela colocação, percorrendo todo o tamanho do texto.
			System.out.println((i+1) + "- " + letra);
		}

	}

}
