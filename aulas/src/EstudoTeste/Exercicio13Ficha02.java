package EstudoTeste;

import java.util.Scanner;

public class Exercicio13Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.println("Insira as horas: ");
        horas = input.nextInt();
        System.out.println("Insira os minutos: ");
        minutos = input.nextInt();

        if (horas <= 12) { // AM
            System.out.println(horas + ":" + minutos + " AM");
        } else { // PM
            horas = horas - 12;
            System.out.println(horas + ":" + minutos + " PM");
        }
    }
}

