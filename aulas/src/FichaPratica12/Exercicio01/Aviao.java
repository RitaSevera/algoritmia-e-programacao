package FichaPratica12.Exercicio01;

public class Aviao {
    private int numeroSerie;
    private String modelo;
    private int anoFabrico;
    private double peso;
    private double comprimentoFuselagem;
    private double envergaduraAsas;
    private double alturaCauda;
    private int numeroMotores;
    private int autonomia;
    private int velocidade;
    private double preco;

    public Aviao(int numeroSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCauda, int numeroMotores, int autonomia, int velocidade, double preco) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.peso = peso;
        this.comprimentoFuselagem = comprimentoFuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.alturaCauda = alturaCauda;
        this.numeroMotores = numeroMotores;
        this.autonomia = autonomia;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    public void exibirDetalhes () {
        System.out.println("Modelo - " + this.modelo);
        System.out.println("Número de série - " + this.numeroSerie);
        System.out.println("Ano de fabrico - " + this.anoFabrico);
        System.out.println("Número de motores - " + this.numeroMotores);
        System.out.println("Capacidade de autonomia - " + this.autonomia);
        System.out.println("Velocidade máxima - " + this.velocidade);
        System.out.println("Preço - " + this.preco);
    }
}
