package estudoteste;

import java.util.Scanner;

public class Exercicio03Ficha02 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            double salario;

            System.out.println("Insira o seu salário anual: ");
            salario = input.nextDouble();

            if (salario <= 15000) {
                System.out.println("Total de impostos: " + salario * 0.2);
            }
            if (salario > 15000 && salario <= 20000){
                System.out.println("Total de impostos: " + salario * 0.3);
            }
            if (salario > 20000 && salario <= 25000){
                System.out.println("Total de impostos: " + salario * 0.35);
            }
            if (salario > 25000){
                System.out.println("Total de impostos: " + salario * 0.40);
            }
    }
}
