package FichaPratica02_aula04;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double saldoMedio;
        System.out.println("Insira o seu saldo médio do último ano: ");
        saldoMedio = input.nextDouble();

        if (saldoMedio <=2000){
            System.out.println("O seu saldo médio é: " + saldoMedio);
            System.out.println("Não tem direiro a crédito");
        }
        if (saldoMedio > 2000 && saldoMedio <=4000){
            System.out.println("O seu saldo médio é: " + saldoMedio);
            System.out.println("Tem direito a um crédito de: " + saldoMedio*0.2);
        }
        if (saldoMedio > 4000 && saldoMedio <=6000){
            System.out.println("O seu saldo médio é: " + saldoMedio);
            System.out.println("Tem direito a um crédito de: " + saldoMedio*0.3);
        }
        if (saldoMedio >6000){
            System.out.println("O seu saldo médio é: " + saldoMedio);
            System.out.println("Tem direito a um crédito de: " + saldoMedio*0.4);
        }
    }
}

//
