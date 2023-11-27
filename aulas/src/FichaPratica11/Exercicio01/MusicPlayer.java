package FichaPratica11.Exercicio01;

import FichaPratica11.Exercicio01.Musica;

import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList <Musica> programacao = new ArrayList<Musica>() ;

    public MusicPlayer() {
        this.programacao = new ArrayList<>();
    }
    public void adicionarMusicas (Musica musicaNova) {
        this.programacao.add(musicaNova);
    }
    public void trocarMusicas (int linha00, int linha05) {
        Musica musica01 = this.programacao.get(linha00);
        Musica musica06 = this.programacao.get(linha05);

        this.programacao.set(linha00, musica06);
        this.programacao.set(linha05, musica01);
    }
    public void removerMusicas (Musica musicaRemover) {//aqui removo pondo o nome da música
        this.programacao.remove(musicaRemover);
    }
    public void removerMusicas (int linha) {//aqui removo pondo a linha que quero remover
        this.programacao.remove(linha);
    }
    public void removerTodasMusicas () {
        this.programacao.clear();
    }
    public void  imprimirRelatorio () {
        for (int linha = 0; linha < this.programacao.size(); linha ++) {
            Musica musicaAtual = this.programacao.get(linha);
            System.out.print("Música " + (linha+1) + ": ");
            musicaAtual.exbirDetalhes();
        }
    }
    public void duracao () {
        int totalSegundos = 0;

        for (Musica musicaAtual : this.programacao) {
            totalSegundos = totalSegundos + musicaAtual.getDuracao();//getDuracao para conseguir saber a duração das músicas
        }
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println("Duração total: " + horas + ":" + minutos + ":" + segundos);
    }

}
