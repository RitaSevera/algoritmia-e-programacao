package aula01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double area, perimetro, comp, larg;

        System.out.println("Coloque a largura do retângulo: ");
        larg = input.nextDouble();

        System.out.println("Coloque o comprimento do retângulo: ");
        comp = input.nextDouble();

        area = comp * larg;
        perimetro = (comp + larg) * 2;

        System.out.println("A área é : " + area);
        System.out.println("O perímetro é: " + perimetro);
    }
}
