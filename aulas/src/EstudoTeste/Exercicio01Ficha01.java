package EstudoTeste;

import java.util.Scanner;

public class Exercicio01Ficha01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, soma;
        System.out.println("Insira um número à sua escolha: ");
        num1 = input.nextInt();
        System.out.println("Insira outro número à sua escolha: ");
        num2 = input.nextInt();

        soma = num1 + num2;
        System.out.println("A soma dos seus números: " + soma);
    }
}
