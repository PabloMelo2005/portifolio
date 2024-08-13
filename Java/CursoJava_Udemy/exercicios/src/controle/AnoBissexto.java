package controle;

import java.util.Calendar;

public class AnoBissexto {

	public static void main(String[] args) {

		Calendar calendario = Calendar.getInstance(); // Criando uma instância para a classe calendário do pacote.

		int ano = calendario.get(Calendar.YEAR); // criando uma variável para acessar o ano do calendário.

		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0))) { // Um ano bissexto é divisível por 4, porém anos múltiplos de 100 e não divisíveis por 400 não são bissextos.
			System.out.printf("%d e um ano bissexto. ", ano);
		}

		else {
			System.out.printf("%d nao e um ano bissexto. ", ano);
		}

	}

}
