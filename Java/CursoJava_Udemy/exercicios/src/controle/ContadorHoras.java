package controle;

public class ContadorHoras {

	public static void main(String[] args) {

		int hora = 0, segundos = 0, dia = 0;

		while (segundos < 60) {

			segundos++;// Contador de segundos.

			if (segundos == 59 && hora < 24) { // Aumentar a hora a cada 60s e contar somente até 2 horas.

				hora++; // contador de horas,
				segundos = 0;
				
				
				if (hora >= 24 && dia < 30) {
					dia++;
					hora = 0;
						
					}
				}
				
			System.out.printf("\n%dd%dh%dm", dia, hora, segundos);

			}
		
		System.out.println("\n\nVocê completou o mes!");

		}

	}
