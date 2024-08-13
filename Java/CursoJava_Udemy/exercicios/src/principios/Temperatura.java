package principios;

import java.util.Scanner;

public class Temperatura {
	
	public static void main(String[] args) {
		
		double F;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em °F: ");
		F = sc.nextDouble();
		
		final double C = (F - 32) * 5 / 9;
		System.out.println("A temperatura em °C é:" + "\n" + C);
	}

}
