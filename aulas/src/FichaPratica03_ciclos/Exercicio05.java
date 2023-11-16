package FichaPratica03_ciclos;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.print("Insira dois números: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
// num1= 10; num2=20. aparece o 10 (<=20? sim) então aparece o 11 (<=20? sim) então aparece o 12, até ao 20. 21 é <=20? não, então o ciclo pára
        while (num1 <= num2){
            System.out.println(num1); // O número 1 é o que é apresentado primeiro na consola até chegar ao limite (número 2)
            num1++; // num1 = num1 + 1 // num1 += num1
        }
    }
}
