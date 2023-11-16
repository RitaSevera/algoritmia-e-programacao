package FichaPratica01_aula01;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        // final double porque é uma constante
        final double PI = 3.14;
        double raio, area;

        System.out.println("Coloque o raio da circunferência: ");
        raio = input.nextDouble();

        area = PI * (raio * raio);

        System.out.println("A área da circunferência é :" + area);
    }

}
