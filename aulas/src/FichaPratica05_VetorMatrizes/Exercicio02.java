package FichaPratica05_VetorMatrizes;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[12];
        int soma = 0;

        int indice;

        for (indice = 0; indice < 12; indice++) {
            System.out.println("Insira um valor monetário: ");
            array[indice] = input.nextInt();

        }
        soma = soma + indice;
        System.out.println("Total anual: " + soma);
    }
}
