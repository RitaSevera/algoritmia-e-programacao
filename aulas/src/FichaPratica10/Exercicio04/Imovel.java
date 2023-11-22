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

    public Imovel(String rua, int numeroPorta, String cidade, TipoImovel tipoImovel, Acabamento acabamento, double area, int numeroQuartos, int numeroCasaBanho, double areaPiscina) {
        this.rua = rua;
        this.numeroPorta = numeroPorta;
        this.cidade = cidade;
        this.tipoImovel = tipoImovel;
        this.acabamento = acabamento;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.numeroCasaBanho = numeroCasaBanho;
        this.areaPiscina = areaPiscina;
    }

    public double calcularValorImovel () {
        double precoCasaDeBanho = this.numeroCasaBanho * 10500;
        double precoQuarto = this.numeroQuartos * 7500;
        double precoPiscina = this.areaPiscina * 1000;
        double precoImovel = 0;
        double desconto = 0;

        if (this.tipoImovel.equals(TipoImovel.CASA)) {
            double preco = this.area * 3000;
            precoImovel = preco + precoQuarto + precoCasaDeBanho + precoPiscina;
            //System.out.println("Preço da casa - " + preco + " €");
            //System.out.println("Valor do incremento total de quartos - " + precoQuarto + " €");
            //System.out.println("Valor do incremento total de casas de banho - " + precoCasaDeBanho + " €");
            //System.out.println("Valor do incremento da piscina - " + precoPiscina + " €");
            //System.out.println("O preço total do seu apartamento - " + precoImovel + " €");
        } else {
            if (this.tipoImovel.equals(TipoImovel.APARTAMENTO)) {
                double preco = this.area * 1000;
                precoImovel = preco + precoQuarto + precoCasaDeBanho + precoPiscina;
            } else {
                if (this.tipoImovel.equals(TipoImovel.MANSAO)) {
                    double preco = this.area * 5000;
                    precoImovel = preco + precoQuarto + precoCasaDeBanho + precoPiscina;
                }
            }
        }
        if (this.acabamento.equals(Acabamento.RESTAURO)) {
            desconto = precoImovel * 0.5;
            precoImovel = precoImovel - desconto;
            //System.out.println("Preço a pagar - " + precoImovel);
        } else {
            if (this.acabamento.equals(Acabamento.USADA)) {
                desconto = precoImovel * 0.1;
                precoImovel = precoImovel - desconto;
                //System.out.println("Preço a pagar - " + precoImovel);
            } else {
                if (this.acabamento.equals(Acabamento.NOVA)) {
                    //System.out.println("Preço a pagar - " + precoImovel);
                } else {
                    if (this.acabamento.equals(Acabamento.NOVA_COM_ALTO_ACABAMENTO)){
                        desconto = precoImovel * 0.25;
                        precoImovel = precoImovel + desconto;
                        //System.out.println("preço a pagar - " + precoImovel);
                    }
                }
            }
        }
        return precoImovel;
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
    public Imovel compararImoveis (Imovel imovelComparar){
        if (this.calcularValorImovel() > imovelComparar.calcularValorImovel()) {
            return this;
        } else {
            if (this.calcularValorImovel() < imovelComparar.calcularValorImovel()) {
                return imovelComparar;
            } else {
                return null;
            }
        }
    }
}
