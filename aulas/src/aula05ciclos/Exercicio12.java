package aula05ciclos;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numInicio, numFim;

        System.out.print("Insira dois números: ");
        numInicio = input.nextInt();
        numFim = input.nextInt();

        while (numInicio <= numFim) {
            if (numInicio % 5 == 0){
                System.out.println(numInicio);
            }
            numInicio++;
        }
    }
}
