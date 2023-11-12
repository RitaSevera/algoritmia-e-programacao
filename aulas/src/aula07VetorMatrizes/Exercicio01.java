package aula07VetorMatrizes;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] vetor = new int[10]; //Fazer array com 10 posições

        // Ler vetor //indice é número da gaveta
        for (int indice = 0; indice < 10; indice ++){
            System.out.print("Insira um número no Vetor["+ indice+"]: ");
            vetor [indice] = input.nextInt();
        }
        // Imprimir o vetor
        for (int indice = 0; indice < 10; indice ++){
            System.out.println(vetor [indice]);
        }
    }
}
