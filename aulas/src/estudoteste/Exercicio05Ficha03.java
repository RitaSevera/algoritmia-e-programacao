package estudoteste;

import java.util.Scanner;

public class Exercicio05Ficha03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira dois números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();

        while (num1 <= num2){
            System.out.println(num1);
            num1 = num1 + 1;
        }
    }
}
