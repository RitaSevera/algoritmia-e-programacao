package Projeto_POO_DPT_Rita_Severa.Model;

public class Veiculo extends Propriedade{
    private String marca;
    private String modelo;

    public Veiculo(String nome, double custo, int estatuto, String marca, String modelo) {
        super(nome, custo, estatuto);
        this.marca = marca;
        this.modelo = modelo;
    }

    public Veiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "+-----------------------------------------------+" +
                "\n|                    VEÍCULO                    |" +
                "\n+-----------------------------------------------+" +
                "\n| Nome: " + super.getNome() +
                "\n| Custo: " + super.getCusto() +
                "\n| Estatuto: " + super.getEstatuto() +
                "\n| Marca: " + marca  +
                "\n| Modelo: " + modelo +
                "\n+-----------------------------------------------+";
    }
}
