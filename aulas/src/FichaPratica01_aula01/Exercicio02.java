package FichaPratica01_aula01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        // Invés de pôr estas variáveis todas, podia ter trocado por Resultado
        int num1, num2, soma, sub, mult, div;

        System.out.print("Insira o primeiro número: ");
        num1= input.nextInt();

        System.out.print("Insira o primeiro número: ");
        num2= input.nextInt();

        soma = num1 + num2;
        sub = num1 - num2;
        mult= num1 * num2;
        div= num1 / num2;

        // Se tivesse optado por Resultado, depois do + tinha que pôr sempre Resultado
        System.out.println("Soma é: " + soma);
        System.out.println("Subtração é: " + sub);
        System.out.println("Multiplicação é: " + mult);
        System.out.println("Divisão é: " + div);

    }
}
