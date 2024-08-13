package controle;

public class Continue {

	public static void main(String[] args) {
		
		//Caso o número for par, irá continuar o código, caso contrário, imprimirá na tela:
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) { 
				continue; //Apenas continuar a percorrer, não fazer mais nada.
			}
			
			System.out.printf("\n Esta na posicao %d", i);
		}

		System.out.println("\n  Fim do programa. ");
	}

}
