package Projeto_POO_DPT_Rita_Severa.Domain;

public class Propriedade {
    private String nome;
    private double custo;
    private int estatuto;

    public Propriedade(String nome, double custo, int estatuto) {
        this.nome = nome;
        this.custo = custo;
        this.estatuto = estatuto;
    }

    public void exibirDetalhes (){
        System.out.println("Nome - " + this.nome + ";" + " Custo - " + this.custo + ";" + " Estatuto - " + this.estatuto);
    }

    public String getNome() {
        return nome;
    }

    public double getCusto() {
        return custo;
    }

    public int getEstatuto() {
        return estatuto;
    }
}
