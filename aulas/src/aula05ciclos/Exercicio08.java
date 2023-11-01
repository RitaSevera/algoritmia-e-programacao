package aula05ciclos;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0, soma = 0, contador = 0, media = 0;

        while (num != -1) {
            System.out.println("Insira um número: ");
            num = input.nextInt();
            soma = soma + num;
            contador ++;
        }
        soma ++;
        System.out.println("Soma" + soma);
    }
}
