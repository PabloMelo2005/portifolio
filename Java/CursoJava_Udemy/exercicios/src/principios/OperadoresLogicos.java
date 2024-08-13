package principios;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean cond1 = true;
		boolean cond2 = 5 > 9;
		
		System.out.println(cond1 && cond2); //AND
		System.out.println(cond1 || cond2); //OR
		System.out.println(cond1 ^ cond2); //XOR
		System.out.println(!cond1); //NOT(inversão) de valor
		
		System.out.println("\n\n[ Tabela verdade AND ]");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		
		System.out.println("\n\n [ Tabela verdade OR ]");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\n\n [ Tabela verdade XOR ]");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\n\n [ Tabela verdade NOT ]");
		System.out.println(!true);
		System.out.println(!false);
		

	}

}
