package aula07VetorMatrizes;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [][] matriz = new int[3][3];
        int linha;
        int coluna;

        for (linha = 0; linha < 3; linha++) {
            for (coluna= 0; coluna < 3; coluna ++) { //enquanto for menor que 3, aumenta 1 em 1
                System.out.print("Insira números na matriz [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = input.nextInt(); //insiro o número do utilizador na linha 0, coluna 0
            }
        }
        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println(); //dá um enter e começa outra vez o for.
            //1º lê e apresenta linha 0 coluna 0 - linha 0 coluna 1 - linha 0 coluna 2, depois dá o enter, volta para o for
            // e começa a correr a linha 1 e as suas colunas
        }
    }
}
