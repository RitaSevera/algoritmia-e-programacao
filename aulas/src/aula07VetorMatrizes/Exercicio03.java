package aula07VetorMatrizes;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array =  new int[10];
        int indice;
        int maiorNumero;

        for (indice = 0; indice < 10; indice++) {
            System.out.println("Insira um número: ");
            array [indice] = input.nextInt(); //preencho as 10 posições com valores do utilizador
        }
        maiorNumero = array [0];

        for (indice = 0; indice < 10; indice ++) {
            if (array [indice] > maiorNumero){ //array na posição atual for maior que o
                maiorNumero = array[indice];
            }
        }
        System.out.println("O maior número que escolheu: " + maiorNumero);
    }
}
