package com.appFrutaria.model;

public class Verdura extends Produto {

	private String tipo;
	private static int contadorVerdura;

	public Verdura(String nome, double preco, int quantidade, String tipo, int id) {
		super(nome, preco, quantidade, id);
		this.tipo = tipo;
		Verdura.contadorVerdura++;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public static int getContadorVerdura() {
		return contadorVerdura;
	}

	public static void setContadorVerdura(int contadorVerdura) {
		Verdura.contadorVerdura = contadorVerdura;
	}

	@Override
	public String toString() {
		return "Verdura: " + nome + "\nID: " + id + "\nPreço: R$ " + preco + "\nQuantidade: " + quantidade + "\nTipo: "
				+ tipo;
	}

}
