package Projeto_POO_DPT_Rita_Severa.View;

import Projeto_POO_DPT_Rita_Severa.Controllers.JogadorController;
import Projeto_POO_DPT_Rita_Severa.Controllers.ShoppingController;
import Projeto_POO_DPT_Rita_Severa.Model.Jogador;
import Projeto_POO_DPT_Rita_Severa.Model.NPC;
import Projeto_POO_DPT_Rita_Severa.Model.Profissao;
import Projeto_POO_DPT_Rita_Severa.Repository.PropriedadesRepos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class NpcView {
    /**
     * Método de menu
     *
     * @param input
     * @param listaNPC
     * @param jogador
     * @param propriedadeRepository
     * @param shoppingController
     * @param profissoes
     * @throws FileNotFoundException
     */
    public static void menuNPC(Scanner input, ArrayList<NPC> listaNPC, Jogador jogador, PropriedadesRepos propriedadeRepository, ShoppingController shoppingController, ArrayList<Profissao> profissoes) throws FileNotFoundException {
        JogadorController jogadorController = new JogadorController();
        while (true) {
            System.out.println("\n+---------------------------------------------------------------------------+");
            System.out.println("| 1 - Lista de pessoas disponíveis                                            |");
            System.out.println("|                                                                             |");
            System.out.println("| 0 - Saír                                                                    |");
            System.out.println("+-----------------------------------------------------------------------------+");
            System.out.println("Escolha o que deseja fazer:                                                 ");

            int opcao = input.nextInt();

            if (opcao == 1) {
                jogadorController.casar(listaNPC, jogador, input, opcao, propriedadeRepository, shoppingController, profissoes);
            } else {
                SimsView.menuSims(input, jogador, jogadorController, propriedadeRepository, shoppingController, profissoes);
            }
        }
    }
}
