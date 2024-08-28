package atividade7;

public class LojaDeLivros {

	private	String NomeLivro;
	private	String EscritorLivro;
	private	int DataLivro;
	private double PrecoLivro;
		
	public LojaDeLivros(String NomeLivro, String EscritorLivro ,int DataLivro, double PrecoLivro) {
	this.NomeLivro = NomeLivro;
	this.PrecoLivro = PrecoLivro;
	this.EscritorLivro = EscritorLivro;
	this.DataLivro = DataLivro;
	}
	
	
	public String getNomeLivro() {
		return NomeLivro;
	}
	public void setNomeLivro(String NomeLivro) {
		this.NomeLivro = NomeLivro;
	}

	public int getDataLivro() {
		return DataLivro;
	}
	public void setDataLivro(int DataLivro) {
		this.DataLivro = DataLivro;
	}
	public String getEscritorLivro() {
		return EscritorLivro;
	}
	public void setEscritorLivro (String EscritorLivro) {
		this.EscritorLivro = EscritorLivro;
	}
	public double getPrecoLivro() {
		return PrecoLivro;
	}
	public void setPreçoLivro(double PrecoLivro) {
		this.PrecoLivro = PrecoLivro;
	}
	public void imprimirDados() {
		System.out.println("Livro: " + getNomeLivro());
		System.out.println("Preço: " + getPrecoLivro());
		System.out.println("Escritor do livro: " + getEscritorLivro());
		System.out.println("Data de publicamento: " + getDataLivro());
		
	}





























}
