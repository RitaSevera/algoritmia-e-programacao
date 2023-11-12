package aula07VetorMatrizes;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int[10];
        int indice;
        int media;
        int soma = 0;

        for (indice = 0; indice < 10; indice ++){ //em vez de pôr indice <10 ponho indice < vetor.length
            System.out.println("Insira um número: ");
            array [indice] =  input.nextInt();
        }
        for (indice = 0; indice < 10; indice ++) { //em vez de pôr indice <10 ponho indice < vetor.length
            soma = soma + array[indice];
        }
        media = soma / 10; //em vez de pôr /10 ponho / vetor.length
        System.out.println("A média dos seus números: " + media);
    }
}
