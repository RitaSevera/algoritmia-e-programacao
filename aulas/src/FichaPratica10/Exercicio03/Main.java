package FichaPratica10.Exercicio03;

public class Main {
    public static void main(String[] args) {

        String [] alimentacaoTobby = new String[3];
        alimentacaoTobby[0] = "frango";
        alimentacaoTobby[1] = "arroz";
        alimentacaoTobby[2] = "racao";

        Animal animal01 = new Animal("Tobby", "Cão", "Portugal", 28.5, alimentacaoTobby);
        Animal animal02 = new Animal("Kuiko", "Gato", "Portugal", 10, new String[] {"Whiskas", "bolos", "frango"});

        animal01.exibirDetalhes();
        animal01.comer(300, "frango");
        System.out.println();
        animal01.comer(500, "porco");
        System.out.println();
        animal02.exibirDetalhes();
        animal02.comer(200, "frango");
        System.out.println();
        animal02.comer(100, "Comida seca");
    }
}
