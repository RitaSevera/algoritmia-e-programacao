package estudoteste;

import java.util.Scanner;

public class Exercicio02Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Insira o seu sálario: ");
        salario = input.nextDouble();

        if (salario <= 15000){
            imposto = salario * 0.20;
            System.out.println("Irá pagar de impostos 20%: " + imposto);
        } else {
            imposto = salario * 0.30;
            System.out.println("Irá pagar de impostos 30%: " + imposto);
        }
    }
}
