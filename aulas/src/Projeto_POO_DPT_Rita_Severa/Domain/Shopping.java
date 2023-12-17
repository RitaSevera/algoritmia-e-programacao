package Projeto_POO_DPT_Rita_Severa.Domain;

import java.util.ArrayList;

public class Shopping {
    private String tipo;
    private String nome;
    private int estatuto;
    private int lotacaoMaxima;
    private String marca;
    private String modelo;
    private boolean formal;

    public Shopping(String tipo, String nome, int estatuto, int lotacaoMaxima, String marca, String modelo, boolean formal) {
        this.tipo = tipo;
        this.nome = nome;
        this.estatuto = estatuto;
        this.lotacaoMaxima = lotacaoMaxima;
        this.marca = marca;
        this.modelo = modelo;
        this.formal = formal;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getEstatuto() {
        return estatuto;
    }

    public int getLotacaoMaxima() {
        return lotacaoMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isFormal() {
        return formal;
    }

    public void exibirDetalhesShopping (){
        System.out.println(this.tipo + this.nome + this.estatuto + this.lotacaoMaxima + this.marca + this.modelo + this.formal);
    }
}
