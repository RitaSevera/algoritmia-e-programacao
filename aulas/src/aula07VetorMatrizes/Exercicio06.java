package aula07VetorMatrizes;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int indice;
        boolean crescente = true;

        for (indice = 0; indice < 10; indice++) {
            System.out.println("Insira um número: ");
            array[indice] = input.nextInt();
        }
        for (indice = 1; indice < 10; indice++) { //começo no 1 pq senão não tenho nada para comparar
            if (array[indice] <= array[indice - 1]) {
                crescente = false;
            }
        }
        if (crescente) {
            System.out.println("Os seus números estão por ordem crescente");
        } else {
            System.out.println("Os seus números não estão por ordem crescente");
        }
    }
}
