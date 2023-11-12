package aula07VetorMatrizes;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[4][4];
        int soma = 0;

        for (int linha = 0; linha < 4; linha ++) {
            for (int coluna = 0; coluna < 4; coluna ++){
                System.out.print("Insira números na matriz [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                //soma = soma + matriz[linha = 0][coluna = 0];
                //soma = soma + matriz[linha = 1][coluna = 1];
                //soma = soma + matriz[linha = 2][coluna = 2];
                //soma = soma + matriz[linha = 3][coluna = 3];
                if (linha==coluna){
                    soma = soma + matriz[linha][coluna];
                }
            }
            System.out.println();
        }
        System.out.println("A soma dos números na diagonal principal: " + soma);
    }
}
