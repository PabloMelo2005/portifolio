package principios;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Ola, meu amigo".charAt(4)); //.chatAt mapeia cada letra da String e retorna aquele "slot" compativel com a letra, como t é a 4° letra, retornou a mesma.
		
		String T = "Bom dia";
		
		
		//Impressão & Alteração do valor:
		System.out.println(T.concat("!")); //Adiciona aquele valor à variável.
		System.out.println(T + "!!!"); //Apenas imprime aquela junção, sem alterar o valor da String.
		
		
		//Testes de começo e inicio da String:
		System.out.println(T.startsWith("Bom")); //Verifica se a String realmente começa desta forma, retornando true or false.
		System.out.println(T.startsWith("Boa"));
		System.out.println(T.replace("Bom", "Boa").startsWith("Boa")); //realizada a troca do valor da string, para que possa ser igual ao testado(Boa).
		
		System.out.println(T.endsWith("dia")); //Verifica se a String realmente termina desta forma, retornando true or false.
		System.out.println(T.endsWith("tarde"));
		System.out.println(T.replace("dia", "tarde").endsWith("tarde"));//realizada a troca do valor da string, para que possa ser igual ao testado(tarde).
		
		
		//Retorno de tamanho da String:
		System.out.println(T.length());
		
		//Verificação do valor da String:
		System.out.println(T.equals("Boa noite")); //Verifica se a String é realmente aquela dentro do parênteses e retorna um true or false.
		System.out.println(T.equals("bom dia"));
		System.out.println(T.equalsIgnoreCase("bom dia")); //Faz a mesma coisa que o comando acima, porém ignora letras maiúsculas e minúsculas
		
		var nome = "Julia";
		var sobrenome = "Silva";
		var idade = 21;
		var salario = 6_765.99F;
		
		//substituição de strings por valores(.2f = duas casas decimais):
		System.out.println("\n\n Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario +  "\n\n" );
		System.out.printf("A Sra. %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario); 
		String formatacao = String.format("A Sra. %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario); //comando de formatação.
		System.out.println(formatacao);
	}

}
