package FichaPratica11.Exercicio02;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa("Rita", 26, 915080555, "ritasevera@hotmail.com");
        Pessoa pessoa02 = new Pessoa("Ariana", 17, 915080777, "ariana@hotmail.com");
        Pessoa pessoa03 = new Pessoa("Renata", 23, 918090765, "renata@hotmail.com");
        Pessoa pessoa04 = new Pessoa("Nuno", 27, 918090766, "nuno@hotmail.com");
        Pessoa pessoa05 = new Pessoa("Vicente", 16, 918090734, "vicente@hotmail.com");

        Sorteio telemovel = new Sorteio(588.90);

        System.out.println("########################################################");
        System.out.println("        A nossa lista de candidatos        ");
        telemovel.adicionarParticipante(pessoa01);
        telemovel.adicionarParticipante(pessoa02);
        telemovel.adicionarParticipante(pessoa03);
        telemovel.adicionarParticipante(pessoa04);
        telemovel.adicionarParticipante(pessoa05);
        System.out.println("##########################################################");
        System.out.println();
        System.out.println("##########################################################");
        System.out.println("        A nossa lista de participantes        ");
        telemovel.imprimirLista();
        System.out.println("##########################################################");
        System.out.println();
        System.out.println("##########################################################");
        System.out.println("                 Grande Vencedor             ");
        Pessoa vencedor = telemovel.sortear();
        vencedor.exibirDetalhes();
        System.out.println("##########################################################");
    }
}
