package estudoteste;

import java.util.Scanner;

public class Exercicio03Ficha01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area, perimetro, largura, comprimento;

        System.out.println("Insira o comprimento do retângulo: ");
        comprimento = input.nextDouble();
        System.out.println("Insira a largura do retângulo: ");
        largura = input.nextDouble();

        area = comprimento * largura;
        System.out.println("A área do retângulo: " + area);
        perimetro = 2 * (comprimento + largura);
        System.out.println("O perimetro do retângulo: " + perimetro);
    }
}
