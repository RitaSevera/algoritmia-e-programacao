package Projeto_POO_DPT_Rita_Severa.Domain;

public class Imovel extends Propriedade{
    private int capacidadePessoas;

    public Imovel(String nome, int capacidadePessoas) {
        super(nome);
        this.capacidadePessoas = capacidadePessoas;
    }
}
