package Projeto_POO_DPT_Rita_Severa.Domain;

public class NPC extends Pessoa{
    private int estatuto;

    public NPC(String nome, double dinheiro, int estatuto) {
        super(nome, dinheiro);
        this.estatuto = estatuto;
    }

    public void exibirDetalhes () {
        System.out.println("Nome - " + this.nome);
        System.out.println("Dinheiro - " + this.dinheiro);
        System.out.println("Estatuto - " + this.estatuto);
    }
}
