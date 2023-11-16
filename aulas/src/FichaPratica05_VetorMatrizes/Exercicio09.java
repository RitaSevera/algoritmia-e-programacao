package FichaPratica05_VetorMatrizes;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[5][5];
        int soma = 0;

        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna ++) {
                System.out.print("Insira números na matriz [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt();
                soma = soma + matriz[linha][coluna];
            }
        }
        for (int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
            }
        }
        System.out.println("A soma dos números: " + soma);
    }
}
