package Projeto_POO_DPT_Rita_Severa.Model;

public class Imovel extends Propriedade {
    private int capacidadePessoas;

    public Imovel(String nome, double custo, int estatuto, int capacidadePessoas) {
        super(nome, custo, estatuto);
        this.capacidadePessoas = capacidadePessoas;
    }

    public Imovel() {
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    @Override
    public String toString() {
        return "+-----------------------------------------------+" +
                "\n|                     IMÓVEL                    |" +
                "\n+-----------------------------------------------+" +
                "\n| Nome: " + super.getNome() +
                "\n| Custo: " + super.getCusto() +
                "\n| Estatuto: " + super.getEstatuto() +
                "\n| Capacidade de pessoas: " + capacidadePessoas +
                "\n+-----------------------------------------------+";
    }
}
