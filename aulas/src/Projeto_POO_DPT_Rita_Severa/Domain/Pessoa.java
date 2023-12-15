package Projeto_POO_DPT_Rita_Severa.Domain;

public abstract class Pessoa {
    String nome;
    double dinheiro = 0;

    public Pessoa(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }
}
