package com.appFrutaria.model;

public class ProdutoDeLimpeza extends Produto {
	
	private String marca;
	private static int contadorProdutoDeLimpeza;
	
	public ProdutoDeLimpeza() {
		super();
		this.marca = "";
	}
	
	public ProdutoDeLimpeza(String nome, double preco, int quantidade, String marca, int id) {
		super(nome, preco, quantidade, id);
		this.marca = marca;
		ProdutoDeLimpeza.contadorProdutoDeLimpeza++;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static int getContadorProdutoDeLimpeza() {
		return contadorProdutoDeLimpeza;
	}

	public static void setContadorProdutoDeLimpeza(int contadorProdutoDeLimpeza) {
		ProdutoDeLimpeza.contadorProdutoDeLimpeza = contadorProdutoDeLimpeza;
	}

}
