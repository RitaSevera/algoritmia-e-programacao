package FactoryMethod.Exercicio02;

public class TacoVaca extends Taco {
    public TacoVaca(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Escolheu um taco de vaca. Bom proveito!");
    }

    @Override
    public void preparar() {
        System.out.println("A preparar o seu taco " + super.getNome());
    }

    @Override
    public void cozinhar() {
        System.out.println("A cozinhar o seu taco " + super.getNome());
    }

    @Override
    public void embalar() {
        System.out.println("A embalar o seu taco " +super.getNome());
    }
}
