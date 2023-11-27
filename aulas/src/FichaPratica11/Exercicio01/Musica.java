package FichaPratica11.Exercicio01;

public class Musica {
    private String titulo;
    private String genero;
    private String artista;
    private int duracao;

    public Musica(String titulo, String genero, String artista, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.artista = artista;
        this.duracao = duracao;
    }
    public void exbirDetalhes () {
        System.out.println("Título - " + this.titulo + " | Género - " + this.genero + " | Artista - " + this.artista + " | Duracao - " + this.duracao + " segundos");
    }

    public int getDuracao() {
        return duracao;
    }
}
