package aula03;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salario; //podia ter criado variável taxa

        System.out.println("Coloque o seu salário anual");
        salario = input.nextDouble();

        if (salario <= 15000){
            //se tivesse a variável taxa punha a conta aqui: taxa=salario*0.2;
            System.out.println("Paga 20% de imposto: " + (salario * 0.2));//aqui punha + taxa e não a conta que fiz
        }
        if (salario > 15000 && salario <= 20000){
            System.out.println("Paga 30% de imposto: " + (salario * 0.3));
        }
        if (salario > 20000 && salario <= 25000) {
            System.out.println("Paga 35% de imposto: " + (salario * 0.35));
        }
        if (salario > 25000) {
            System.out.println("Paga 40% de imposto: " + (salario * 0.40));
        }
    }
}
