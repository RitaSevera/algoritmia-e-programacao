package aula03;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3, mediaP;

        System.out.println("Insira a sua nota de português: ");
        nota1 = input.nextInt();
        System.out.println("Insira a sua nota de inglês: ");
        nota2 = input.nextInt();
        System.out.println("Insira a sua nota de matemática: ");
        nota3 = input.nextInt();

        mediaP = (nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.40);
        System.out.println("Média ponderada" + mediaP); // isto se eu quiser que apareça qual a média, mas não era necessário este passo

        //mediaP = (num1 * 0.25 + num2 * 0.35 + num3 * 0.4);
        if (mediaP >= 9.5) {
            System.out.println(mediaP + " Está aprovado! Continue com a sua evolução!");
        } else {
            System.out.println(mediaP + " Está reprovado! Não desista!");
        }
    }
}
