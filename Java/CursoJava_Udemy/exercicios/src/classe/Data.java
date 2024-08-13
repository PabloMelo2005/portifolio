package classe;

public class Data {

	int dia, mes, ano;
	
	Data () { //Construtor sem parâmetros(Objetos base).
		this(1, 1, 1970);  //Chamando um construtor com valores base
	}
	
	Data (int dia, int mes, int ano) { //Construtor que utiliza parâmetros.
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String formatoData() {
		String formatacao = " "; //Variável local, por estar definida dentro do escopo do método.

		if (dia <= 30 && mes <= 12) { 
			formatacao = "\n\n[ Data de Hoje ]" + String.format("\n %02d/%02d/%04d", dia, mes, ano); // Data formatada como variável.																							// como variável
		}
		
		else {
			formatacao = "\n\n Data inválida!";
		}
		
		return formatacao;
	}

}
