package FichaPratica02_aula04;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int horas, minutos;

        System.out.println("Introduza horário em 24h");
        System.out.println("Horas:");
        horas = input.nextInt();
        System.out.println("Minutos: ");
        minutos = input.nextInt();

        if (horas >= 0 && horas <= 11 ){
            System.out.println(horas + ":" + minutos + "AM");
        }
        if (horas >= 12 && horas <=23 ){
            System.out.println(horas + ":" + minutos + "PM");
        } else{
            System.out.println("Introduziu uma hora inválida");
        }
    }
}
