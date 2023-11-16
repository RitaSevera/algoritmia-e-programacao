package FichaPratica02_aula03;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira dois números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println("Número maior " + num2 + " Número menor " + num1);
        }
    }
}
