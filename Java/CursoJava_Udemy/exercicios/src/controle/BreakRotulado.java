package controle;

public class BreakRotulado {

	public static void main(String[] args) {
		
		Externo: for(int i = 0; i < 5; i++) { // "Externo" é um  rótulo para aquela linha de código;
			for (int j = 0; j < 5; j++) {
				if (i == 3) { // Pular o i quando for igual a 3
					break Externo; /* Como eu estou parando a linha, irá parar de percorrer o i como um todo, programa irá finalizar.
					Caso houvesse utilizado somente o break, iria somente pular a linha em que i = 3.
					*/
				}
				
				System.out.printf(" [%d %d] ", i, j);
			}
			
			System.out.println();
		}

	}

}
