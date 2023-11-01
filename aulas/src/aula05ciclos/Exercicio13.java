package aula05ciclos;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAtual, numAnterior, quantidade, contador = 1;
        boolean crescente = true;

        System.out.println("Quantos números deseja inserir: ");
        quantidade = input.nextInt();

        System.out.println("Insira um número: ");
        numAnterior = input.nextInt();

        while (contador < quantidade) {
            System.out.println("Insira um número: ");
            numAtual = input.nextInt();

            if (numAnterior >= numAtual) {
                System.out.println("Entrou no if, deixa de ser crescente");
                crescente = false;
            }
            numAnterior = numAtual;
            contador++;
        }
        if (crescente) {
            System.out.println("Crescente");
        } else {
            System.out.println("Não crescente");
        }
    }
}
