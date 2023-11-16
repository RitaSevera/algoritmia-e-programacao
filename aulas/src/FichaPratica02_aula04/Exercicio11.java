package FichaPratica02_aula04;

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double saldo, movimento; //saldofinal

        System.out.println("Insira o saldo da sua conta bancária: ");
        saldo = input.nextDouble();
        System.out.println("Qual o montante a debitar/creditar? ");
        movimento = input.nextDouble();
//saldofinal = saldo + movimento
        if (saldo + movimento >= 0){ //if (saldofinal>=0)}
            System.out.println("O seu saldo é positivo"); //sout("operação válida. Saldo final" + saldofinal)
        } else {
            System.out.println("O seu saldo é negativo"); //sout("operação inválida. saldo final" + saldofinal)
        }
    }
}
