package FichaPratica01_aula02;

import java.util.Scanner;

public class Correção08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutosTotais, segundosTotais, segundosTotaisAlbum, horas, minutos, segundos;

        System.out.println("Insira os minutos da música 1: ");
        minutosTotais = input.nextInt();
        System.out.println("Insira os segundos da música 1: ");
        segundosTotais = input.nextInt();

        // ao input eu adiciono os segundos totais que o utilizador já deu antes, se não fizer, os segundos da música 1 deixavam de existir e eram subsituídos pelos segundos da música 2
        System.out.println("Insira os minutos da música 2: ");
        minutosTotais = minutosTotais + input.nextInt();
        System.out.println("Insira os segundos da música 2: ");
        segundosTotais = segundosTotais + input.nextInt();

        System.out.println("Insira os minutos da música 3: ");
        minutosTotais = minutosTotais + input.nextInt();
        System.out.println("Insira os segundos da música 3: ");
        segundosTotais = segundosTotais + input.nextInt();

        System.out.println("Minutos totais: " + minutosTotais);
        System.out.println("Segundos totais: " + segundosTotais);

        // Carcular o total de segundos do álbum / Tenho que pegar no total do álbum em minutos para segundos e depois somo os segundos que já existiam
        segundosTotaisAlbum = (minutosTotais * 60) + segundosTotais;
        System.out.println("Segundos totais do álbum: " + segundosTotaisAlbum);

        // Calcular horas
        horas = segundosTotaisAlbum / 3600;
        System.out.println("H: " + horas);

        // Calcular minutos
        minutos = segundosTotaisAlbum / 60;
        System.out.println("M: " + minutos);

        // Calcular os segundos
        segundos = segundosTotaisAlbum;
        System.out.println(horas + "H " + minutos + "M " + segundos + "S ");
    }

    }
