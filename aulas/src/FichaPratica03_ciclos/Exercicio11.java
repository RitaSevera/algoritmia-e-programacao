package FichaPratica03_ciclos;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 0, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;

        while (num >= 0){
            System.out.println("Insira um número: ");
            num = input.nextInt();

            if (num >= 0 && num <= 25){
                contador1++;
            }
            if (num >= 26 && num <= 50){
                contador2++;
            }
            if (num >= 51 && num <= 75){
                contador3++;
            }
            if (num >= 76 && num <= 100){
                contador4++;
            }
        }
        System.out.println("Quantidade de números de 0 até 25: " + contador1);
        System.out.println("Quantidade de números de 26 até 50: " + contador2);
        System.out.println("Quantidade de números de 51 até 75: " + contador3);
        System.out.println("Quantidade de números de 76 até 100: " + contador4);
    }
}
