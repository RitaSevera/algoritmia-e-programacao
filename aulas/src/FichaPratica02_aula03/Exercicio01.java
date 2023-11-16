package FichaPratica02_aula03;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();

        System.out.println("Insira outro número: ");
        num2 = input.nextInt();

        // Se o número 1 for maior que o número 2, então o maior é o número 1
        if (num1 > num2) {
            System.out.println("O primeiro número que escolheu é o maior: " + num1);
        }
        // Se o número 1 for menor do que o número 2, então o maior é o número 2
        if (num1 < num2) {
            System.out.println("O segundo número que escolheu é o maior: " + num2);
        }
        if (num1 == num2) {
            System.out.println("Os números que colocou são iguais, tente novamente!");
        }
    }
}
