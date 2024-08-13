package controle;

public class DesafioFor {

	public static void main(String[] args) {
		String valor = "#";

		for (valor = "#"; !valor.equals("######"); valor += "#") { //Inicia com o valor com apenas 1 '#', usa como condição para sair do for ser igual a '######".
			System.out.println(valor);
		}

	}

}
