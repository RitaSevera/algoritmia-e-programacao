package FactoryMethod.Exercicio02;

public abstract class Taco {
    private String nome;
    private double preco;

    public Taco(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public abstract void mostrar ();

    public abstract void preparar ();
    public abstract void cozinhar ();
    public abstract void embalar ();
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
}
