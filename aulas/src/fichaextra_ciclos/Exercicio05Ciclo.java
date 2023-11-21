package fichaextra_ciclos;

import java.util.Random;
import java.util.Scanner;

public class Exercicio05Ciclo {
    public static void main(String[] args) {
        Random random = new Random();
        int luckyNumber = random.nextInt(1, 100);
        int adivinha, tentativas = 2;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("#------------------------------------------#");
            System.out.println("+         Número de tentativas: " + tentativas + "          +");
            System.out.println("#------------------------------------------#\n");
            System.out.println("Insira um número (1 - 100): ");
            adivinha = input.nextInt();

            tentativas -= 1;

            if (adivinha >= 1 && adivinha <= 100) {
                if (adivinha == luckyNumber) {
                    System.out.println("PARABÉNS!! Acertou no número: " + luckyNumber);
                } else {
                    if (adivinha > luckyNumber) {
                        if (adivinha - luckyNumber > 10) {
                            System.out.println("Está longe do número correto!");
                        } else if (adivinha - luckyNumber < 10) {
                            System.out.println("Está perto do número correto!");
                        }
                    } else {
                        if (luckyNumber - adivinha > 10) {
                            System.out.println("Está longe do número correto!");
                        } else if (luckyNumber - adivinha < 10) {
                            System.out.println("Está perto do número correto!");
                        }
                    }
                }
            } else {
                System.out.println("ERRO: Digita um número ente 1 e 100!");
            }
            if (tentativas == 0) {
                System.out.println("O número correto era o: " + luckyNumber);
            }
        } while (adivinha != luckyNumber && tentativas > 0);
    }
}
