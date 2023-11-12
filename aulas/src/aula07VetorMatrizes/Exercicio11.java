package aula07VetorMatrizes;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][3];
        int maiorNumero, menorNumero;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna ++) {
                System.out.print("Insira números na matriz [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
        maiorNumero = matriz [0][0];
        menorNumero = matriz [0][0];

        for (int linha = 0; linha < 3; linha ++){
            for (int coluna = 0; coluna < 3; coluna ++){
                if (matriz[linha][coluna] > maiorNumero){
                    maiorNumero = matriz[linha][coluna];
                } else if (matriz[linha][coluna] < menorNumero){
                    menorNumero = matriz[linha][coluna];
                }
            }
        }
        System.out.println("O maior número que escolheu: " + maiorNumero);
        System.out.println("O menor número que escolheu: " + menorNumero);
    }
}
