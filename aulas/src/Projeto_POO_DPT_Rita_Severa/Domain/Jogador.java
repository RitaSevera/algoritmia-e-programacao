package Projeto_POO_DPT_Rita_Severa.Domain;

import java.util.ArrayList;

public class Jogador extends Pessoa{
    private Objetivo objetivoVida;
    private Profissao profissao;
    private int necessidadeDormir = 100;
    private int necessidadeRefeicao = 100;
    private int necessidadeSocial = 100;
    private int estatuto = 0;
    private int educacao = 0;
    private ArrayList<Propriedade> propriedades;
    private ArrayList<NPC> familia;

    public Jogador(String nome, double dinheiro, Objetivo objetivoVida, Profissao profissao, int necessidadeDormir, int necessidadeRefeicao, int necessidadeSocial, int estatuto, int educacao) {
        super(nome, dinheiro);
        this.objetivoVida = objetivoVida;
        this.profissao = profissao;
        this.necessidadeDormir = necessidadeDormir;
        this.necessidadeRefeicao = necessidadeRefeicao;
        this.necessidadeSocial = necessidadeSocial;
        this.estatuto = estatuto;
        this.educacao = educacao;
        this.propriedades = new ArrayList<>();
        this.familia = new ArrayList<>();
    }

    public void exibirDetalhes() {
        System.out.println("Nome - " + this.nome);
        System.out.println("Saldo da sua conta - " + this.dinheiro);
        System.out.println("O seu objetivo de vida - " + this.objetivoVida);
        System.out.println("A sua profissão - " + this.profissao);
        System.out.println("Os seus níveis de sono - " + necessidadeDormir);
        System.out.println("Os seus níveis alimentares - " + this.necessidadeRefeicao);
        System.out.println("A sua necessidade de se divertir - " + this.necessidadeSocial);
        System.out.println("O seu estatuto - " + this.estatuto);
        System.out.println("O seu nível de formação - " + this.educacao);
        System.out.println("As suas propriedades - " + this.propriedades);
        for (int linha = 0; linha < this.propriedades.size(); linha++){
            Propriedade propriedadeAtual = this.propriedades.get(linha);
            System.out.println("Propriedades " + (linha+1) + " - ");
            propriedadeAtual.exibirDetalhes();
        }
        System.out.println("A sua linda família - " + this.familia);
    }
}
