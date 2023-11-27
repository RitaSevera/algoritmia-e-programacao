package FichaPratica11.Exercicio03;

import java.util.ArrayList;

public class BarcoDePesca {
    private String nome;
    private String cor;
    private int anoFabrico;
    private int tripulacao;
    private double capacidadeCarga;
    private Marca marcaDoBarco;
    private ArrayList<Peixe> peixesPescados = new ArrayList<>();
    private ArrayList <Marisco> mariscoPescado = new ArrayList<>();

    public BarcoDePesca(String nome, String cor, int anoFabrico, int tripulacao, double capacidadeCarga, Marca marcaDoBarco) {
        this.nome = nome;
        this.cor = cor;
        this.anoFabrico = anoFabrico;
        this.tripulacao = tripulacao;
        this.capacidadeCarga = capacidadeCarga;
        this.marcaDoBarco = marcaDoBarco;
        this.peixesPescados = new ArrayList<>();
        this.mariscoPescado = new ArrayList<>();
    }
    public double getCargaAtual () {
        double cargaAtual = 0;
        for (Peixe peixeAtual : this.peixesPescados) {
            cargaAtual = cargaAtual + peixeAtual.getPeso();
        }
        for (Marisco mariscoAtual : this.mariscoPescado) {
            cargaAtual = cargaAtual + mariscoAtual.getPeso();
        }
        return cargaAtual;
    }
    public void pescarPeixe (Peixe peixe) {
        if (peixe.getPeso() + this.getCargaAtual() <= this.capacidadeCarga){
            System.out.println("Peixe adicionado" + peixe.getEspecie());
            this.peixesPescados.add(peixe);
        } else {
            System.out.println("Barco sem capacidade de carga" + getCargaAtual());
        }
    }
    public void pescarMarisco (Marisco marisco) {
        if (marisco.getPeso() + this.getCargaAtual() <= this.capacidadeCarga){
            System.out.println("Marisco adicionado" + marisco.getEspecie());
            this.mariscoPescado.add(marisco);
        } else {
            System.out.println("Barco sem capacidade de carga");
        }
    }
    public void largarPeixe (int linha) {
       this.peixesPescados.remove(linha);
    }
    public void largarMarisco (int linha) {
        this.mariscoPescado.remove(linha);
    }
    public double calcularTotal () {
        double total = 0;
        for (Peixe peixeAtual : this.peixesPescados) {
            double precoPeixeAtual = peixeAtual.getPeso()*peixeAtual.getPreco();
            total = total + precoPeixeAtual;
        }
        for (Marisco mariscoAtual : this.mariscoPescado){
            double precoMariscoAtual = mariscoAtual.getPeso()*mariscoAtual.getPreco();
            total = total + precoMariscoAtual;
        }
        return total;
    }
    public double salarioTripulacao () {
        double salario = this.calcularTotal();
        salario = this.calcularTotal() * 0.6;
        return salario/this.tripulacao;
    }
}
