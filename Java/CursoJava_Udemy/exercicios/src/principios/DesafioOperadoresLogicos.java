package principios;

public class DesafioOperadoresLogicos {

	public static void main(String[] args) {
		
		boolean trab1 = true, trab2 = true, sorvete, TV_50, TV_32;
		
		TV_50 = trab1 && trab2; //Se conseguir fazer os 2 trabalhos, iremos ao shopping comprar uma TV de 50 polegadas.
		TV_32 = trab1 ^ trab2; //Se conseguir fazer apenas 1 dos trabalhos, iremos ao shopping comprar uma TV de 32 polegadas.
		sorvete = TV_50 ^ TV_32; //Se conseguir formos ao shopping, iremos tomar sorvete.
		
		if (TV_50 == true) {
			
			System.out.println("Hoje nós iremos comprar uma TV de 50 polegadas!");
			
		}
		
		else if (TV_32 == true) {
			
			System.out.println("Hoje nós iremos comprar uma TV de 32 polegadas!");
			
		}
		
		
		if (sorvete == true) {
			
			System.out.println("Hoje nós iremos tomar sorvete!");
			
		}
		
		
		

	}

}
