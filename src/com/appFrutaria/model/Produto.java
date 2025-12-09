package com.appFrutaria.model;

public class Produto {

	protected String nome;
	protected double preco;
	protected int quantidade;
	protected static int contador = 0;
	protected int id;
	private static int contadorId = 0;
	

	public Produto() {
		this.nome = "";
		this.preco = 0;
		this.quantidade = 0;
		Produto.contador++;
		this.id++;
	}

	public Produto(String nome, double preco, int quantidade, int id) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		Produto.contador++;
		this.id = ++contadorId;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public static void setContador(int contador) {
		Produto.contador = contador;
	}

	public static int getContador() {
		return contador;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Produto: " + nome + "\nID: " + id + "\nPreço: R$ " + preco + "\nQuantidade: " + quantidade;
	}

	
}
