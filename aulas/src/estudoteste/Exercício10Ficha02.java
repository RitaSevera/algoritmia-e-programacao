package estudoteste;

import java.util.Scanner;

public class Exercício10Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, soma, divisao, multiplicacao, subtracao;
        String oper;

        System.out.println("Insira dois números: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        System.out.println("Que operação aritmética (+; -; *; /) pretende fazer? ");
        oper = input.next();

        switch (oper){
            case "+":
                soma = num1 + num2;
                System.out.println("Escolheu a soma: " + soma);
             break;
            case "-":
                subtracao = num1 - num2;
                System.out.println("Escolheu a subtração: " + subtracao);
            break;
             case "*":
                multiplicacao = num1 * num2;
                System.out.println("Escolheu a multiplicação: " + multiplicacao);
            break;
            case "/":
                divisao = num1 / num2;
                System.out.println("Escolheu a divisão: " + divisao);
                break;
            default:
                System.out.println("Opção inválida. Tem que colocar uma das opções: +; -; *; / ");
            }
        }
    }
