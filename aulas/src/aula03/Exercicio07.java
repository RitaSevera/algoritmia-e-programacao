package aula03;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Inseriu um número par");
        } else {
            System.out.println("Inseriu um número impar");
        }
    }
}
