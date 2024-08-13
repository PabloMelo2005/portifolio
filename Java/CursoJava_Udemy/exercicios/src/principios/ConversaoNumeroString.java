package principios;


public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //pegar o número de caracteres de uma string.
		
		int num2 = 45678965;
		System.out.println(Integer.toString(num2).length());

	}

}
