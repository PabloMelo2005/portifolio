package classe;

public class Produto {
	
	String nome = " ";
	double preco = 0.0;
	static double desconto = 25;
	
	double aplicarDesconto() {
        return preco - (preco * (desconto / 100));
    }
	
	double aplicarDesconto(double desconto) {
        return preco - (preco * (desconto / 100));
    }
	

}
