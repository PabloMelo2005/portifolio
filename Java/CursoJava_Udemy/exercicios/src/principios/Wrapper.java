package principios;

public class Wrapper {

	public static void main(String[] args) {
		
		// Wrappers tem diferença de que começam com letra maiúscula e são as versões orientadas a objeto dos Tipos Primitivos.
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); //Conversão de String para integer.
		Long l = 1000000L; //Sempre lembrar de colocar o "L" no final de tipos long.
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i *7);
		System.out.println(l / 3);
		
		Double d = 15489.16;
		System.out.println(d);
		
		Float f = 874.5F;
		System.out.println(f);
		
		Boolean bo = Boolean.parseBoolean("1"); //conversão de String para boolean.
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); 
		
		Character c = 's'; //para character se utiliza ' ao invés de ".
		System.out.println(c + "!");
		
		

	}

}
