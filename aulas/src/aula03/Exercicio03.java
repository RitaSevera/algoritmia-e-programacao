package aula03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int salario;

        System.out.println("Coloque o seu salário anual");
        salario = input.nextInt();

        if (salario <= 15000){
            System.out.println("Paga 20% de imposto: " + (salario * 0.2));
        }
        if (salario > 15000 && salario <= 20000){
            System.out.println("Paga 30% de imposto: " + (salario * 0.3));
        }
        if (salario > 20000 && salario <= 25000) {
            System.out.println("Paga 35% de imposto: " + (salario * 0.35));
        }
        if (salario > 25000) {
            System.out.println("Paga 40% de imposto: " + (salario * 0.40));
        }
    }
}
