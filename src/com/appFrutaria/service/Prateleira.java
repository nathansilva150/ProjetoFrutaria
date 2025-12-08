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
		switch (opcao) {
		case 1 -> {
			String nome = atendente.frutaNome();
			double preco = atendente.frutaPreco();
			int quantidade = atendente.frutaQuantidade();
			double peso = atendente.frutaPeso();
			atendente.limparScanner();
			if (preco < 0 || peso < 0 || quantidade < 0) {
				atendente.dadosInvalidos();
				break;
			} else {
				Fruta frutas = new Fruta(nome, preco, quantidade, peso);
				listaProduto.add(frutas);
				System.out.println("\nFruta registrada no sistema!");
			}
		}

		case 2 -> {
			if (listaProduto.isEmpty()) {
				atendente.mensagemListaVazia();
			} else {
				for (Produto f : listaProduto) {

					if (f instanceof Fruta) {
						atendente.visualizarFruta((Fruta) f);
					}
				}
				System.out.println("---");
			}

		}

		case 3 -> {
			String nome = atendente.frutaRemover();
			boolean removido = false;

			for (int indice = 0; indice < listaProduto.size(); indice++) {
				if (listaProduto.get(indice) instanceof Fruta) {
					if (listaProduto.get(indice).getNome().equalsIgnoreCase(nome)) {
						listaProduto.remove(indice);
						removido = true;
						Fruta.setContadorFruta(Fruta.getContadorFruta() - 1);
						Produto.setContador(Produto.getContador() - 1);
						break;
					}
				}

			}

			if (removido) {
				atendente.visualizarFrutaRemovida(nome);

			} else {
				atendente.mensagemNaoEncontradoFruta();
			}

		}

		case 4 -> {
		    String nome = atendente.frutaBuscar();
		    boolean buscado = false;
		    Fruta frutaEncontrada = null;

		    for (Produto p : listaProduto) {
		        if (p instanceof Fruta && p.getNome().equalsIgnoreCase(nome)) {
		            frutaEncontrada = (Fruta) p;
		            buscado = true;
		            break;
		        }
		    }

		    if (buscado) {
		        atendente.visualizarFrutaBuscada(nome, frutaEncontrada);
		    } else {
		        atendente.mensagemNaoEncontradoFruta();
		    }
		}

		case 5 -> {
			Atendente.visualizarQuantidadeFrutas();
		}

		case 6 -> {
			String nome = atendente.verduraNome();
			double preco = atendente.verduraPreco();
			int quantidade = atendente.verduraQuantidade();
			atendente.limparScanner();
			String tipo = atendente.verduraTipo();

			Verdura verdura = new Verdura(nome, preco, quantidade, tipo);
			listaProduto.add(verdura);
			System.out.println("\nVerdura registrada no sistema!");

		}

		case 7 -> {
			if (listaProduto.isEmpty()) {
				atendente.mensagemListaVazia();
			} else {
				for (Produto v : listaProduto) {
					if(v instanceof Verdura) {
					atendente.visualizarVerdura((Verdura) v);
					}
				}
				System.out.println("---");
			}

		}

		case 8 -> {
			String nome = atendente.verduraRemover();
			boolean removido = false;

			for (int indice = 0; indice < listaProduto.size(); indice++) {
				if (listaProduto.get(indice) instanceof Verdura) {
					if (listaProduto.get(indice).getNome().equalsIgnoreCase(nome)) {
						listaProduto.remove(indice);
						removido = true;
						Verdura.setContadorVerdura(Verdura.getContadorVerdura() - 1);
						Produto.setContador(Produto.getContador() - 1);
						break;
					}
				}
			}

			if (removido) {
				atendente.visualizarVerduraRemovida(nome);
			} else {
				atendente.mensagemNaoEncontradoVerdura();
			}
		}

		case 9 -> {
		    String nome = atendente.verduraBuscar();
		    boolean buscado = false;
		    Verdura verduraEncontrada = null;

		    for (Produto p : listaProduto) {
		        if (p instanceof Verdura && p.getNome().equalsIgnoreCase(nome)) {
		            verduraEncontrada = (Verdura) p;
		            buscado = true;
		            break;
		        }
		    }

		    if (buscado) {
		        atendente.visualizarVerduraBuscada(nome, verduraEncontrada);
		    } else {
		        atendente.mensagemNaoEncontradoVerdura();
		    }
		}

		case 10 -> {
			Atendente.visualizarQuantidadeVerduras();
		}

		case 11 -> {
			Atendente.visualizarQuantidade();
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

