package FichaPratica01_aula01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        // Instanciar o Scanner (dizer que vai ter o input do utilizador)
        Scanner input = new Scanner (System.in);

        // Declarar variávies
        int num1, num2, soma;

        // Ler num1
        System.out.print("Insira o primeiro número: ");
        num1 = input.nextInt();

        // Ler num2
        System.out.print("Insira o segundo número: ");
        num2 = input.nextInt();

        // Calcular a somar de num1+num2
        soma = num1 + num2;

        // Apresentar a soma
        System.out.println("O seu resultado é: " + soma);
    }
}
