package view;

import java.util.Scanner;
import model.Fruta;

public class Atendente {
    
        Scanner los;
        
    public Atendente() {
        los = new Scanner(System.in);
    }
    
    public int menuPrincipal() {
        System.out.println("1 - Cadastrar uma fruta");
        System.out.println("2 - Listar frutas");
        System.out.println("3 - Remover fruta");
        System.out.println("0 - Sair");
        int opcao = los.nextInt();
        los.nextLine();
        return opcao;
    }
    
    public String frutaNome() {
        System.out.print("Digite o nome da fruta: ");
        return los.nextLine();
    }
        
    public double frutaPreco() {
        System.out.print("Digite um preco para a fruta: ");
        return los.nextDouble();
    }
    
    public int frutaQuantidade() {
        System.out.print("Digite a quantidade: ");
        return los.nextInt();
    }
    
    public String frutaTipo() {
        los.nextLine();
        System.out.print("Digite o tipo da fruta: ");
        return los.nextLine();
    }
    
    public void visualizar(Fruta fruta) {
        System.out.println("---");
        System.out.println("Nome: "+ fruta.getNome());
        System.out.println("Preco: "+ fruta.getPreco());
        System.out.println("Quantidade: "+ fruta.getQuantidade());
        System.out.println("Tipo: "+ fruta.getTipo());
    }
    
    public String frutaRemover() {
        System.out.print("Digite o nome da fruta que deseja remover: ");
        return los.nextLine();
    }
    
    public void visualizarFrutaRemovida(String nome) {
        System.out.println("A fruta '"+ nome + "' foi removida.");
    }
    
    public void menssagemNaoEncontrado(String nome) {
        System.out.println("Fruta não encontrada!!!");
    }
    
    public void finalizarApp() {
        System.out.println("Sistema encerrado!!!");
    }
    
}
