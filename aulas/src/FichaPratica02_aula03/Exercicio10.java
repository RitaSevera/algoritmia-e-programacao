package FichaPratica02_aula03;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, result;
        String oper;

        System.out.println("Insira 2 números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        System.out.println("Que operação aritmética pretende fazer? ");
        oper = input.next();
// se eu fosse pôr IF, tinha que pôr equals.
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
