package FichaPratica03_ciclos;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, seguinte, anterior;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        seguinte = num + 5;
        anterior = num - 5;

        while (anterior < num) {
            System.out.println(anterior);
            anterior = anterior + 1;
        }

        num++;
        System.out.println(); // Isto está aqui para dar um espaço entre os 5 números

        while (num < seguinte){
            System.out.println(num);
            num++;
        }
    }
}
