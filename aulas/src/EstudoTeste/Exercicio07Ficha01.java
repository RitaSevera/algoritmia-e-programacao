package EstudoTeste;

import java.util.Scanner;

public class Exercicio07Ficha01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double produto1, produto2, produto3, total, desconto, preco;

        System.out.println("Insira o preço das bananas: ");
        produto1 = input.nextDouble();;
        System.out.println("Insira o preço do café: ");
        produto2 = input.nextDouble();
        System.out.println("Insira o preço da água: ");
        produto3 = input.nextDouble();

        preco = produto1 + produto2 + produto3;
        desconto = preco * 0.10;
        System.out.println("O total da sua compra será: " + desconto);

        total = preco - desconto;
        System.out.println("O valor final da sua compra após o desconto de 10%: " + total);
    }
}
