package FichaPratica12.Exercicio03;

import FichaPratica12.Exercicio03.Enum.Tamanho;

import java.util.ArrayList;

public class Pizza {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private Tamanho tamanhoPizza;
    private ArrayList<Ingredientepizza> ingredientes;


    public Pizza(int codigo, String nome, String descricao, double preco, Tamanho tamanhoPizza) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanhoPizza = tamanhoPizza;
        this.ingredientes = new ArrayList<>();
    }
    public void adicionarIngrediente (Ingredientepizza ingredienteNovo){
        if (this.ingredientes.size()<=5) {
            this.ingredientes.add(ingredienteNovo);
        }
    }
    public void alterarQuantidade (Ingredientes ingrediente, double quantidade) {
        for (Ingredientepizza ingredientepizzaAtual : this.ingredientes) {
            if (ingredientepizzaAtual.getIngrediente()==ingrediente) {
                ingredientepizzaAtual.setQuantidade(quantidade);
            }
        }
    }
    /*public void removerIngrediente (int codigoRemover) {
        for (Ingredientepizza ingredientePizzaAtual : this.ingredientes){
            if (ingredientePizzaAtual.getIngrediente().getCodigo().equals(codigoRemover)) {
                this.ingredientes.remove(ingredientePizzaAtual);
                return;
            }
        }
    }*/
    public double numeroCalorias (){
        double totalCalorias = 0;
        for (Ingredientepizza ingredienteAtual : this.ingredientes) {
            double quantidadeAtual = ingredienteAtual.getQuantidade();
            double caloriaAtual = ingredienteAtual.getIngrediente().getCaloriaPorUnidade();
            double kcalAtual = quantidadeAtual*caloriaAtual;
            totalCalorias = totalCalorias + kcalAtual;
        }
        return totalCalorias;
    }
    public void exibirDetalhes () {
        System.out.println("******* " + this.nome + " *******");
        System.out.println("Código - " + this.codigo);
        System.out.println("Descrição - " + this.descricao);
        System.out.println("Preço - " + this.preco + "€");
        System.out.println("Tamanho - " + this.tamanhoPizza);
        for (int linha = 0; linha < this.ingredientes.size(); linha ++) {
            Ingredientepizza ingredienteAtual = this.ingredientes.get(linha);
            System.out.print("Ingrediente " + (linha + 1) + " - ");
            ingredienteAtual.exibir();
        }
    }
}
