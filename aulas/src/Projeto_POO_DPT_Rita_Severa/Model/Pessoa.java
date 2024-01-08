package Projeto_POO_DPT_Rita_Severa.Model;

public class Pessoa {
    private String nome;
    private double dinheiro = 0;

    public Pessoa(String nome, double dinheiro) {
        this.nome = nome;
        this.dinheiro = dinheiro;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "Pessoa = [" +
                "nome: '" + nome + '\'' +
                ", dinheiro: " + dinheiro +
                " " + ']';
    }
}
