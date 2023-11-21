package FichaPratica10.Exercicio03;

public class Animal {
    private String nome;
    private String especie;
    private String paisOrigem;
    private double peso;
    private String [] alimentacao;

    public Animal(String nome, String especie, String paisOrigem, double peso, String[] alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public void comer (double peso, String alimento) {
        for (int linha = 0; linha < this.alimentacao.length; linha++){
            if (alimento.equals(this.alimentacao[linha])){
                System.out.println("O animal comeu");
                this.peso = this.peso + peso/100;
                System.out.println(this.peso);
                System.out.println("O animal recusou essa comida");
                System.out.println(this.peso);
                return;
            }
        }
    }
    public void exibirDetalhes () {
        System.out.println("Nome - " + this.nome);
        System.out.println("Peso - " + this.peso);
    }
}
