package com.appFrutaria.view;

import java.util.Scanner;

import com.appFrutaria.model.Fruta;
import com.appFrutaria.model.Produto;
import com.appFrutaria.model.Verdura;

public class Atendente {

	Scanner leia;

	public Atendente() {
		leia = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("\n╔══════════════════════════════════════════╗");
		System.out.println("║              MENU PRINCIPAL              ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ 1 -> Cadastrar uma fruta                 ║");
		System.out.println("║ 2 -> Listar frutas                       ║");
		System.out.println("║ 3 -> Remover fruta                       ║");
		System.out.println("║ 4 -> Buscar fruta                        ║");
		System.out.println("║ 5 -> Quantidade de frutas registradas    ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ 6 -> Cadastrar uma verdura               ║");
		System.out.println("║ 7 -> Listar verduras                     ║");
		System.out.println("║ 8 -> Remover verdura                     ║");
		System.out.println("║ 9 -> Buscar verdura                      ║");
		System.out.println("║ 10 -> Quantidade de verduras registradas ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ 11 -> Quantidade total de produtos       ║");
		System.out.println("║ 0 -> Voltar ao menu principal            ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("Digite uma opção: ");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}

	// FRUTAS

	public String frutaNome() {
		System.out.print("Digite o nome da fruta: ");
		return leia.nextLine();
	}

	public double frutaPreco() {
		System.out.print("Digite um preco para a fruta: ");
		return leia.nextDouble();
	}

	public int frutaQuantidade() {
		System.out.print("Digite a quantidade: ");
		return leia.nextInt();
	}

	public double frutaPeso() {
		System.out.print("Digite o peso da fruta: ");
		return leia.nextDouble();
	}

	public void visualizarFruta(Fruta fruta) {
		System.out.println("---");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preco: " + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Peso em gramas: " + fruta.getPeso() + " g");
	}

	public String frutaRemover() {
		System.out.print("Digite o nome da fruta que deseja remover: ");
		return leia.nextLine();
	}

	public void visualizarFrutaRemovida(String nome) {
		System.out.println("A fruta '" + nome + "' foi removida.");
	}

	public String frutaBuscar() {
		System.out.print("Digite o nome da fruta que deseja encontrar: ");
		return leia.nextLine();
	}

	public void visualizarFrutaBuscada(String modeloBusca, Fruta fruta) {
		System.out.println("\nResultado da sua pesquisa: '" + modeloBusca + "': ");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preco: R$ " + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Peso em gramas: " + fruta.getPeso() + " g");
	}

	public static void visualizarQuantidadeFrutas() {

		if (Fruta.getContadorFruta() == 0) {
			System.out.println("Existe " + Fruta.getContadorFruta() + " frutas registradas no sistema! Sistema vazio!");
		} else if (Fruta.getContadorFruta() == 1) {
			System.out.println("Existe " + Fruta.getContadorFruta() + " fruta registrada no sistema!");
		} else {
			System.out.println("\nExistem " + Fruta.getContadorFruta() + " frutas diferentes registradas no sistema!");
		}
	}

	public void mensagemNaoEncontradoFruta() {
		System.out.println("Fruta não encontrada!!!");
	}

	// VERDURAS

	public String verduraNome() {
		System.out.print("Digite o nome da verdura: ");
		return leia.nextLine();
	}

	public double verduraPreco() {
		System.out.print("Digite um preco para a verdura: ");
		return leia.nextDouble();
	}

	public int verduraQuantidade() {
		System.out.print("Digite a quantidade: ");
		return leia.nextInt();
	}

	public String verduraTipo() {
		System.out.print("Digite o tipo da verdura: ");
		return leia.nextLine();
	}

	public void visualizarVerdura(Verdura verdura) {
		System.out.println("---");
		System.out.println("Nome: " + verdura.getNome());
		System.out.println("Preco: " + verdura.getPreco());
		System.out.println("Quantidade: " + verdura.getQuantidade());
		System.out.println("Tipo: " + verdura.getTipo());
	}

	public String verduraRemover() {
		System.out.print("Digite o nome da verdura que deseja remover: ");
		return leia.nextLine();
	}

	public void visualizarVerduraRemovida(String nome) {
		System.out.println("A verdura '" + nome + "' foi removida.");
	}

	public String verduraBuscar() {
		System.out.print("Digite o nome da verdura que deseja encontrar: ");
		return leia.nextLine();
	}

	public void visualizarVerduraBuscada(String modeloBusca, Verdura verdura) {
		System.out.println("\nResultado da sua pesquisa: '" + modeloBusca + "': ");
		System.out.println("Nome: " + verdura.getNome());
		System.out.println("Preco: R$ " + verdura.getPreco());
		System.out.println("Quantidade: " + verdura.getQuantidade());
		System.out.println("Tipo: " + verdura.getTipo());
	}

	public static void visualizarQuantidadeVerduras() {

		if (Verdura.getContadorVerdura() == 0) {
			System.out.println(
					"Existe " + Verdura.getContadorVerdura() + " verduras registradas no sistema! Sistema vazio!");
		} else if (Verdura.getContadorVerdura() == 1) {
			System.out.println("Existe " + Verdura.getContadorVerdura() + " verdura registrada no sistema!");
		} else {
			System.out.println(
					"\nExistem " + Verdura.getContadorVerdura() + " verduras diferentes registradas no sistema!");
		}
	}

	public static void visualizarQuantidade() {

		if (Produto.getContador() == 0) {
			System.out.println("Existe " + Produto.getContador() + " produtos registradas no sistema! Sistema vazio!");
		} else if (Produto.getContador() == 1) {
			System.out.println("Existe " + Produto.getContador() + " produtos registrada no sistema!");
		} else {
			System.out.println("\nExistem " + Produto.getContador() + " produtos diferentes registrados no sistema!");
		}
	}

	public void creditos() {
		System.out.println("\n╔═══════════════════════════════════════════════════════╗");
		System.out.println("║                       Créditos:                       ║");
		System.out.println("╠═══════════════════════════════════════════════════════╣");
		System.out.println("║                                                       ║");
		System.out.println("║    Código desenvolvido por Nathan Batista da Silva    ║");
		System.out.println("║                                                       ║");
		System.out.println("║       Feito usando o material desenvolvido por:       ║");
		System.out.println("║                 Bruno da Silva Andrade                ║");
		System.out.println("║                                                       ║");
		System.out.println("║                 Agradecimentos finais                 ║");
		System.out.println("║                                                       ║");
		System.out.println("║                 ---------------------                 ║");
		System.out.println("║                                                       ║");
		System.out.println("║         A Deus, pois a ele sempre serei grato         ║");
		System.out.println("║         Aos meus colegas de classe pela ajuda         ║");
		System.out.println("║         Ao meu pai e minha mãe pelo incentivo         ║");
		System.out.println("║      À Kamili pelo suporte e os primeiros testes      ║");
		System.out.println("║                                                       ║");
		System.out.println("║     E a você, pessoa que está usando este código!     ║");
		System.out.println("║                                                       ║");
		System.out.println("║                 ---------------------                 ║");
		System.out.println("║                                                       ║");
		System.out.println("║           Visite meu GitHub: nathansilva150           ║");
		System.out.println("║                                                       ║");
		System.out.println("║                    Até a próxima!!                    ║");
		System.out.println("║                                                       ║");
		System.out.println("╚═══════════════════════════════════════════════════════╝");
		System.out.println("\nVoltando ao menu...\n");
	}

	// EASTER EGG DO GUGU 🖤
	public void guguLiberato1() {
		System.out.println("╔═══════════════════════════════════════════════════════════╗");
		for (int i = 0; i < 1000; i++) {
			System.out.println("║  Olá! Eu estou falando com o Gan ou com o Gugu Liberato?  ║");
		}
		System.out.println("╚═══════════════════════════════════════════════════════════╝");
		System.out.println("\n   💥      💥  💥  💥 💥💥 Cabum 💥💥 💥  💥  💥      💥  ");
		System.exit(0);
	}
	
	public void guguLiberato() {
		System.out.println("╔═══════════════════════════════════════════════════════════╗");
		for (int i = 0; i < 1000; i++) {
			System.out.println("║  Olá! Eu estou falando com o Gan ou com o Gugu Liberato?  ║");
		}
		System.out.println("╚═══════════════════════════════════════════════════════════╝");
		System.out.println("\n   💥      💥  💥  💥 💥💥 Cabum 💥💥 💥  💥  💥      💥  ");
		System.exit(0);
	}

	public void mensagemForaDosLimites() {
		System.out.println("O valor informado é inválido! Voltando ao menu.");
	}

	public void mensagemNaoEncontradoVerdura() {
		System.out.println("Verdura não encontrada!!!");
	}
	
	public void mensagemListaVazia() {
		System.out.println("Lista vazia! Insira algo...");
	}

	public void limparScanner() {
		leia.nextLine();
	}
	
	public void finalizarApp() {
		System.out.println("Sistema encerrado!");
	}

}
