package controle;

public class ContinueRotulado {

	public static void main(String[] args) {

		Externo: for (int i = 0; i < 5; i++) { // "Externo" é um rótulo para aquela linha de código;
			for (int j = 0; j < 5; j++) {
				if (i == 3) {
					continue; // Irá continuar a parte externa, caso coloque apenas "Continue", irá pular esta linha referente.
				}

				System.out.printf(" [%d %d] ", i, j);
			}

			System.out.println();
		}

	}

}
