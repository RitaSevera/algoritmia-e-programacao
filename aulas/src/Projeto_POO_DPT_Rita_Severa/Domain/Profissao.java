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
    Profissao chefCozinha = new Profissao("Chef de cozinha", 80, false, 300, 4);
    Profissao massagista = new Profissao("Massagista", 50, false, 100, 4);
    Profissao lojista = new Profissao("Lojista", 40, false, 90, 4);
    Profissao empregadoMesa = new Profissao("Empregado de mesa", 20, false, 50, 3);
    Profissao paleontologo = new Profissao("Paleontólogo", 150, true, 500, 7);
    Profissao analistaDados = new Profissao("Analista de Dados", 200, true, 700, 7);
    Profissao ator = new Profissao("Ator", 30, false, 70, 4);

    public void exibirDetalhes () {
        System.out.println("Nome - " + this.nome);
        System.out.println("Salário ao dia - " + this.salarioDia);
        System.out.println("Formal - " + this.formal);
        System.out.println("Estatuto - " + this.estatuto);
        System.out.println("Nível mínimo de educação - " + this.nivelMinimoEducacao);
    }
}
