package FichaPratica11.Exercicio01;

public class Main {
    public static void main(String[] args) {
        Musica musica01 = new Musica("Casa", "POP", "Fernando Daniel", 180);
        Musica musica02 = new Musica("Prometo", "POP", "Fernando Daniel", 240);
        Musica musica03 = new Musica("Melodia da Saudade", "POP", "Fernando Daniel", 150);
        Musica musica04 = new Musica("Voltas", "POP", "Fernando Daniel", 210);
        Musica musica05 = new Musica("Tal como sou", "POP", "Fernando Daniel", 200);
        Musica musica06 = new Musica("Espera", "POP", "Fernando Daniel", 180);


        MusicPlayer radio = new MusicPlayer();
        System.out.println("##########################################################################################");
        System.out.println("               Músicas adicionadas ao nosso programa                 ");
        radio.adicionarMusicas(musica01);
        musica01.exbirDetalhes();
        radio.adicionarMusicas(musica02);
        musica02.exbirDetalhes();
        radio.adicionarMusicas(musica03);
        musica03.exbirDetalhes();
        radio.adicionarMusicas(musica04);
        musica04.exbirDetalhes();
        radio.adicionarMusicas(musica05);
        musica05.exbirDetalhes();
        radio.adicionarMusicas(musica06);
        musica06.exbirDetalhes();
        System.out.println("##########################################################################################");
        System.out.println();
        System.out.println("                Alteração da primeira música pela última           ");
        radio.trocarMusicas(0, 5);
        radio.removerMusicas(2);
        radio.imprimirRelatorio();
        System.out.println();
        System.out.println("***Duração total do nosso programa***");
        radio.duracao();
        radio.removerTodasMusicas();
        radio.duracao();
    }
}
