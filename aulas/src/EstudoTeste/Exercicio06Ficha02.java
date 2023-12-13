package EstudoTeste;

import java.util.Scanner;

public class Exercicio06Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Insira um número: ");
        num1 = input.nextInt();
        System.out.println("Insira outro número: ");
        num2 = input.nextInt();

        if (num1 < num2){
            System.out.println("Número maior: " + num2 + " Número menor: " + num1);
        }else {
            System.out.println("Número maior: " + num1 + " Número menor: " + num2);
        }
    }
}
