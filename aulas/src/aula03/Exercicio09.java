package aula03;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Insira 3 números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3){ // quer dizer que o valor 1 é menor que o 2 e que o 3
            System.out.println("O menor número escolhido foi:" + num1);
        }
        if (num2 < num1 && num2 < num3){
            System.out.println("O menor número escolhido foi:" + num2);
        }
        if (num3 < num1 && num3 < num2){
            System.out.println("O menor número escolhido foi:" + num3);
        }
    }
}
