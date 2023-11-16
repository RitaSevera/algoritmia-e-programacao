package FichaPratica02_aula04;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Insira o 3 números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 < num2 && num2 < num3){
            System.out.println("Os seus números por ordem crescente: " + num1 + " " + num2 + " " + num3);
        }
        if (num1 < num2 && num3 < num2){
            System.out.println("Os seus números por ordem crescente: " + num1 + " " + num3 + " " + num2);
        }
        if (num2 < num1 && num1 < num3){
            System.out.println("Os seus números por ordem crescente: " + num2 + " " + num1 + " " + num3);
        }
        if (num2 < num1 && num3 < num1){
            System.out.println("Os seus números por ordem crescente: " + num2 + " " + num3 + " " + num1);
        }
        if (num3 < num2 && num2 < num1){
            System.out.println("Os seus números por ordem crescente: " + num3 + " " + num2 + " " + num1);
        }
        if (num3 < num2 && num1 < num2){
            System.out.println("Os seus números por ordem crescente: " + num3 + " " + num1 + " " + num2);
        }
    }
}
