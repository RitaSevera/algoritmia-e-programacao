package aula01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        double area, perimetro, comp, alt;

        System.out.println("Coloque a altura do retângulo: ");
        alt = input.nextDouble();

        System.out.println("Coloque o comprimento do retângulo: ");
        comp = input.nextDouble();

        area = comp * alt;
        perimetro = (comp + alt) * 2;

        System.out.println("A área é : " + area);
        System.out.println("O perímetro é: " + perimetro);
    }
}
