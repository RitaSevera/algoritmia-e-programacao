package FichaPratica12.Exercicio03;

public class Ingredientepizza {
    private Ingredientes ingrediente;
    private double quantidade;

    public Ingredientepizza(Ingredientes ingrediente, double quantidade) {
        this.ingrediente = ingrediente;
        this.quantidade = quantidade;
    }

    public Ingredientes getIngrediente() {
        return ingrediente;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setIngrediente(Ingredientes ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    public void exibir () {
        this.ingrediente.detalhes();
        System.out.println(this.quantidade + " ");

        switch (this.ingrediente.getUnidadeMedia()){
            case GRAMAS:
                System.out.println("g.");
                break;
            case UNIDADES:
                System.out.println("uni.");
                break;
            case LITROS:
                System.out.println("L. ");
                break;
        }
    }
}
