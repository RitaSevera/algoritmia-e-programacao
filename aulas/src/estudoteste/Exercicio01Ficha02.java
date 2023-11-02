package estudoteste;

import java.util.Scanner;

public class Exercicio01Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();
        System.out.println("Insira outro número: ");
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("O maior número que escolheu: " + num1);
        }
        if (num1 < num2) {
            System.out.println("O segundo número que escolheu é o maior: " + num2);
        }
        if (num1 == num2) {
            System.out.println("Os números que colocou são iguais, tente novamente!");
        }
    }
}
