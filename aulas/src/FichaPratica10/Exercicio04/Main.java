package FichaPratica10.Exercicio04;

public class Main {
    public static void main(String[] args) {

        Imovel imovel01 = new Imovel("Rua 01", 101,"Gaia", TipoImovel.APARTAMENTO, Acabamento.USADA, 70, 3, 2, 0);
        Imovel imovel02 = new Imovel("Rua 02", 102, "Porto", TipoImovel.CASA, Acabamento.NOVA_COM_ALTO_ACABAMENTO, 90, 2, 2, 20);
        //Imovel imovel03 = new Imovel("Rua 03", 103, "Ermesinda", TipoImovel.MANSAO, Acabamento.USADA, 4000, 20, 10, 10);

        System.out.println("#############################################################");
        System.out.println("                      VENDA                                  ");
        imovel01.imprimirDescricao();
        System.out.println("                      PREÇO                                 ");
        System.out.println(imovel01.calcularValorImovel());
        System.out.println("################################################################");

        //System.out.println();
        //imovel01.setAcabamento(Acabamento.NOVA);
        //imovel01.imprimirDescricao();
        //System.out.println();
        //imovel01.calcularValorImovel();
        System.out.println();
        System.out.println("                   A casa mais cara:                          ");
        imovel01.compararImoveis(imovel02).imprimirDescricao();
    }
}
