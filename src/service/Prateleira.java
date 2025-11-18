package service;

import model.Fruta;
import java.util.List;
import java.util.ArrayList;
import view.Atendente;


public class Prateleira {
    List<Fruta> listaFruta;
        
        public Prateleira() {
            listaFruta = new ArrayList<>();
    }
        
        public void gerenciarPrateleira(int opcao, Atendente atendente){
            switch(opcao) {
                case 1 ->{
                    String nome = atendente.frutaNome();
                    double preco = atendente.frutaPreco();
                    int quantidade = atendente.frutaQuantidade();
                    String tipo = atendente.frutaTipo();
                    
                    Fruta frutas = new Fruta(nome, preco, quantidade, tipo);
                    listaFruta.add(frutas);    
                    
                }
                
                case 2 ->{
                    for(Fruta fruta : listaFruta) {
                        atendente.visualizar(fruta);
                    }
                }
                
                case 3 ->{
                    String nome = atendente.frutaRemover();
                    boolean removido = false;
                    
                    for(int indice = 0; indice < listaFruta.size(); indice++) {
                        if(listaFruta.get(indice).getNome().equalsIgnoreCase(nome)) {
                            listaFruta.remove(indice);
                            removido = true;
                            break;
                        }
                    }
                    
                    if(removido) {
                        atendente.visualizarFrutaRemovida(nome);
                        
                    }else {
                        atendente.menssagemNaoEncontrado(nome);
                    }
                }
                
            }
        }
}