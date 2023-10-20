package aula02;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Não era preciso ter distinguido as médias aqui, porque são contas distintas, pq não preciso do valor que dá para o resto do problema
        double num1, num2, num3, mediaA, mediaP;

        System.out.print("Insira o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Insira o segundo número: ");
        num2 = input.nextDouble();

        System.out.print("Insira o terceiro número: ");
        num3 = input.nextDouble();

        mediaA = (num1 + num2 + num3) / 3;
        System.out.println("A média aritmética é: " + mediaA);

        //Esta formúla deveria de ser: (num1 * 0.2 + num2 * 0.3 + num3 * 0.5) / (0.2 + 0.3 + 0.5);
        //Não é preciso a última conta porque ia estar a dividir por 1 (resultado é o mesmo)
        mediaP = (num1 * 0.2 + num2 * 0.3 + num3 * 0.5);
        System.out.println("A média ponderada é: " + mediaP);

    }
}
