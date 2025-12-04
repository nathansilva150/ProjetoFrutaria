package com.appFrutaria.service;

import java.util.List;

import com.appFrutaria.model.Fruta;
import com.appFrutaria.model.Verdura;
import com.appFrutaria.view.Atendente;

import java.util.ArrayList;

public class Prateleira {
	List<Fruta> listaFruta;
	List<Verdura> listaVerdura;

	public Prateleira() {
		listaFruta = new ArrayList<>();
		listaVerdura = new ArrayList<>();
	}

	public void gerenciarPrateleira(int opcao, Atendente atendente) {
		switch (opcao) {
		case 1 -> {
			String nome = atendente.frutaNome();
			double preco = atendente.frutaPreco();
			int quantidade = atendente.frutaQuantidade();
			double peso = atendente.frutaPeso();
			atendente.limparScanner();

			Fruta frutas = new Fruta(nome, preco, quantidade, peso);
			listaFruta.add(frutas);
			System.out.println("\nFruta registrada no sistema!\n");
		}

		case 2 -> {
			if (listaFruta.isEmpty()) {
				atendente.mensagemListaVazia();
			} else {
			for (Fruta fruta : listaFruta) {
				atendente.visualizarFruta(fruta);
				System.out.println("---");
			}
			}

		}

		case 3 -> {
			String nome = atendente.frutaRemover();
			boolean removido = false;

			for (int indice = 0; indice < listaFruta.size(); indice++) {
				if (listaFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
					listaFruta.remove(indice);
					removido = true;
					Fruta.setContador(Fruta.getContador() - 1);
					break;
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
			Fruta fruta = new Fruta();
			Fruta.setContador(Fruta.getContador() - 1);

			for (int indice = 0; indice < listaFruta.size(); indice++) {
				if (listaFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
					fruta = listaFruta.get(indice);
					buscado = true;
					break;
				}
			}
			if (buscado) {
				atendente.visualizarFrutaBuscada(nome, fruta);
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
			listaVerdura.add(verdura);
			System.out.println("\nVerdura registrada no sistema!\n");

		}

		case 7 -> {
			if (listaVerdura.isEmpty()) {
				atendente.mensagemListaVazia();
			} else {
				for (Verdura verdura : listaVerdura) {
					atendente.visualizarVerdura(verdura);
					System.out.println("---");
				}
			}

		}

		case 8 -> {
			String nome = atendente.verduraRemover();
			boolean removido = false;

			for (int indice = 0; indice < listaVerdura.size(); indice++) {
				if (listaVerdura.get(indice).getNome().equalsIgnoreCase(nome)) {
					listaVerdura.remove(indice);
					removido = true;
					Verdura.setContador(Verdura.getContador() - 1);
					break;
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
			Verdura verdura = new Verdura();
			Fruta.setContador(Fruta.getContador() - 1);

			for (int indice = 0; indice < listaVerdura.size(); indice++) {
				if (listaVerdura.get(indice).getNome().equalsIgnoreCase(nome)) {
					verdura = listaVerdura.get(indice);
					buscado = true;
					break;
				}
			}
			if (buscado) {
				atendente.visualizarVerduraBuscada(nome, verdura);
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

		case 2019 -> {
			atendente.guguLiberato();
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
