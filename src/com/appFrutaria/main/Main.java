package com.appFrutaria.main;

import com.appFrutaria.service.Prateleira;
import com.appFrutaria.view.Atendente;

public class Main {
	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		Prateleira prateleira = new Prateleira();
		int opcaoMenuEscolha = 1;

		do {
			opcaoMenuEscolha = atendente.menuPrincipal();
			prateleira.gerenciarPrateleira(opcaoMenuEscolha, atendente);
		} while (opcaoMenuEscolha != 0);

		atendente.finalizarApp();
	}
}