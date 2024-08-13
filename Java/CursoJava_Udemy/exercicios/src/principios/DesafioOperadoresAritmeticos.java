package principios;

public class DesafioOperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		int numA = (int) Math.pow(6 * (3 + 2), 2), numB = (int) (1 - 5) * (2 - 7); //numeradores dentro das frações em parênteses
		int supA = (int) numA / (3 * 2), supB = (int) Math.pow(numB / 2, 2); //Numerador da fração maior
		int sup = (int) Math.pow((supA - supB), 3); //Numerador da fração maior elevado a 3, para logo ser dividido por 1 a 10 elevado a 3/
		int resultado = (int) sup / (int) Math.pow(10,  3);
		
		System.out.printf("O resultado desta operação é %d.", resultado);
	
	}

}
