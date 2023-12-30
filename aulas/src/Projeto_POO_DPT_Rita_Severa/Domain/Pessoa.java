package Projeto_POO_DPT_Rita_Severa.Domain;

public abstract class Pessoa {
    protected String nome;
    protected double dinheiro = 0;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
