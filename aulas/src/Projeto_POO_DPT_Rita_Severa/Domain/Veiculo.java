package Projeto_POO_DPT_Rita_Severa.Domain;

public class Veiculo extends Propriedade{
    private String marca;
    private String modelo;

    public Veiculo(String nome, double custo, int estatuto, String marca, String modelo) {
        super(nome, custo, estatuto);
        this.marca = marca;
        this.modelo = modelo;
    }
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Marca - " + this.marca);
        System.out.println("Modelo - " + this.modelo);
    }
}
