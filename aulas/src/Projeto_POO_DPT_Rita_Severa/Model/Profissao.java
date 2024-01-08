package Projeto_POO_DPT_Rita_Severa.Model;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioDia() {
        return salarioDia;
    }

    public void setSalarioDia(double salarioDia) {
        this.salarioDia = salarioDia;
    }

    public boolean isFormal() {
        return formal;
    }

    public void setFormal(boolean formal) {
        this.formal = formal;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public void setEstatuto(int estatuto) {
        this.estatuto = estatuto;
    }

    public int getNivelMinimoEducacao() {
        return nivelMinimoEducacao;
    }

    public void setNivelMinimoEducacao(int nivelMinimoEducacao) {
        this.nivelMinimoEducacao = nivelMinimoEducacao;
    }

    @Override
    public String toString() {
        return "\n+-------------------------------------------------+" +
                "\n|                   Profissão                     |" +
                "\n+-------------------------------------------------+" +
                "\n| Nome: " + nome +
                "\n| Salário Dia: " + salarioDia +
                "\n| É formal: " + formal +
                "\n| Estatuto: " + estatuto +
                "\n| Nivel minimo de educação: " + nivelMinimoEducacao +
                "\n+-------------------------------------------------+";
    }
}
