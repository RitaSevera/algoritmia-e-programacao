package FichaPratica10.Exercicio03;

public class Main {
    public static void main(String[] args) {
        Animal animal01 = new Animal("Tobby", "Cão", "Portugal", 78.5, new String[] {"frango", "arroz", "racao"});
        Animal animal02 = new Animal("Kuiko", "Gato", "Portugal", 10, new String[] {"Whiskas", "bolos", "frango"});

        animal01.exibirDetalhes();
        animal01.comer(100, "frango");
        System.out.println();
        animal01.comer(100, "porco");
        System.out.println();
        animal02.exibirDetalhes();
        animal02.comer(200, "frango");
        System.out.println();
        animal02.comer(100, "Comida seca");
    }
}
