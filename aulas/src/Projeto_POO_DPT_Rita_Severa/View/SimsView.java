package Projeto_POO_DPT_Rita_Severa.View;

import Projeto_POO_DPT_Rita_Severa.Controllers.SimsController;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimsView {

    public SimsView() {
    }
    public static void menuJogador () throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        SimsView jogador = new SimsView();


        int opcao = 0;
        do {
            System.out.println("###############################################################");
            System.out.println("|               Bem-vinda ao melhor jogo da sua vida          |");
            System.out.println("|                  1 - Criar a sua personagem                 |");
            System.out.println("###############################################################");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    SimsController.criarPersonagem(input);
                    break;
            }
        } while (opcao !=1);

        do {
            System.out.println("###############################################################");
            System.out.println("|   Agora que criou a sua personagem, vamos começar a jogar   |");
            System.out.println("|                       1 - Ir às compras                     |");
            System.out.println("|                       2 - Vender algumas das suas coisas    |");
            System.out.println("|                       3 - Comer                             |");
            System.out.println("|                       4 - Dormir                            |");
            System.out.println("|                       5 - Adotar um animal                  |");
            System.out.println("|                       6 - Casar                             |");
            System.out.println("|                       7 - Ter/adotar filhos                 |");
            System.out.println("|                       8 - Ir ao ginásio                     |");
            System.out.println("|                       9 - Sair do jogo                      |");
            System.out.println("|                Selecione o que pretende fazer               |");
            System.out.println("###############################################################");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:


                    break;
                case 2:

                    break;
            }
        } while (opcao !=9);
    }
}
