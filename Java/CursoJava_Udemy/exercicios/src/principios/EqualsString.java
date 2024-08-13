package principios;

import java.util.Scanner;

public class EqualsString {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Informe a string a ser comparada: ");
		String s2 = sc.nextLine();
		
		System.out.println("\n\n" + "2" == s2.trim()); // o ".trim" remove espaços.
		System.out.println("2".equals(s2.trim())); //o equals considera apenas o conteúdo digitado(Melhor opção para comparar strings.

	}

}
