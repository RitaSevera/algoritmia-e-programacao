package FichaPratica12.Exercicio01;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> catalogoAviao;

    public Catalogo() {
        this.catalogoAviao = new ArrayList<>();
    }

    public void adquirir (Aviao aviaoNovo) {
        this.catalogoAviao.add(aviaoNovo);

    }
    public void vender (int linha) {
        this.catalogoAviao.remove(linha);
    }
    public double calcularTotal () {
        double total = 0;
        for (Aviao aviaoAtual: this.catalogoAviao) {
            total = total +aviaoAtual.getPreco();
        }
        return total;
    }
    public void listarCatalogo () {
        System.out.println("***** Catálogo de Aviões *****");
        for (Aviao aviaoAtual : this.catalogoAviao) {
            if (aviaoAtual instanceof JatoParticular) { //sei que aviaoAtual é Avião e Jato Privado
                JatoParticular jatoAtual = (JatoParticular) aviaoAtual;
                jatoAtual.exibirDetalhesJato();
            }
            if (aviaoAtual instanceof AviaoCombate) { //sei que aviaoAtual é Avião e Avião de Combate
                AviaoCombate aviaoCombateAtual = (AviaoCombate) aviaoAtual;
                aviaoCombateAtual.exibirDetalhesAviaoCombate();
            }
        }
    }
}
