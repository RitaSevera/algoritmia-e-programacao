package Projeto_POO_DPT_Rita_Severa.View;

import Projeto_POO_DPT_Rita_Severa.Controllers.JogadorController;
import Projeto_POO_DPT_Rita_Severa.Model.Jogador;
import Projeto_POO_DPT_Rita_Severa.Model.ObjetivoVida;

import java.util.Scanner;

public class JogadorView {
    /**
     * Método para criar um jogador através da consola
     *
     * @param input
     * @param jogadorController
     * @return retorna o método criar jogador
     */

    public static Jogador menuCriarJogador(Scanner input, JogadorController jogadorController) {
        System.out.println("************************************************************\n" +
                "* ____  _                 _____     _                _     *\n" +
                "*/ ___|(_)_ __ ___  ___  |  ___| __(_) ___ _ __   __| |___ *\n" +
                "*\\___ \\| | '_ ` _ \\/ __| | |_ | '__| |/ _ \\ '_ \\ / _` / __|*\n" +
                "* ___) | | | | | | \\__ \\ |  _|| |  | |  __/ | | | (_| \\__ \\*\n" +
                "*|____/|_|_| |_| |_|___/ |_|  |_|  |_|\\___|_| |_|\\__,_|___/*\n" +
                "************************************************************");
        System.out.println();
        System.out.println();
        System.out.println("                  Para poder começar a jogar tem primeiro que criar a sua personagem               ");
        System.out.println("+-------------------------------------------------------------------------------------------------+");
        System.out.println("| Digite o nome:                                                                                  |");
        String nome = input.next();
        System.out.println("| Escolha o objectivo de vida:                                                                    |");
        for (ObjetivoVida objetivo : ObjetivoVida.values()) {
            System.out.println(objetivo.ordinal() + 1 + ". " + objetivo.name());
        }

        System.out.print("\nDigite o número correspondente ao seu objetivo: ");
        int escolha = input.nextInt();

        if (escolha >= 1 && escolha <= ObjetivoVida.values().length) {
            ObjetivoVida objetivoEscolhido = ObjetivoVida.values()[escolha - 1];
            return jogadorController.criarJogador(nome, objetivoEscolhido);
        } else {
            System.out.println("\nOpção inválida. Por favor, escolha um número válido.");
            return null;
        }
    }
}
