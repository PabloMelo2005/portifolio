package classe;

import java.util.Scanner;

public class TesteData {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.println("[ Sistema de datas ] \n (Insira somente números): \n");
		 
		 System.out.print("Dia: ");
		 int dia = sc.nextInt();
		 System.out.print("Mês: ");
		 int mes = sc.nextInt();
		 System.out.print("Ano: ");
		 int ano = sc.nextInt();
		 
		 Data data = new Data(dia, mes, ano);
		 
		 System.out.println(data.formatoData()); // Não foram estabelecidos parâmetros, pois utilizei a variável dentro da classe.
		 
		 sc.close();

	}


}
