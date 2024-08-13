package classe;

public class Pessoa {
	
	String nome;
	double peso, altura;
	
	public Pessoa(String nome, double peso, double altura) {
		
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		
	}
	
	double comer(Comida comida) {
		if (comida != null) {
			peso += comida.peso; //Quando comer, adicionar o peso da comida se não for vazio
		}
		
		return peso;
	}
	
	void infoPessoa() {
		
		String formatacao = String.format("\n\n [ Informações ]\n\n Nome: %s\n Peso: %.2f \n Altura: %.2f", nome, peso, altura); // Variável local de formatação.
		String infos = "".concat(formatacao); //String com as informações
		System.out.print(infos);
		
	}

}
