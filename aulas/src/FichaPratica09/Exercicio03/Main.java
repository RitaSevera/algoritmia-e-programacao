package FichaPratica09.Exercicio03;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo01 = new Retangulo(1.2, 1.5); //instanciar/construir

        System.out.println("\nÁrea do retângulo: ");
        retangulo01.Area();
        System.out.println();
        System.out.println("Perímetro do retângulo: ");
        retangulo01.Perimetro();
    }
}
