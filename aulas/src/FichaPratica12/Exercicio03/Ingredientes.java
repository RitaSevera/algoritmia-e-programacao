package FichaPratica12.Exercicio03;

import FichaPratica12.Exercicio03.Enum.Medida;

public class Ingredientes {
    private int codigo;
    private String nome;
    private Medida unidadeMedia;
    private double caloriaPorUnidade;

    public Ingredientes(int codigo, String nome, Medida unidadeMedia, double caloriaPorUnidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.unidadeMedia = unidadeMedia;
        this.caloriaPorUnidade = caloriaPorUnidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Medida getUnidadeMedia() {
        return unidadeMedia;
    }

    public double getCaloriaPorUnidade() {
        return caloriaPorUnidade;
    }

    public void detalhes () {
        System.out.println(this.codigo + " | " + this.nome + " | " +  this.unidadeMedia + " | " + this.caloriaPorUnidade + "Kcal" + " | ");
    }
}
