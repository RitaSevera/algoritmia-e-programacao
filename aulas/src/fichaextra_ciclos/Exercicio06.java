package fichaextra_ciclos;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Crie um programa que solicite um ano e verifique se ele é bissexto (Tem 366 dias e acontece de 4 e 4 anos).
        int ano;

        System.out.println("Indique um ano que tenha sido significativo para si: ");
        ano = input.nextInt();

        if (ano % 4 == 0){
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("Não escolheu um ano bissexto");
        }
    }
}
