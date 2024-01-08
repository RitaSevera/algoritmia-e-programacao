package Projeto_POO_DPT_Rita_Severa.View;

import Projeto_POO_DPT_Rita_Severa.Controllers.JogadorController;
import Projeto_POO_DPT_Rita_Severa.Controllers.ShoppingController;
import Projeto_POO_DPT_Rita_Severa.Model.Jogador;
import Projeto_POO_DPT_Rita_Severa.Model.Profissao;
import Projeto_POO_DPT_Rita_Severa.Repository.PropriedadesRepos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SimsView {
    /**
     * Método menu principal
     *
     * @param input
     * @param jogador
     * @param jogadorController
     * @param propriedadeRepository
     * @param shoppingController
     * @param profissoes
     * @throws FileNotFoundException
     */

    public static void menuSims(Scanner input, Jogador jogador, JogadorController jogadorController, PropriedadesRepos propriedadeRepository, ShoppingController shoppingController, ArrayList<Profissao> profissoes) throws FileNotFoundException {
        System.out.println("\n###############################################################");
        System.out.println("|                   Escolha o que quer fazer                  |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("| 1 - Ir trabalhar                                            |");
        System.out.println("| 2 - Dormir                                                  |");
        System.out.println("| 3 - Ter uma refeição                                        |");
        System.out.println("| 4 - Praticar um hobby                                       |");
        System.out.println("| 5 - Ir às compras                                           |");
        System.out.println("| 6 - Ter formação                                            |");
        System.out.println("| 7 - Visitar propriedades                                    |");
        System.out.println("| 8 - Procurar nova profissão                                 |");
        System.out.println("| 9 - Detalhes da minha personagem                            |");
        System.out.println("|                                                             |");
        System.out.println("| 0 - Saír                                                    |");
        System.out.println("+-------------------------------------------------------------+");
        System.out.println("Escolha a secção a que pretende aceder:                        ");
        int opcao = input.nextInt();
        switch (opcao) {
            case 1:
                jogadorController.trabalhar(jogador);
                break;
            case 2:
                jogadorController.dormir(jogador);
                break;
            case 3:
                jogadorController.comer(jogador);
                break;
            case 4:
                jogadorController.socializar(jogador);
                break;
            case 5:
                ShoppingView.menuListarPropriedadesPorTipo(input, propriedadeRepository, jogador, jogadorController, shoppingController, propriedadeRepository, profissoes);
                break;
            case 6:
                jogadorController.formacao(jogador, input);
                break;
            case 7:
                shoppingController.listarPropriedades(propriedadeRepository);
                break;
            case 8:
                jogadorController.escolherProfissao(profissoes, jogador, input, opcao, jogadorController, propriedadeRepository, shoppingController);
                break;
            case 9:
                jogadorController.mostrarJogador(jogador);
                break;
            case 0:
                System.out.println("Até à próxima! :-)");
                System.exit(0);
                break;
            default:
                System.out.println("Escolha invalida.");
                break;
        }
    }
}
