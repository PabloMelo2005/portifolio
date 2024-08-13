package principios;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Classe de funcionario
		
		//Tipos numéricos inteiros:
		byte TempoDeCasa = 45;
		short BancoDeHoras = 186;
		int id = 785498621;
		long HashDeSeguranca = 8_94854_65L;
		
		// Tipos numéricos reais:
		float salario = 8_974.76f;
		double Num_De_Atendimentos = 8_789_741;
		
		//TIpo booleano:
		boolean Ativo = true;
		
		//Tipo caractere:
		char cargo = 'A'; //atendente
		
		System.out.println(" [ Ficha do Funcionario ] \n \n ID: " + id + "\n Status: " + Ativo + "\n Este funcionario esta na empresa a " + TempoDeCasa + " anos \n Salario: " + salario);
		

	}

}
