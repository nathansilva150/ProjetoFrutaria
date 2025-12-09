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
	
	// MENUS

	public int menuPrincipal() {
		System.out.println("\n╔═══════════════════════════════════════════╗");
		System.out.println("║              MENU PRINCIPAL               ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║ 1 -> Cadastrar um produto                 ║");
		System.out.println("║ 2 -> Listar produtos                      ║");
		System.out.println("║ 3 -> Remover produto                      ║");
		System.out.println("║ 4 -> Buscar produto                       ║");
		System.out.println("║ 5 -> Quantidade total de produtos         ║");
		System.out.println("║ 0 -> Encerrar sistema                     ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		System.out.print("Digite uma opção: ");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}

	public int menuCadastro() {
		System.out.println("\n╔═══════════════════════════════════════════╗");
		System.out.println("║               MENU CADASTRO               ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║ 1 -> Cadastrar fruta                      ║");
		System.out.println("║ 2 -> Cadastrar verdura                    ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║ 0 -> Cancelar cadastro                    ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		System.out.print("Digite uma opção: ");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}
	
	public int menuListagem() {
		System.out.println("\n╔═══════════════════════════════════════════╗");
		System.out.println("║               MENU LISTAGEM               ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║ 1 -> Listar frutas em estoque             ║");
		System.out.println("║ 2 -> Listar verduras em estoque           ║");
		System.out.println("║ 3 -> Listar todos os produtos em estoque  ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║ 0 -> Cancelar listagem                    ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		System.out.print("Digite uma opção: ");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}
	
	public int menuRemocao() {
		System.out.println("\n╔══════════════════════════════════════════╗");
		System.out.println("║               MENU REMOÇÃO               ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ 1 -> Remover uma fruta                   ║");
		System.out.println("║ 2 -> Remover uma verdura                 ║");
		System.out.println("╠══════════════════════════════════════════╣");
		System.out.println("║ 0 -> Cancelar remoção                    ║");
		System.out.println("╚══════════════════════════════════════════╝");
		System.out.print("Digite uma opção: ");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}
	
	public int menuBusca() {
		System.out.println("\n╔═══════════════════════════════════════════╗");
		System.out.println("║               MENU PESQUISA               ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║ O que você quer pesquisar?                ║");
		System.out.println("║ ----                                      ║");
		System.out.println("║ 1 -> Uma fruta no estoque                 ║");
		System.out.println("║ 2 -> Uma verdura no estoque               ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║ 0 -> Cancelar pesquisa                    ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		System.out.print("Digite uma opção: ");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}
	
	public int menuVisualizar() {
		System.out.println("\n╔═══════════════════════════════════════════╗");
		System.out.println("║             MENU VISUALIZAÇÃO             ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║ 1 -> Visualizar frutas em estoque         ║");
		System.out.println("║ 2 -> Visualizar verduras em estoque       ║");
		System.out.println("║ 3 -> Visualizar todos os produtos         ║");
		System.out.println("╠═══════════════════════════════════════════╣");
		System.out.println("║ 0 -> Cancelar visualização                ║");
		System.out.println("╚═══════════════════════════════════════════╝");
		System.out.print("Digite uma opção: ");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}
	
	public void visualizarProduto(Produto produto) {
		System.out.println("---");
		System.out.println(produto);
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

	public String frutaRemover() {
		System.out.print("Digite o nome da fruta que deseja remover: ");
		return leia.nextLine();
	}

	public void visualizarFrutaRemovida(String nome) {
		System.out.println("A fruta '" + nome + "' foi removida.");
	}

	public int produtoBuscar() {
		System.out.print("Digite o id do produto que deseja encontrar: ");
		return leia.nextInt();
	}

	public void visualizarProdutoBuscado(int id, Produto produto) {
		System.out.println("\nResultado da sua pesquisa: '" + id + "': ");
		System.out.println(produto);
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

	public String verduraRemover() {
		System.out.print("Digite o nome da verdura que deseja remover: ");
		return leia.nextLine();
	}

	public void visualizarVerduraRemovida(String nome) {
		System.out.println("A verdura '" + nome + "' foi removida.");
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
			System.out.println("Existe " + Produto.getContador() + " produtos registrados no sistema! Sistema vazio!");
		} else if (Produto.getContador() == 1) {
			System.out.println("Existe " + Produto.getContador() + " produto registrado no sistema!");
		} else {
			System.out.println("\nExistem " + Produto.getContador() + " produtos diferentes registrados no sistema!");
		}
	}

	public void creditos() {
		System.out.println("\n╔════════════════════════════════════════════════════════╗");
		System.out.println("║                        Créditos                        ║");
		System.out.println("╠════════════════════════════════════════════════════════╣");
		System.out.println("║                                                        ║");
		System.out.println("║    Código desenvolvido pelo Nathan Batista da Silva    ║");
		System.out.println("║                                                        ║");
		System.out.println("║        Feito usando o material desenvolvido por        ║");
		System.out.println("║                 Bruno da Silva Andrade                 ║");
		System.out.println("║                                                        ║");
		System.out.println("║                                                        ║");
		System.out.println("║        ╭─────( Agradecimentos especiais )─────╮        ║");
		System.out.println("║        │                                      │        ║");
		System.out.println("║        │                 Deus                 │        ║");
		System.out.println("║        │              Ana Gisele              │        ║");
		System.out.println("║        │           Jonathan Batista           │        ║");
		System.out.println("║        │            Kamili Camargo            │        ║");
		System.out.println("║        ╰──────────────────────────────────────╯        ║");
		System.out.println("║                                                        ║");
		System.out.println("║          E a você que está usando este código          ║");
		System.out.println("║                                                        ║");
		System.out.println("║                                                        ║");
		System.out.println("║                 GitHub: nathansilva150                 ║");
		System.out.println("║                                                        ║");
		System.out.println("║                     Até a próxima!                     ║");
		System.out.println("║                                                        ║");
		System.out.println("╚════════════════════════════════════════════════════════╝");
		System.out.println("\nVoltando ao menu...\n");
	}

	public void mensagemForaDosLimites() {
		System.out.println("O valor informado é inválido! Voltando ao menu.");
	}

	public void mensagemNaoEncontradoVerdura() {
		System.out.println("Verdura não encontrada!!!");
	}

	public void dadosInvalidos() {
		System.out.println("O valor informado é inválido!");
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

