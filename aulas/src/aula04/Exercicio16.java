package aula04;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int euros, notas;
        System.out.println("Insira um valor em euros");
        euros = input.nextInt();

        if (euros % 5 == 0){
            notas = euros / 200;
            System.out.println("Notas de 200:" + notas);
            euros = euros % 200;

            notas = euros / 100;
            System.out.println("Notas de 100:" + notas);
            euros = euros % 100;

            notas = euros / 50;
            System.out.println("Notas de 50:" + notas);
            euros = euros % 50;

            notas = euros / 20;
            System.out.println("Notas de 20:" + notas);
            euros = euros % 20;

            notas = euros / 10;
            System.out.println("Notas de 10:" + notas);
            euros = euros % 10;

            notas = euros / 5;
            System.out.println("Notas de 5:" + notas);
            euros = euros % 5;
        } else {
            System.out.println("O valor inserido não é múltiplo de 5");
        }
    }
}
