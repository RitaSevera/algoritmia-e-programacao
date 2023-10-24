package aula04;

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo, debito;

        System.out.println("Insira o saldo da sua conta bancária: ");
        saldo = input.nextDouble();
        System.out.println("Qual o montante a debitar? ");
        debito = input.nextDouble();

        if (saldo + debito >= 0){
            System.out.println("O seu saldo é positivo");
        } else {
            System.out.println("O seu saldo é negativo");
        }
    }
}
