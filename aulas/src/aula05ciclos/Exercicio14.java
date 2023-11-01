package aula05ciclos;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, fatorial = 0;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        fatorial = num;
        num--;

        if (num <0){
            System.out.println("Insira um número positivo.");
        }
        while (num >0){
            fatorial = fatorial * (num);
            num--;
        }
        System.out.println("Fatorial:" + fatorial);
        }
    }
