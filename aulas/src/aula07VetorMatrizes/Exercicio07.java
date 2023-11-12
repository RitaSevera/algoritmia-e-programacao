package aula07VetorMatrizes;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int maiorNumeroPar = 1; //tenho que inicializar com número impar


        for (int indice = 0; indice < 10; indice++) {
            System.out.println("Insira um número: ");
            array[indice] = input.nextInt();
        }

        for (int indice = 0; indice < 10; indice++) {
            if (array[indice] % 2 == 0) {
                maiorNumeroPar = array[indice];
                }
            }
        for (int indice = 0; indice < 10; indice++) {
            if (array[indice] > maiorNumeroPar && array[indice] % 2 == 0) {
                maiorNumeroPar = array[indice];
            }
        }
        if (maiorNumeroPar % 2 == 0){
            System.out.println("Maior número par: " + maiorNumeroPar);
        } else {
            System.out.println("Não há números pares");
        }
    }
}
