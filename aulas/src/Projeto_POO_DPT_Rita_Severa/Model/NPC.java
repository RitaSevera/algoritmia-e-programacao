package Projeto_POO_DPT_Rita_Severa.Model;

public class NPC extends Pessoa{
    private int estatutoMinimo;

    public NPC(String nome, double dinheiro, int estatutoMinimo) {
        super(nome, dinheiro);
        this.estatutoMinimo = estatutoMinimo;
    }

    public NPC() {
    }

    public int getEstatutoMinimo() {
        return estatutoMinimo;
    }

    public void setEstatutoMinimo(int estatutoMinimo) {
        this.estatutoMinimo = estatutoMinimo;
    }

    @Override
    public String toString() {
        return "\n############################################" +
                "\n|                   NPCs                   |" +
                "\n+------------------------------------------+" +
                "\n| Name: " + super.getNome() +
                "\n| Dinheiro: " + super.getDinheiro() +
                "\n| Estatuto Mínimo: " + estatutoMinimo +
                "\n+-------------------------------------------+";
    }
}
