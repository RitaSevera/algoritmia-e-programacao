package Projeto_POO_DPT_Rita_Severa.Domain;

public class AcessorioModa extends Propriedade{
    private String marca;
    private boolean formal;

    public AcessorioModa(String nome, double custo, int estatuto, String marca, boolean formal) {
        super(nome, custo, estatuto);
        this.marca = marca;
        this.formal = formal;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isFormal() {
        return formal;
    }
}
