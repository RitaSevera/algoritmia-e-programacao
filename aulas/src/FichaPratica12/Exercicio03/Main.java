package FichaPratica12.Exercicio03;

import FichaPratica12.Exercicio03.Enum.Medida;
import FichaPratica12.Exercicio03.Enum.Tamanho;

public class Main {
    public static void main(String[] args) {

        Pizza pizza01 = new Pizza(2324, "Camponesa", "Pizza feita no campo", 7.5, Tamanho.MEDIA);

        Ingredientes ingredientes01 = new Ingredientes(3433, "Azeitonas", Medida.GRAMAS, 1.5);
        Ingredientes ingredientes02 = new Ingredientes(4546, "Molho tomate", Medida.LITROS, 250);
        Ingredientes ingredientes03 = new Ingredientes(5756, "Pimento", Medida.GRAMAS, 2.8);

        pizza01.adicionarIngrediente(new Ingredientepizza(ingredientes01, 200));
        pizza01.adicionarIngrediente(new Ingredientepizza(ingredientes02, 0.100));
        pizza01.adicionarIngrediente(new Ingredientepizza(ingredientes03, 300));
        pizza01.exibirDetalhes();
        System.out.println("Total de calorias da sua pizza - " + pizza01.numeroCalorias() + "Kcal");
        System.out.println();
        pizza01.alterarQuantidade(ingredientes02, 0.80);
    }
}