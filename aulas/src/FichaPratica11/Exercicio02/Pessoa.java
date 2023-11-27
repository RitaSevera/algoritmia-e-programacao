package FichaPratica11.Exercicio02;

public class Pessoa {
    private String nome;
    private int idade;
    private int contacto;
    private String email;

    public Pessoa(String nome, int idade, int contacto, String email) {
        this.nome = nome;
        this.idade = idade;
        this.contacto = contacto;
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public int getContacto() {
        return contacto;
    }

    public String getEmail() {
        return email;
    }
    public void exibirDetalhes () {
        System.out.println( this.nome + " | " + this.idade + " | " + this.contacto + " | " + this.email);

    }
}
