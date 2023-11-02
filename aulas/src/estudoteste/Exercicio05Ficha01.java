package estudoteste;

import java.util.Scanner;

public class Exercicio05Ficha01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor1, valor2, valor3, mediaA, mediaP;

        System.out.println("Insira a sua nota de português: ");
        valor1 = input.nextDouble();
        System.out.println("Insira a sua nota de matemática: ");
        valor2 = input.nextDouble();
        System.out.println("Insira a sua nota de história: ");
        valor3 = input.nextDouble();

        mediaA = (valor1 + valor2 + valor3) / 3;
        System.out.println("A sua média aritmética é: " + mediaA);

        mediaP = (valor1 * 0.2) + (valor2 * 0.3) + (valor3 * 0.5);
        System.out.println("A sua média ponderada:" + mediaP);
    }
}
