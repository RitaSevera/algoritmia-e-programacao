package FichaExtra_ciclos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String letra;
        System.out.println("Insira uma letra do alfabeto: ");
        letra = input.next().toLowerCase();
        System.out.println(letra);

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){
            System.out.println("Escolheu uma vogal");
        } else {
            System.out.println("Escolheu uma consoante");
        }
    }
}
