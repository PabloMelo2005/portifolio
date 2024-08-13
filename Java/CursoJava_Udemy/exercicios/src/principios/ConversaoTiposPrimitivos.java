package principios;

public class ConversaoTiposPrimitivos {

	public static void main(String[] args) {
		
		double a = 1.6659887878989; //implicita
		System.out.println(a);
		
		float b = (float) 1.6659887878989; //Explícita[CAST] - dando ordens ao java de converter, independente da alteração de valor.
		System.out.println(b);
		
		int c = 587;
		byte d = (byte) c; //Explícita[CAST] - dando ordens ao java de converter, independente da alteração de valor.
		System.out.println(d);
		
		double e = 6.999999;
		int f = (int) e;
		System.out.println(f);

	}

}
