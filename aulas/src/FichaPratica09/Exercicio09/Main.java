package FichaPratica09.Exercicio09;

public class Main {
    public static void main(String[] args) {

        Produto produto01 = new Produto("Telemóvel", 850.90);

        System.out.println(produto01.getStock()); //0 é o meu stock inicial
        produto01.comprar(5);
        System.out.println(produto01.getStock()); //depois compro 5, por isso fico com 5
        produto01.vender(2);
        System.out.println(produto01.getStock()); //vendo 2, fico com 3
        produto01.comprar(10);
        System.out.println(produto01.getStock()); //compro 10, fico com 13
        produto01.vender(35); //não tenho stock, pq só tenho 13, então não posso comprar
    }
}
