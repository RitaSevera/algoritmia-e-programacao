package FichaExtra_ciclos;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double valor, desconto;
        System.out.println("Insira o valor do produto: ");
        valor = input.nextDouble();

        if (valor > 100){
            desconto = valor * 0.10;
            valor = valor - desconto;
            System.out.println("Terá um desconto de 10%." + valor);
        } else {
            System.out.println("Para ter desconto, teria de fazer uma compra superior a 100€");
        }
    }
}
