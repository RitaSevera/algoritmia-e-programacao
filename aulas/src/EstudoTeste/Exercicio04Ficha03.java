package EstudoTeste;

import java.util.Scanner;

public class Exercicio04Ficha03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, contagem = 0;

        System.out.println("Insira um número: ");
        num = input.nextInt();
        contagem = contagem + 1;

        while (contagem <= num){
            System.out.println(contagem);
            contagem = contagem + 1;
        }
    }
}
