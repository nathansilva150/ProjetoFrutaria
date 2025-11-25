package model;

public class Fruta {

	private String nome;
	private double preco;
	private int quantidade;
	private String tipo;
	private static int contador = 0;

	public Fruta() {
		this.nome = " ";
		this.preco = 0.0;
		this.quantidade = 0;
		this.tipo = " ";
		Fruta.setContador(Fruta.getContador() + 1);
	}

	public Fruta(String nome, double preco, int quantidade, String tipo) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.tipo = tipo;
		Fruta.setContador(Fruta.getContador() + 1);

	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Fruta.contador = contador;
	}

}
