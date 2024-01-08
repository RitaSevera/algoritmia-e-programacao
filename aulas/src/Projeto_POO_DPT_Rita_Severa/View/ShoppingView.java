package Projeto_POO_DPT_Rita_Severa.View;

import Projeto_POO_DPT_Rita_Severa.Controllers.JogadorController;
import Projeto_POO_DPT_Rita_Severa.Controllers.ShoppingController;
import Projeto_POO_DPT_Rita_Severa.Model.Jogador;
import Projeto_POO_DPT_Rita_Severa.Model.Profissao;
import Projeto_POO_DPT_Rita_Severa.Repository.PropriedadesRepos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingView {
    /**
     * Método menu
     * @param input
     * @param propriedadesRepos
     * @param jogador
     * @param jogadorController
     * @param shoppingController
     * @param propriedadeRepository
     * @param profissoes
     * @throws FileNotFoundException
     */
    public static void menuListarPropriedadesPorTipo(Scanner input, PropriedadesRepos propriedadesRepos, Jogador jogador, JogadorController jogadorController, ShoppingController shoppingController, PropriedadesRepos propriedadeRepository, ArrayList<Profissao> profissoes) throws FileNotFoundException {
        System.out.println("\n###############################################################");
        System.out.println("|              Bem-vindo/a ao Shopping Central Perk           |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("|                        1 - Imobiliária                      |");
        System.out.println("|                        2 - Stand                            |");
        System.out.println("|                        3 - Moda                             |");
        System.out.println("|                                                             |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("Escolha a secção a que pretende aceder:                        ");

        int opcao = input.nextInt();

        if (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.println("Opção inválida. Tente Novamente");
        } else {
            shoppingController.listarPropriedadesPorTipo(propriedadesRepos, jogador, input, opcao);
        }
    }
}
