package Projeto_POO_DPT_Rita_Severa.Domain;

public class AcessorioModa extends Propriedade{
    private String marca;
    private boolean formal;

    public AcessorioModa(String nome, String marca, boolean formal) {
        super(nome);
        this.marca = marca;
        this.formal = formal;
    }
}
