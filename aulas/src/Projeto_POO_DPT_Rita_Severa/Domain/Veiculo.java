package Projeto_POO_DPT_Rita_Severa.Domain;

public class Veiculo extends Propriedade{
    private String marca;
    private String modelo;

    public Veiculo(String nome, String marca, String modelo) {
        super(nome);
        this.marca = marca;
        this.modelo = modelo;
    }
}
