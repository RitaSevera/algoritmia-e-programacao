package EstudoTeste;

import java.util.Scanner;

public class Exercicio09Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Insira 3 números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3){
            System.out.println("O menor número que escolheu: " + num1);
        }
        if (num2 < num1 && num2 < num3){
            System.out.println("O menor número que escolheu: " + num2);
        }
        if (num3 < num1 && num3 < num2){
            System.out.println("O menor número que escolheu: " + num3);
        }
    }
}
