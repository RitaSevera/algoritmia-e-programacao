package EstudoTeste;

import java.util.Scanner;

public class Exercicio15Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valor1, valor2, valor3;
        String escolha;

        System.out.println("Insira 3 números: ");
        valor1 = input.nextInt();
        valor2 = input.nextInt();
        valor3 = input.nextInt();

        System.out.println("Pretende ver os seus números por ordem crescente (C) ou decrescente (D) ?");
        escolha = input.next();

        if (escolha.equalsIgnoreCase("D")) {
            if (valor1 > valor2 && valor2 > valor3) {
                System.out.println("Os seus números por ordem decrescente: " + valor1 + " " + valor2 + " " + valor3);
            }
            if (valor1 > valor2 && valor3 > valor2) {
                System.out.println("Os seus números por ordem decrescente: " + valor1 + " " + valor3 + " " + valor2);
            }
            if (valor2 > valor1 && valor1 > valor3) {
                System.out.println("Os seus números por ordem decrescente: " + valor2 + " " + valor1 + " " + valor2);
            }
            if (valor2 > valor1 && valor3 > valor1) {
                System.out.println("Os seus números por ordem decrescente: " + valor2 + " " + valor3 + " " + valor1);
            }
            if (valor3 > valor2 && valor2 > valor1) {
                System.out.println("Os seus números por ordem decrescente: " + valor3 + " " + valor2 + " " + valor1);
            }
            if (valor3 > valor2 && valor1 > valor2) {
                System.out.println("Os seus números por ordem decrescente: " + valor3 + " " + valor1 + " " + valor2);
            } else if (escolha.equalsIgnoreCase("C")) {
                if (valor1 < valor2 && valor2 < valor3) {
                    System.out.println("Os seus números por ordem crescente: " + valor1 + " " + valor2 + " " + valor3);
                }
                if (valor1 < valor2 && valor3 < valor2) {
                    System.out.println("Os seus números por ordem crescente: " + valor1 + " " + valor3 + " " + valor2);
                }
                if (valor2 < valor1 && valor1 < valor3) {
                    System.out.println("Os seus números por ordem crescente: " + valor2 + " " + valor1 + " " + valor2);
                }
                if (valor2 < valor1 && valor3 < valor1) {
                    System.out.println("Os seus números por ordem crescente: " + valor2 + " " + valor3 + " " + valor1);
                }
                if (valor3 < valor2 && valor2 < valor1) {
                    System.out.println("Os seus números por ordem crescente: " + valor3 + " " + valor2 + " " + valor1);
                }
                if (valor3 < valor2 && valor1 < valor2) {
                    System.out.println("Os seus números por ordem crescente: " + valor3 + " " + valor1 + " " + valor2);
                } else {
                    System.out.println("Tem que optar por: D (ordem decrescente) ou C (ordem crescente)");
                }
            }
        }
    }
}