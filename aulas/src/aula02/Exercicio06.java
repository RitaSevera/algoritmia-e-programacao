package aula02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2, troca;

        System.out.print("Insira o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.print("Insira o segundo valor: ");
        valor2 = input.nextInt();

        troca = valor1;
        valor1 = valor2;
        valor2 = troca;

        System.out.println("Troca do primeiro valor: " + valor1);
        System.out.println("Troca do segundo valor: " + valor2);

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

        System.out.println("Troca novamento do primeiro valor: " + valor1);
        System.out.println("Troca novamente do segundo valor: " + valor2);

    }
}
