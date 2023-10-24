package aula03;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salario;

        System.out.println("Insira o seu salário anual: ");
        salario = input.nextInt();

        if (salario <=15000) {
            System.out.println("Total de impostos que paga: " + (salario * 0.2));
        }
        else {
            System.out.println("Total de impostos que paga: " + (salario * 0.3));
        }

        //Como pus else, não tenho que pôr nenhuma condição, pq tudo o que seja diferente do if, vai ser multiplicado por 30%







    }

}
