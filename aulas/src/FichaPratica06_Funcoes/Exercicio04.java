package FichaPratica06_Funcoes;

import java.util.Scanner;

import static FichaPratica06_Funcoes.Exercicio03.*;


public class Exercicio04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num, escolha;

        System.out.print("Introduza um número: ");
        num = input.nextInt();
        System.out.println("\nO seu número " + num + " irá agora ser avaliado");

        do {
            System.out.println("\n 1. Verificar se o número é par ou impar ");
            System.out.println(" 2. Verificar se o número é positivo ou negativo ");
            System.out.println(" 3. Verificar se o número é primo ou não primo ");
            System.out.println(" 4. Verificar se o número é perfeito ou não perfeito ");
            System.out.println(" 5. Verificar se o número é triangular ou não triangular");
            System.out.println(" 6. Trocar de número: ");
            System.out.println(" 7. Sair. ");

            System.out.println("\nInsira uma opção: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    if (par(num)) {
                        System.out.println("Inseriu um número par. ");
                    } else {
                        System.out.println("Inseriu um número impar");
                    }
                    break;
                case 2:
                    if (positivo(num)) {
                        System.out.println("Inseriu um número positivo. ");
                    } else {
                        System.out.println("Inseriu um  número negativo. ");
                    }
                    break;
                case 3:
                    if (primo(num)) {
                        System.out.println("Inseriu um número primo. ");
                    } else {
                        System.out.println("Inseriu um número não primo. ");
                    }
                    break;
                case 4:
                    if (perfeito(num)) {
                        System.out.println("Inseriu um número perfeito. ");
                    } else {
                        System.out.println("Inseriu um número não perfeito. ");
                    }
                    break;
                case 5:
                    if (triangulo(num)) {
                        System.out.println("Inseriu um número triangular. ");
                    } else {
                        System.out.println("Inseriu um número não triangular. ");
                    }
                    break;
                case 6:
                    System.out.println("Insira um número diferente: ");
                    num = input.nextInt();
                    break;
                case 7:
                    System.out.println("Até à próxima!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        while (escolha != 7);
    }
}
