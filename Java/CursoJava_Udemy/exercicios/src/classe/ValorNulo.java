package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = ""; //Não está nulo.
		System.out.println(s1.concat("!*"));
		
		String s2 = null; // Valor nulo
		System.out.println(s2); //concatenar com valor nulo = erro de compilação.

	}

}
