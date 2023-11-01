package aula05ciclos;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, salto, contador = 0;

        System.out.println("Insira um número limite: ");
        num = input.nextInt();
        System.out.println("Insira um salto: ");
        salto = input.nextInt();

        while (contador <= num){ // eu quero chegar de 0 a 15 de 4 em 4. 0 menor ou igual a 15? Sim, logo imprimo 0 e somo 4. 4 é menor ou igual que 15? Sim, logo imprime o 8. 8 menor ou igual que 15? Sim, então imprime o 12.
            System.out.println(contador);
            contador = contador + salto;
        }
    }
}
