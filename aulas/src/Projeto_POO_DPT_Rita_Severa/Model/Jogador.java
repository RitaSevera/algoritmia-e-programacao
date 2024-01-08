package Projeto_POO_DPT_Rita_Severa.Model;

import java.util.ArrayList;

public class Jogador extends Pessoa{
    private ObjetivoVida objetivoVida;
    private Profissao profissao = null;
    private int necessidadeSono = 100;
    private int necessidadeRefeicao = 100;
    private int necessidadeSocial = 100;
    private int estatuto = 0;
    private int educacao = 0;
    private ArrayList<Propriedade> propriedades;
    private ArrayList<NPC> familia;

    public Jogador(String nome, double dinheiro, ObjetivoVida objetivoVida, Profissao profissao, int necessidadeSono, int necessidadeRefeicao, int necessidadeSocial, int estatuto, int educacao) {
        super(nome, dinheiro);
        this.objetivoVida = objetivoVida;
        this.profissao = profissao;
        this.necessidadeSono = necessidadeSono;
        this.necessidadeRefeicao = necessidadeRefeicao;
        this.necessidadeSocial = necessidadeSocial;
        this.estatuto = estatuto;
        this.educacao = educacao;
        this.propriedades = new ArrayList<>();
        this.familia = new ArrayList<>();
    }

    public Jogador() {
    }

    public ObjetivoVida getObjetivoVida() {
        return objetivoVida;
    }

    public void setObjetivoVida(ObjetivoVida objetivoVida) {
        this.objetivoVida = objetivoVida;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public int getNecessidadeSono() {
        return necessidadeSono;
    }

    public void setNecessidadeSono(int necessidadeSono) {
        this.necessidadeSono = necessidadeSono;
    }

    public int getNecessidadeRefeicao() {
        return necessidadeRefeicao;
    }

    public void setNecessidadeRefeicao(int necessidadeRefeicao) {
        this.necessidadeRefeicao = necessidadeRefeicao;
    }

    public int getNecessidadeSocial() {
        return necessidadeSocial;
    }

    public void setNecessidadeSocial(int necessidadeSocial) {
        this.necessidadeSocial = necessidadeSocial;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public void setEstatuto(int estatuto) {
        this.estatuto = estatuto;
    }

    public int getEducacao() {
        return educacao;
    }

    public void setEducacao(int educacao) {
        this.educacao = educacao;
    }

    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }

    public void addPropriedade(Propriedade propriedade) {
        this.propriedades.add(propriedade);
    }

    public ArrayList<NPC> getFamilia() {
        return familia;
    }

    public void setFamilia(ArrayList<NPC> familia) {
        this.familia = familia;
    }
    public void addFamilia(NPC npc) { this.familia.add(npc); }

    @Override
    public String toString() {
        return "\n############################################" +
                "\n|          Detalhes da personagem:         |" +
                "\n+------------------------------------------+" +
                "\n| Name: " + super.getNome() +
                "\n| Dinheiro: " + super.getDinheiro() +
                "\n| Objetivo de vida: " + objetivoVida +
                "\n| Profissao: " + profissao +
                "\n| Necessidade de sono: " + necessidadeSono +
                "\n| Necessidade de refeicao: " + necessidadeRefeicao +
                "\n| Necessidade de social: " + necessidadeSocial +
                "\n| Estatuto: " + estatuto +
                "\n| Educação: " + educacao +
                "\n| Propriedades: " + propriedades +
                "\n| Familia: " + familia +
                "\n+-------------------------------------------+";
    }
}
