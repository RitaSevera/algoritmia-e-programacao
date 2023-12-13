package EstudoTeste;

import java.util.Scanner;

public class Exercicio02Ficha01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma, mult, div, sub;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();
        System.out.println("Insira outro número: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        System.out.println("A soma dos seus números: " + soma);

        sub = num1 - num2;
        System.out.println("A divisão dos seus números: " + sub);

        mult = num1 * num2;
        System.out.println("A multiplicação dos seus números: " + mult);

        div = num1 / num2;
        System.out.println("A divisão dos seus números: " + div);
    }
}
