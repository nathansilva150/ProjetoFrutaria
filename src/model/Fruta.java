package model;

public class Fruta extends Produto {

	private double peso;
	private static int contadorFruta;

	public Fruta() {
		super();
		this.peso = 0;
		Fruta.contadorFruta++;
	}

	public Fruta(String nome, double preco, int quantidade, double peso) {
		super(nome, preco, quantidade);
		this.peso = peso;
		Fruta.contadorFruta++;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPeso() {
		return peso;
	}

	public static int getContadorFruta() {
		return contadorFruta;
	}

	public static void setContadorFruta(int contadorFruta) {
		Fruta.contadorFruta = contadorFruta;
	}

}
