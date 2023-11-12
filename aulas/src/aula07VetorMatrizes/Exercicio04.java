package aula07VetorMatrizes;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] array = new int[10];
        int menorNumero;
        int indice;

        for (indice = 0; indice < 10; indice ++){
            System.out.println("Insira um número: ");
            array [indice] =  input.nextInt();
        }
        menorNumero = array[0];

        for (indice = 0; indice < 10; indice ++){
            if (array[indice] < menorNumero){
                menorNumero = array [indice];
            }
        }
        System.out.println("O menor número escolhido: " + menorNumero);
    }
}
