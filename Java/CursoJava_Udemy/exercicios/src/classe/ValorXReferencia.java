package classe;

public class ValorXReferencia {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a; //Atribuição por valor
		
		a--;
		b++;
		
		System.out.println(a + " | " + b);
		
		Data d2 = new Data();
		Data d1 = new Data(2, 7, 2021); 
		d1 = d2; //Atribuição por objeto(Válido para toda a instância)
		
		d1.dia = 6;
		d1.mes = 4;
		d1.ano = 2021;
		
		System.out.println(d1.formatoData() + " | " + d2.formatoData());
		
	}
	
	static void voltarPadrao(Data d) { //Alteração direta dos parâmetros da classe para todas as referências
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}
