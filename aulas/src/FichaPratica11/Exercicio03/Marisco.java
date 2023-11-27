package FichaPratica11.Exercicio03;

public class Marisco {
    private String especie;
    private double peso;
    private double preco;

    public Marisco(String especie, double peso, double preco) {
        this.especie = especie;
        this.peso = peso;
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco() {
        return preco;
    }

    public String getEspecie() {
        return especie;
    }
}
