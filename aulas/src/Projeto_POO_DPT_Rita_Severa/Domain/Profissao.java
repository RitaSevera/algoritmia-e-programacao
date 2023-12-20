package Projeto_POO_DPT_Rita_Severa.Domain;

public class Profissao {
    private String nome;
    private double salarioDia;
    private boolean formal;
    private int estatuto;
    private int nivelMinimoEducacao;

    public Profissao(String nome, double salarioDia, boolean formal, int estatuto, int nivelMinimoEducacao) {
        this.nome = nome;
        this.salarioDia = salarioDia;
        this.formal = formal;
        this.estatuto = estatuto;
        this.nivelMinimoEducacao = nivelMinimoEducacao;
    }

    public void exibirDetalhes () {
        System.out.println("Nome - " + this.nome);
        System.out.println("Salário ao dia - " + this.salarioDia);
        System.out.println("Formal - " + this.formal);
        System.out.println("Estatuto - " + this.estatuto);
        System.out.println("Nível mínimo de educação - " + this.nivelMinimoEducacao);
    }
}
