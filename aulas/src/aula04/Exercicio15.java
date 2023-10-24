package aula04;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //este input fomos nós que escolhemos a palavra, podia ser qlq outra
//Escreva um programa que leia 3 números, seguidamente deve perguntar ao utilizador se quer ordem crescente
//‘C’ ou decrescente ‘D’, e deve colocar os números no ecrã por ordem decrescente ou crescente de acordo com a
//escolha
        int num1, num2, num3;
        String escolha;

        System.out.println("Introduza 3 números");
        num1 = input.nextInt(); // se tivesse escolhido outra palavra no scanner em vez de input, era isso que punha aqui (ex:rita.nextInt())
        num2 = input.nextInt();
        num3 = input.nextInt();
        System.out.println("Quer apresentá-los por ordem crescente (C) ou decrescente (D)?");
        escolha = input.next();

        if (escolha.equals("D")) {//escolha.equalsIgnoreCase() isto ignora as maiúsculas e minúsculas
            if (num1 > num2 && num2 > num3) {
                System.out.println("Os seus números por ordem decrescente: " + num1 + " " + num2 + " " + num3);
            }
            if (num1 > num2 && num3 > num2) {
                System.out.println("Os seus números por ordem decrescente: " + num1 + " " + num3 + " " + num2);
            }
            if (num2 > num1 && num1 > num3) {
                System.out.println("Os seus números por ordem decrescente: " + num2 + " " + num1 + " " + num3);
            }
            if (num2 > num1 && num3 > num1) {
                System.out.println("Os seus números por ordem decrescente: " + num2 + " " + num3 + " " + num1);
            }
            if (num3 > num2 && num2 > num1) {
                System.out.println("Os seus números por ordem decrescente: " + num3 + " " + num2 + " " + num1);
            }
            if (num3 > num2 && num1 > num2) {
                System.out.println("Os seus números por ordem decrescente: " + num3 + " " + num1 + " " + num2);
            }
        } else if (escolha.equals("C")) {
            if (num1 < num2 && num2 < num3){
                System.out.println("Os seus números por ordem crescente: " + num1 + " " + num2 + " " + num3);
            }
            if (num1 < num2 && num3 < num2){
                System.out.println("Os seus números por ordem crescente: " + num1 + " " + num3 + " " + num2);
            }
            if (num2 < num1 && num1 < num3){
                System.out.println("Os seus números por ordem crescente: " + num2 + " " + num1 + " " + num3);
            }
            if (num2 < num1 && num3 < num1){
                System.out.println("Os seus números por ordem crescente: " + num2 + " " + num3 + " " + num1);
            }
            if (num3 < num2 && num2 < num1){
                System.out.println("Os seus números por ordem crescente: " + num3 + " " + num2 + " " + num1);
            }
            if (num3 < num2 && num1 < num2){
                System.out.println("Os seus números por ordem crescente: " + num3 + " " + num1 + " " + num2);
            }
        } else {
            System.out.println("Tem que optar por: D (ordem decrescente) ou C (ordem crescente)");
        }
    }
}
