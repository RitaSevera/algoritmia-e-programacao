package FichaPratica09.Exercicio09;

public class Produto {
    private String nome;
    private double preco;
    private int stock = 0; //como inicializei, não vou ter que pôr no main este valor

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void comprar (int quantidade) {
        this.stock += quantidade;//acrescento a quantidade ao stock
    }
    public void vender (int quantidade) {

        if (quantidade <= this.stock) {
            this.stock-=quantidade;
        } else {
            System.out.println("A sua compra não é possível, não temos stock suficiente");
        }
    }
    public int getStock() {
        return stock;
    }
}
