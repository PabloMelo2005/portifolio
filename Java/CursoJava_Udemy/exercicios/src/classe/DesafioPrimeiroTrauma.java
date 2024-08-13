package classe;

public class DesafioPrimeiroTrauma {
	
	int a = 2;

	public static void main(String[] args) {
		
		DesafioPrimeiroTrauma desafio = new DesafioPrimeiroTrauma();
		System.out.println(desafio.a); //Não está pública, logo é um valor próprio da classe, e por não ser stático não pode ser acessado sem a instância.

	}

}
