package main;

import view.Atendente;
import service.Prateleira;

public class Main {
    public static void main(String[] args) {
        
        Atendente atendente = new Atendente();
        Prateleira prateleira = new Prateleira();
        int opcaoMenuEscolha = 1;
        
            do {
                opcaoMenuEscolha = atendente.menuPrincipal();
                prateleira.gerenciarPrateleira(opcaoMenuEscolha, atendente);
            }while(opcaoMenuEscolha != 0);
            
            atendente.finalizarApp();
    }
}