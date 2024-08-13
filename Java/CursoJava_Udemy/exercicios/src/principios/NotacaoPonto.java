package principios;


public class NotacaoPonto {
	
	public static void main(String[] args) {
		//Exemplo mensagem de entrada:
		
		String T = "Olá, seja bem vindo a Area do Beneficiario"; 
		T = T.replace("Beneficiario", "Credenciado"); //troca de palavras dentro da String
		T = T.toUpperCase();
		T = T.concat("!");
		
		System.out.println(T);
		
		T = "Olá, seja bem vindo a Area do Beneficiario".toUpperCase().concat("!"); //Voltando ao status normal, em caixa alta e com um "!".
		
		System.out.println(T);
		
		
		
	}

}
