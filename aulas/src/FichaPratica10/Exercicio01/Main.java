package FichaPratica10.Exercicio01;

public class Main {
    public static void main(String[] args) {

        Carro carro01 = new Carro("BMW", "X5", 2020, 280, 2.998, tipoCombustivel.GASOLINA, 8);
        Carro carro02 = new Carro("Mercedes", "Classe A", 1999,192,2000, tipoCombustivel.GASOLINA, 4);

        System.out.println(carro01.getMarca());
        carro01.Ligar();
        System.out.println();
        System.out.println(carro02.getMarca());
        carro02.Ligar();
        System.out.println();
        System.out.println("Vencedor da corrida: ");
        carro01.corrida(carro02).exibirDetalhes();
        System.out.println();
        System.out.println("O seu consumo nesta viagem: " + carro01.getMarca() + " " +  carro01.consumo(97) + " litros");
        System.out.println("O seu consumo nesta viagem: " + carro02.getMarca() + " " +  carro02.consumo(97) + " litros");
    }
}
