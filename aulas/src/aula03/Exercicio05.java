package aula03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira dois números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.println(num2 + " " + num1);
        } else {
            System.out.println("Número menor " + num1 + " Número maior " + num2);
        }
    }
}
