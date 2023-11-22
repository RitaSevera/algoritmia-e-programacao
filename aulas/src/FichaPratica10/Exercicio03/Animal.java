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

    public void comer (double pesoAlimento, String alimento) {
        for (int linha = 0; linha < this.alimentacao.length; linha++){ //iterar array e comparar todos os alimentos
            if (alimento.equals(this.alimentacao[linha])){
                System.out.println("O " + this.nome + " comeu " + alimento);
                this.peso = this.peso + pesoAlimento/1000;
                System.out.println(this.peso);
                return; //encontrou, comeu e acaba o ciclo
            }// não tem else porque senão só liga a posição que eu lhe dava (ex: eu dava arroz ao tobby, arroz não é igual à posição 0 então se tivesse else dizia logo que o tobby não queria, então sem else ele percorre tudo
        }
        System.out.println("O " + this.nome + " recusou " + alimento);
        System.out.println(this.peso);
    }
    public void exibirDetalhes () {
        System.out.println("Nome - " + this.nome);
        System.out.println("Peso - " + this.peso);
    }
}
