package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Comida comida = new Comida("arroz", 0.2);
		Pessoa pessoa = new Pessoa("Carlos", 55.0, 1.40);
		
		//Teste do antes e depois de comer.
		pessoa.infoPessoa();
		pessoa.comer(comida);
		pessoa.infoPessoa();

	}

}
