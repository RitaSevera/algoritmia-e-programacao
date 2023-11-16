package FichaPratica04_ciclos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Um número primo é aquele que é divisível apenas por 1 e por ele mesmo.
        int num;
        boolean primo = true;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        for (int divisor = 2; divisor < num; divisor++){
            if (num % divisor == 0){
                //System.out.println("Número deixou de ser primo");
                primo = false;
            }
        }
        if (primo){
            System.out.println("É um número primo");
        } else {
            System.out.println("Não é um número primo");
        }
    }
}