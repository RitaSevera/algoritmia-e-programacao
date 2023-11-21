package FichaPratica09.Exercicio02;

public class Cao {
    private String nome;
    private String raca;
    private String latido = "Au au au";

    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }
    public void ladrar () {//este método imprime na consola o latido já definido
        System.out.println(latido);
    }

    public void setLadrar (String latido) {//método para poder alterar o latido
        this.latido = latido;
    }
}
