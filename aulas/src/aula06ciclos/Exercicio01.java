package aula06ciclos;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, conta = 0;
        String escolha, continuar;

        do {
            System.out.println("Introduza dois números: ");
            num1 = input.nextDouble();
            num2 = input.nextDouble();

            System.out.println("Que operação aritmética pretende fazer? ");
            System.out.println("+ ");
            System.out.println("- ");
            System.out.println("* ");
            System.out.println("/ ");
            System.out.println("Insira uma opção: ");
            escolha = input.next();

            switch (escolha) {
                case "+":
                    conta = num1 + num2;
                    System.out.println("Escolheu a soma: " + conta);
                    break;
                case "-":
                    conta = num1 - num2;
                    System.out.println("Escolheu a subtração: " + conta);
                    break;
                case "*":
                    conta = num1 * num2;
                    System.out.println("Escolheu a multiplicação: " + conta);
                    break;
                case "/":
                    conta = num1 / num2;
                    System.out.println("Escolheu a divisão: " + conta);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            do {
                System.out.print("Deseja continuar? (s/n): ");
                continuar = input.next();
            } while (!continuar.equals("s") && !continuar.equals("n"));
        } while (!continuar.equals("n"));
    }
}
