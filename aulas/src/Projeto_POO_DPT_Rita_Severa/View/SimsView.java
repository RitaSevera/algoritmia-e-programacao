package Projeto_POO_DPT_Rita_Severa.View;

import java.util.Scanner;

public class SimsView {
    public SimsView() {
    }
    public static void menuJogador () {
        Scanner input = new Scanner(System.in);
        SimsView jogador = new SimsView();

        int opcao = 0;

        do {
            System.out.println("###############################################################");
            System.out.println("|               Bem-vinda ao melhor jogo da sua vida          |");
            System.out.println("|                  1 - Criar a sua personagem                 |");
            System.out.println("|                     2 - Comprar uma casa                    |");
            System.out.println("|                    3 - Ir às compras                        |");
            System.out.println("|               4 - Vender algumas das suas coisas            |");
            System.out.println("|                           5 - Comer                         |");
            System.out.println("|                           6 - Beber                         |");
            System.out.println("|                           7 - Dormir                        |");
            System.out.println("|                      8 - Adotar um animal                   |");
            System.out.println("|                           9 - Casar                         |");
            System.out.println("|                    10 - Ter/adotar filhos                   |");
            System.out.println("|                      11 - Ir ao ginásio                     |");
            System.out.println("|                      12 - Sair do jogo                      |");
            System.out.println("|                Selecione o que pretende fazer               |");
            System.out.println("###############################################################");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("A sua personagem");
                    break;
                case 2:
            }
        } while (opcao !=12);
    }
}
