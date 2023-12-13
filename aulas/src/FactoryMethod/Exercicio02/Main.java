package FactoryMethod.Exercicio02;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);

        int opcao;
        Encomenda encomenda01 = new Encomenda();
        Taco taco01 = null;

        do {
            System.out.println("\n1 - Crie o seu taco ");
            System.out.println("2 - Estado da sua encomenda");
            System.out.println("3 - Peça a conta");
            System.out.println("0 - Sair do restaurante");
            System.out.print("Selecione o que pretende fazer: ");
            opcao = input.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Os tacos que temos (Vaca) (Frango) (Vegetariano)");
                String tipo = input.next();
                System.out.println("Escolha o nome que quer dar ao seu taco");
                String nome = input.next();
                taco01 = TacoFactory.criarTaco(tipo, nome, 10);
                encomenda01.adicionarTaco(taco01);
                break;
            case 2:
                System.out.println("       A sua encomenda:      ");
                encomenda01.preparar();
                System.out.println("           ...               ");
                sleep(3000);
                encomenda01.cozinhar();
                System.out.println("           ...               ");
                sleep(3000);
                encomenda01.embalar();
                break;
            case 3:
                System.out.println("     A sua encomenda:      ");
                encomenda01.detalhesEncomenda();
                System.out.println("O valor total da sua encomenda " + encomenda01.total() + "€");
                break;
            case 0:
                System.out.println("Até à próxima!");
                break;
            default:
                System.out.println("\nOperação inválida. Selecione entre a opção 0 e a opção 3.");
            }
        } while (opcao != 0);
    }
}
