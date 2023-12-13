package FactoryMethod.Exercicio02;

public class TacoFrango extends Taco{
    public TacoFrango(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrar() {
        System.out.println("Escolheu um taco de frango. Bom proveito!");
    }

    @Override
    public void preparar() {
        System.out.println("A preparar o seu taco " + super.getNome());
    }

    @Override
    public void cozinhar() {
        System.out.println("A cozinhar o seu taco " +super.getNome());
    }

    @Override
    public void embalar() {
        System.out.println("A embalar o seu taco " + super.getNome());
    }
}
