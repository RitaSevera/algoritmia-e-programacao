package EstudoTeste;

import java.util.Scanner;

public class Exercicio08Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota1, nota2, nota3;
        double mediaP;

        System.out.println("Insira a sua nota de português: ");
        nota1 = input.nextInt();
        System.out.println("Insira a sua nota de matemática: ");
        nota2 = input.nextInt();
        System.out.println("Insira a sua nota de história: ");
        nota3 = input.nextInt();

        mediaP = nota1 * 0.25 + nota2 * 0.35 + nota3 * 0.4;

        if (mediaP >= 9.5){
            System.out.println("Parabéns! Está aprovado. A sua média final foi: " + mediaP);
        } else {
            System.out.println("Infelizmente não ficou aprovado. A sua média final foi: " + mediaP);
        }
    }
}
