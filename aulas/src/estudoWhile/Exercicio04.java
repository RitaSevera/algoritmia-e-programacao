package estudoWhile;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, contador = 0;

        System.out.println("Insira um número: ");
        num = input.nextInt();

        while (contador <= num){
            System.out.println("Números de 0 até ao escolhido: " + contador);
            contador = contador + 1;
        }
    }
}
