package com.appFrutaria.model;

public class Fruta extends Produto {

	private double peso;
	private static int contadorFruta;


	public Fruta(String nome, double preco, int quantidade, double peso, int id) {
		super(nome, preco, quantidade, id);
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

	@Override
	public String toString() {
		return "Fruta: " + nome + "\nID: " + id + "\nPreço: R$ " + preco + "\nQuantidade: " + quantidade
				+ "\nPeso em gramas: " + peso + " g";
	}

}
