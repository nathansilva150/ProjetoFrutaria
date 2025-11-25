package view;

import java.util.Scanner;
import model.Fruta;

public class Atendente {

	Scanner leia;

	public Atendente() {
		leia = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("\n=============< App Frutaria >=============");
		System.out.println("| 1 - Cadastrar uma fruta                |");
		System.out.println("| 2 - Listar frutas                      |");
		System.out.println("| 3 - Remover fruta                      |");
		System.out.println("| 4 - Buscar fruta                       |");
		System.out.println("| 5 - Quantidade de frutas registradas   |");
		System.out.println("| 0 - Sair do programa                   |");
		System.out.println("==========================================");
		System.out.print("Digite uma opção: ");
		int opcao = leia.nextInt();
		leia.nextLine();
		return opcao;
	}

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

	public String frutaTipo() {
		leia.nextLine();
		System.out.print("Digite o tipo da fruta: ");
		return leia.nextLine();
	}

	public void visualizar(Fruta fruta) {
		System.out.println("---");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preco: " + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Tipo: " + fruta.getTipo());
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
		System.out.println("Tipo: " + fruta.getTipo());
	}

	public static void visualizarQuantidadeFrutas() {

		if (Fruta.getContador() == 0) {
			System.out.println("Existe " + Fruta.getContador() + " frutas registradas no sistema! Sistema vazio!");
		} else if (Fruta.getContador() == 1) {
			System.out.println("Existe " + Fruta.getContador() + " fruta registrada no sistema!");
		} else {
			System.out.println("\nExistem " + Fruta.getContador() + " frutas diferentes registradas no sistema!");
		}
	}

	public void mensagemNaoEncontrado() {
		System.out.println("Fruta não encontrada!!!");
	}

	public void finalizarApp() {
		System.out.println("Sistema encerrado!");
	}

}
