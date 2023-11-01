package aula06ciclos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, tentativas = 0;

        do {
            System.out.println("Jogador 1, introduza um número de 0 a 100: ");
            num1 = input.nextInt();
        } while (num1 <0 || num1 >100);

// não dá para esconder o número do jogador 1, então pomos este for e ele anda para baixo (dá para ver na mesma, mas é preciso andar para cima)
        for (int i = 0; i< 50; i++){
            System.out.println();
        }

        do {
            System.out.println("Jogador 2, tente adivinhar qual o número que o jogador 1 escolher: ");
            num2 = input.nextInt();
            tentativas++;

            if (num2 < num1) {
                System.out.println("Colocou um número menor. Tente novamente!");
            } else if (num2 > num1){
                System.out.println("Colocou um número maior. Tente novamente!");
            }
        }while (num2 != num1); // 25 (num2) diferente 50 (num1)? sim, então volta para cima. quando for igual é que o ciclo pára
        System.out.println("Acertou! Precisou de " + tentativas + " tentativas.");
    }
}
