package principios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Conversão de String para números, considerando "," e ".":
		System.out.print("Insira o salário do primeiro funcionario: ");
		String sal1 = sc.nextLine();
		System.out.print("Insira o salário do segundo funcionario: ");
		String sal2 = sc.nextLine();
		System.out.print("Insira o salário do terceiro funcionario: ");
		String sal3 = sc.nextLine();
		 
		Double salario1 = Double.parseDouble(sal1.replace(",", ".")); //O replace troca a vírgula por ponto, para ficar no formato aceito de double.
		Double salario2 = Double.parseDouble(sal2.replace(",", "."));
		Double salario3 = Double.parseDouble(sal3.replace(",", "."));
		
		Double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("\n\nO salário médio deste setor é %.2f ", media);
		
		
		
		
		
		
		
		
		
		
	}

}
