package Projeto_POO_DPT_Rita_Severa.Model;

public class AcessorioModa extends Propriedade {
    private String marca;
    private boolean isFormal;

    public AcessorioModa(String nome, double custo, int estatuto, String marca, boolean isFormal) {
        super(nome, custo, estatuto);
        this.marca = marca;
        this.isFormal = isFormal;
    }

    public AcessorioModa() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isFormal() {
        return isFormal;
    }

    public void setFormal(boolean formal) {
        isFormal = formal;
    }

    @Override
    public String toString() {
        return "+-----------------------------------------------+" +
                "\n|                ACESSÓRIO DE MODA              |" +
                "\n+-----------------------------------------------+" +
                "\n| Nome: " + super.getNome() +
                "\n| Custo: " + super.getCusto() +
                "\n| Estatuto: " + super.getEstatuto() +
                "\n| Marca: " + marca +
                "\n| É Formal? " + isFormal +
                "\n+-----------------------------------------------+";
    }
}
