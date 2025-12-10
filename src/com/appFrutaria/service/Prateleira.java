package com.appFrutaria.service;

import java.util.List;

import com.appFrutaria.model.*;
import com.appFrutaria.view.Atendente;

import java.util.ArrayList;

public class Prateleira {
	List<Produto> listaProduto;

	public Prateleira() {
		listaProduto = new ArrayList<>();
	}

	public void gerenciarPrateleira(int opcao, Atendente atendente) {
		Produto produto1 = new Produto();

		switch (opcao) {
		case 1 -> {
			int opcaoCadastro = atendente.menuCadastro();

			switch (opcaoCadastro) {
			case 1 -> {
				String nome = atendente.frutaNome();
				double preco = atendente.frutaPreco();
				int quantidade = atendente.frutaQuantidade();
				double peso = atendente.frutaPeso();
				atendente.limparScanner();
				int id = produto1.getId();

				if (preco < 0 || peso < 0 || quantidade < 0) {
					atendente.dadosInvalidos();
					break;
				} else {
					Produto frutas = new Fruta(nome, preco, quantidade, peso, id);
					listaProduto.add(frutas);
					System.out.println("\nFruta registrada no sistema!");
				}
			}
			case 2 -> {
				String nome = atendente.verduraNome();
				double preco = atendente.verduraPreco();
				int quantidade = atendente.verduraQuantidade();
				atendente.limparScanner();
				String tipo = atendente.verduraTipo();
				int id = produto1.getId();

				if (preco < 0 || quantidade < 0) {
					atendente.dadosInvalidos();
					break;
				} else {
					Produto verdura = new Verdura(nome, preco, quantidade, tipo, id);
					listaProduto.add(verdura);
					System.out.println("\nVerdura registrada no sistema!");
				}
			}
			case 0 -> {
				break;
			}
			}

		}
		case 2 -> {
			int opcaoListagem = atendente.menuListagem();

			switch (opcaoListagem) {
			case 1 -> {
				if (listaProduto.isEmpty()) {
					atendente.mensagemListaVazia();
				} else {
					for (Produto f : listaProduto) {

						if (f instanceof Fruta) {
							atendente.visualizarProduto((Fruta) f);
						}
					}
					System.out.println("---");
				}
			}
			case 2 -> {
				if (listaProduto.isEmpty()) {
					atendente.mensagemListaVazia();
				} else {
					for (Produto v : listaProduto) {
						if (v instanceof Verdura) {
							atendente.visualizarProduto((Verdura) v);
						}
					}
					System.out.println("---");
				}
			}
			case 3 -> {
				if (listaProduto.isEmpty()) {
					atendente.mensagemListaVazia();
				} else {
					for (Produto produto : listaProduto) {
						atendente.visualizarProduto(produto);
					}
				}
				System.out.println("---");
			}
			case 0 -> {
				break;
			}
			}
		}
		case 3 -> {
			int opcaoRemocao = atendente.menuRemocao();

			switch (opcaoRemocao) {
			case 1 -> {
				int id = atendente.produtoRemover();
				boolean removido = false;

				for (int indice = 0; indice < listaProduto.size(); indice++) {
					if (listaProduto.get(indice).getId() == id && listaProduto.get(indice) instanceof Fruta) {
						listaProduto.remove(indice);
						removido = true;
						Fruta.setContadorFruta(Fruta.getContadorFruta() - 1);
						Produto.setContador(Produto.getContador() - 1);
						break;

					}

				}

				if (removido) {
					atendente.visualizarProdutoRemovido(id);

				} else {
					atendente.mensagemNaoEncontradoProduto("Fruta");
				}

			}
			case 2 -> {
				int id = atendente.produtoRemover();
				boolean removido = false;

				for (int indice = 0; indice < listaProduto.size(); indice++) {
					if (listaProduto.get(indice).getId() == id && listaProduto.get(indice) instanceof Verdura verdura) {
						listaProduto.remove(indice);
						removido = true;
						Verdura.setContadorVerdura(Verdura.getContadorVerdura() - 1);
						Produto.setContador(Produto.getContador() - 1);
						break;
					}
				}

				if (removido) {
					atendente.visualizarProdutoRemovido(id);
				} else {
					atendente.mensagemNaoEncontradoProduto("Verdura");
				}
			}
			case 0 -> {
				break;
			}
			}
		}
		case 4 -> {
			int opcaoBusca = atendente.menuBusca();

			switch (opcaoBusca) {
			case 1 -> {
				int id = atendente.produtoBuscar();
				atendente.limparScanner();
				boolean buscado = false;
				Produto frutaEncontrada = null;

				for (Produto p : listaProduto) {
					if (p instanceof Fruta && p.getId() == id) {
						frutaEncontrada = p;
						buscado = true;
						break;
					}
				}

				if (buscado) {
					atendente.visualizarProdutoBuscado(id, frutaEncontrada);
				} else {
					atendente.mensagemNaoEncontradoProduto("Fruta");
				}
			}
			case 2 -> {
				int id = atendente.produtoBuscar();
				boolean buscado = false;
				Produto verduraEncontrada = null;

				for (Produto p : listaProduto) {
					if (p instanceof Verdura && p.getId() == id) {
						verduraEncontrada = p;
						buscado = true;
						break;
					}
				}

				if (buscado) {
					atendente.visualizarProdutoBuscado(id, verduraEncontrada);
				} else {
					atendente.mensagemNaoEncontradoProduto("Verdura");
				}
			}
			case 0 -> {
				break;
			}
			}
		}

		case 5 -> {
			int opcaoVisualizacao = atendente.menuVisualizar();

			switch (opcaoVisualizacao) {
			case 1 -> {
				Atendente.visualizarQuantidadeFrutas();
			}
			case 2 -> {
				Atendente.visualizarQuantidadeVerduras();
			}
			case 3 -> {
				Atendente.visualizarQuantidade();
			}
			case 0 -> {
				break;
			}
			}
		}

		case 28625 -> {
			atendente.creditos(); // "Easter Egg" (Créditos)
		}

		case 0 -> {
			break;
		}

		default -> {
			atendente.mensagemForaDosLimites();
		}

		}
	}

}
