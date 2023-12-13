package FichaExtra_ciclos;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, result;
        System.out.println("Insira o seu peso (em kg): ");
        peso = input.nextDouble();

        result = peso * 0.16;

        if (peso >0){
            System.out.println("O seu peso na lua é:" + result);
        } else {
            System.out.println("Insira um peso superior a 0");
        }
    }
}
