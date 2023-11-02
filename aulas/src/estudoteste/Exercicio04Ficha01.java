package estudoteste;

import java.util.Scanner;

public class Exercicio04Ficha01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double area, raio;
        final double PI = 3.14;

        System.out.println("Insira o raio da circunferência: ");
        raio = input.nextDouble();

        area = PI * (raio * raio);
        System.out.println("A área do retângulo: " + area);
    }
}
