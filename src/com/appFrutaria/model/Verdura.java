package com.appFrutaria.model;

public class Verdura extends Produto {

	private String tipo;
	private static int contadorVerdura;

	public Verdura() {
		super();
		this.tipo = "";
		Verdura.contadorVerdura++;
	}

	public Verdura(String nome, double preco, int quantidade, String tipo) {
		super(nome, preco, quantidade);
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

}
