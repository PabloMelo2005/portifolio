package controle;

public class Break {

	public static void main(String[] args) {


		for (int i = 0; i <= 10; i++) {
			
			if (i == 7) {
				break; // Mesmo que a condição para sair do laço seja "i" ser menor que 10, o "break" tem a função de interromper abruptamente um programa(neste caso o laço)
			}
			
			System.out.printf("\n Esta na posicao %d", i);
		}
		
		System.out.println("\n  Fim do programa. ");
	}

}
