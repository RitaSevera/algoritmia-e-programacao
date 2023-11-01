package aula05ciclos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, contagem = 0;

        System.out.print("Insira um número: "); //fazer a condição até chegar a este número, sendo que começamos a 0
        num = input.nextInt();

        while (contagem <= num ){ //contador é menor ou igual ao número?
            System.out.println(contagem);
            contagem = contagem + 1;
        }
    }
}
