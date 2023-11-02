package estudoteste;

import java.util.Scanner;

public class Exercicio07Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        if(num % 2 == 0){
            System.out.println("Escolheu um número par.");
        }else {
            System.out.println("Escolheu um número impar.");
        }
    }
}
