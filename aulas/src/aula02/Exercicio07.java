package aula02;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double preco1, preco2, preco3, desc, valor;

        System.out.print("Insira o primeiro preço: ");
        preco1 = input.nextDouble();

        System.out.print("Insira o segundo preço: ");
        preco2 = input.nextDouble();

        System.out.print("Insira o terceiro preço: ");
        preco3 = input.nextDouble();

        desc = (preco1 + preco2 + preco3) * 0.10;
        System.out.println("O desconto é: " + desc);

        valor = (preco1 + preco2 + preco3) - desc;
        System.out.println("O preço final é: " + valor);


    }

}
