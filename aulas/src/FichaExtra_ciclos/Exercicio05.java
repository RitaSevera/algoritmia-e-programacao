package FichaExtra_ciclos;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int NUM = 50;
        int adivinha;

        System.out.println("Tente adivinhar o número escolhido (entre 1 e 100): ");
        adivinha = input.nextInt();

        if (adivinha > 0 && adivinha < 100) {
            if (adivinha >= 60) {
                System.out.println("O seu número está muito acima do escolhido");
            } else if (adivinha <= 40) {
                System.out.println("O seu número está muito abaixo do escolhido");
            } else if (adivinha > 40 && adivinha < 50 || adivinha > 50 && adivinha < 60) {
                System.out.println("O seu número está perto do escolhido");
            } else if (adivinha == NUM){
                System.out.println("Acertou no número escolhido!");
            }
        } else {
            System.out.println("Escolha um numero ente 1 e 100");
        }
        System.out.println("Tente novamente: ");
        adivinha = input.nextInt();

        if (adivinha > 0 && adivinha < 100) {
            if (adivinha >= 60) {
                System.out.println("O seu número está muito acima do escolhido\nFicou sem tentativas");
            } else if (adivinha <= 40) {
                System.out.println("O seu número está muito abaixo do escolhido\nFicou sem tentativas");
            }else if (adivinha != 50) {
                System.out.println("O seu número está perto do escolhido\nFicou sem tentativas");
            } else {
                System.out.println("Acertou no número escolhido!");
            }
        } else {
            System.out.println("Escolha um numero ente 1 e 100");
        }
    }
}
