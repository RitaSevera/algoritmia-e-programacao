package aula03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
        // realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
        //a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro

        int num1, num2, result;
        String oper;

        System.out.println("Insira 2 números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Que operação aritmética pretende fazer? ");
        oper = input.next();

        switch (oper) {
            case "+":
                result = num1 + num2;
                System.out.println("A sua soma é: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("A sua subtração é: " + result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("A sua divisão é: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("A sua multiplicação é: " + result);
                break;
            default:
                System.out.println("Não colocou a operação aritmética corretamente, terá de ser com os símbolos: +; -; /; *");
        }
    }
}
