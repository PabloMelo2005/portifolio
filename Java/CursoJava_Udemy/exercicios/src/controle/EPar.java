package controle;

import java.util.Scanner;

public class EPar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número entre 0 e 10: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0 && (num >= 0 && num <= 10) ) {
			System.out.printf("\n %d e um numero par e esta entre 0 e 10! ", num);
		}
		
		else if (num % 2 != 0 && (num >= 0 && num <= 10)) {
			System.out.printf("\n %d e um numero impar e esta entre 0 e 10! ", num);
		}
		
		else {
			System.out.printf("%d nao esta entre 0 e 10! ", num);
		}
		

	}

}
