package FichaPratica10.Exercicio04;

public class Imovel {
    private String rua;
    private int numeroPorta;
    private String cidade;
    private TipoImovel tipoImovel;
    private Acabamento acabamento;
    private double area;
    private int numeroQuartos;
    private int numeroCasaBanho;
    private double areaPiscina;

    public void calcularValorImovel () {
        double precoQuartos = numeroQuartos +7500;


    }
    public void imprimirDescricao () {
        System.out.println("Tipo de imóvel - " + this.tipoImovel);
        System.out.println("Acabamento - " + this.acabamento);
        System.out.println("Área - " + this.area);
        System.out.println("Número de quartos - " + this.numeroQuartos);
        System.out.println("Número de casas de banho - " + this.numeroCasaBanho);
    }

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }
}
