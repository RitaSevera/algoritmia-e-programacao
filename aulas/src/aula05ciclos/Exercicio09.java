package aula05ciclos;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numescolhido, num = 2;

        System.out.println("Insira um número: ");
        numescolhido = input.nextInt();

        while (num <= numescolhido){
            System.out.println("Números pares até ao número que escolheu: " + num);
            num = num + 2;
        }
    }
}
