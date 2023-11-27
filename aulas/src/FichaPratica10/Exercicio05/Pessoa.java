package FichaPratica10.Exercicio05;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private int numeroTelemovel;

    public Pessoa(String nome, int idade, String email, int numeroTelemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.numeroTelemovel = numeroTelemovel;
    }

    public void exibirDetalhes () {
        System.out.println("Nome - " + this.nome);
    }
}
