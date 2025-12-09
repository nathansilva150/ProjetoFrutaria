package com.appFrutaria.model;

public class ProdutoDeLimpeza extends Produto {
	
	private static int contadorProdutoDeLimpeza;
	
	public ProdutoDeLimpeza() {
		super();
		ProdutoDeLimpeza.contadorProdutoDeLimpeza++;
	}

}
