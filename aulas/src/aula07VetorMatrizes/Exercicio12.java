package aula07VetorMatrizes;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array1 = new int[10];
        int [] array2 = new int[10];
        int [][] matriz = new int[10][2];

        for (int indice = 0; indice < 10; indice ++){
            System.out.print("Insira um número no Array 1 ["+ indice+"]: ");
            array1 [indice] = input.nextInt();
        }
        for (int indice = 0; indice < 10; indice ++){
            System.out.print("Insira um número no Array 2 ["+ indice+"]: ");
            array2 [indice] = input.nextInt();
        }
        for (int indice = 0; indice < 10; indice ++){
            matriz [indice][0] = array1[indice];
            matriz [indice][1] = array2[indice];
        }
        System.out.println("Matriz");
        for (int indice = 0; indice < 10; indice ++) {
            System.out.print(matriz[indice][0] + " " + matriz[indice][1]);
        }
    }
}
