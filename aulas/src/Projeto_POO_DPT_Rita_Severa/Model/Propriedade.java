package Projeto_POO_DPT_Rita_Severa.Model;

public class Propriedade {
    private String nome;
    private double custo;
    private int estatuto;

    public Propriedade(String nome, double custo, int estatuto) {
        this.nome = nome;
        this.custo = custo;
        this.estatuto = estatuto;
    }

    public Propriedade() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public void setEstatuto(int estatuto) {
        this.estatuto = estatuto;
    }

    @Override
    public String toString() {
        return "\nPropriedade - [" +
                "\nNome: " + nome  +
                "\nCusto: " + custo +
                "\nEstatuto: " + estatuto +
                "\n] ";
    }
}
