package FactoryMethod.Exercicio02;

import java.util.ArrayList;

public class Encomenda {
    private ArrayList<Taco> encomenda;

    public Encomenda() {
        this.encomenda = new ArrayList<>();
    }
    public void adicionarTaco (Taco tacoNovo) {
        this.encomenda.add(tacoNovo);
    }
    public void detalhesEncomenda(){
        for(Taco tacoAtual: this.encomenda){
            tacoAtual.mostrar();
        }
    }
    public void preparar (){
        for(Taco tacoAtual: this.encomenda){
            tacoAtual.preparar();
        }
    }
    public void cozinhar (){
        for(Taco tacoAtual: this.encomenda){
            tacoAtual.cozinhar();
        }
    }
    public void embalar (){
        for(Taco tacoAtual: this.encomenda){
            tacoAtual.embalar();
        }
    }
    public double total () {
        double valorTotal = 0;
        for(Taco tacoAtual: this.encomenda){
            valorTotal+=tacoAtual.getPreco();
        }
        return valorTotal;
    }
}
