package Projeto_POO_DPT_Rita_Severa.Domain;

import java.util.ArrayList;

public class Jogador extends Pessoa{
    private Objetivo objetivoVida;
    private Profissao profissao = null;
    private int necessidadeDormir = 100;
    private int necessidadeRefeicao = 100;
    private int necessidadeSocial = 100;
    private int estatuto = 0; //será a soma de todos os estatutos das suas propriedades
    private int educacao = 0; //Nível de formação
    private ArrayList<Propriedade> propriedades; //aqui estão listadas todas as propriedades
    private ArrayList<NPC> familia; //será a família do meu jogador

    public Jogador(String nome, Objetivo objetivoVida) {
        super(nome);
        this.objetivoVida = objetivoVida;
        this.propriedades = new ArrayList<>();
        this.familia = new ArrayList<>();
    }

    public Objetivo getObjetivoVida() {
        return objetivoVida;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public int getNecessidadeDormir() {
        return necessidadeDormir;
    }

    public int getNecessidadeRefeicao() {
        return necessidadeRefeicao;
    }

    public int getNecessidadeSocial() {
        return necessidadeSocial;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public int getEducacao() {
        return educacao;
    }

    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }

    public ArrayList<NPC> getFamilia() {
        return familia;
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
        for (NPC npcAtual : familia) {
            npcAtual.exibirDetalhes();
        }
    }
}
