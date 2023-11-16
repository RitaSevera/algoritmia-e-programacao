package FichaPratica05_VetorMatrizes;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][5];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                System.out.println("Insira números na matriz [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Insira outro número: ");
        int num = input.nextInt();

        int contador = 0;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (num == matriz[linha][coluna]) {
                    contador++;
                }
            }
        }
        System.out.println("O número " + num + " aparece " + contador + " vezes na matriz. ");
    }
}
