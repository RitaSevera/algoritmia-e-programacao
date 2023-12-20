package Projeto_POO_DPT_Rita_Severa.Domain;

public class NPC extends Pessoa{
    private int estatutoMinimo;

    public NPC(String nome, int estatuto) {
        super(nome);
        this.estatutoMinimo = estatuto;
    }

    public void exibirDetalhes () {
        System.out.println("Nome - " + this.nome);
        System.out.println("Dinheiro - " + this.dinheiro);
        System.out.println("Estatuto - " + this.estatutoMinimo);
    }
}
