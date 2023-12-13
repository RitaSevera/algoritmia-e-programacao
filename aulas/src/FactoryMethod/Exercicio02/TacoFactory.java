package FactoryMethod.Exercicio02;

public class TacoFactory {
    public static Taco criarTaco (String tipoTaco, String nome, double preco) {

        tipoTaco = tipoTaco.toLowerCase();

        switch (tipoTaco) {
            case "vaca":
                return new TacoVaca(nome, preco);
            case "frango":
                return new TacoFrango(nome, preco);
            case "vegetariano":
                return new TacoVeg(nome, preco);
            default:
                throw new IllegalArgumentException("Tipo de Produto Inválido: "+tipoTaco);
        }
    }
}
