package Projeto_POO_DPT_Rita_Severa.Controllers;

import Projeto_POO_DPT_Rita_Severa.Model.Jogador;
import Projeto_POO_DPT_Rita_Severa.Model.NPC;
import Projeto_POO_DPT_Rita_Severa.Model.ObjetivoVida;
import Projeto_POO_DPT_Rita_Severa.Model.Profissao;
import Projeto_POO_DPT_Rita_Severa.Repository.PropriedadesRepos;
import Projeto_POO_DPT_Rita_Severa.View.JogadorView;
import Projeto_POO_DPT_Rita_Severa.View.SimsView;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SimsController {
    /**
     * Método para correr o jogo todo
     *
     * @throws FileNotFoundException
     */
    public void jogo() throws FileNotFoundException {
        int diasTotais = 100;
        int opcao = 0;
        Jogador jogador = new Jogador();
        Scanner input = new Scanner(System.in);
        JogadorController jogadorController = new JogadorController();
        ProfissaoController profissaoController = new ProfissaoController();
        NpcController npcController = new NpcController();
        ShoppingController shoppingController = new ShoppingController();
        ArrayList<NPC> listaNPC = npcController.criarNPC();
        PropriedadesRepos propriedadeRepos = new PropriedadesRepos("aulas/src/Projeto_POO_DPT_Rita_Severa/files/Sims.csv");

        shoppingController.carregarPropriedade(propriedadeRepos);
        jogador = JogadorView.menuCriarJogador(input, jogadorController);

        ArrayList<Profissao> profissoes = profissaoController.criarProfissoes();

        for (int dia = 1; dia <= diasTotais; dia++) {//Corre do dia 1 ao dia 100
            jogadorController.assistenciaMedica(jogador);//verifica as necessidades do jogador no início de cada dia
            jogadorController.pagamentoFamiliar(jogador);//verifica se o jogador tem família, se tiver, tira-lhe 10€ por cada pessoa
            for (int momentoDia = 0; momentoDia < 4; momentoDia++) { //corre cada momento do dia
                switch (momentoDia) {
                    case 0:
                        System.out.println("\n#########");
                        System.out.println("| Dia " + dia + " |");
                        System.out.println("#########\n");

                        System.out.println("\n##################");
                        System.out.println("| Momento: Manhã |");
                        System.out.println("##################\n");

                        if (dia == 11) {
                            jogadorController.faculdade(jogador, input);
                        }
                        if (dia == 21 || dia == 47 || dia == 93) {
                            jogadorController.euromilhoes(input, jogador);
                        }
                        if (dia == 27) {
                            jogadorController.casar(listaNPC, jogador, input, opcao, propriedadeRepos, shoppingController, profissoes);
                        }
                        if (dia == 33) {
                            jogadorController.adotarAnimal(input);
                        }

                        SimsView.menuSims(input, jogador, jogadorController, propriedadeRepos, shoppingController, profissoes);
                        break;
                    case 1:
                        System.out.println("\n#########");
                        System.out.println("| Dia " + dia + " |");
                        System.out.println("#########\n");

                        System.out.println("\n#####################");
                        System.out.println("| Momento: Meio-Dia |");
                        System.out.println("#####################\n");

                        SimsView.menuSims(input, jogador, jogadorController, propriedadeRepos, shoppingController, profissoes);
                        break;
                    case 2:
                        System.out.println("\n#########");
                        System.out.println("| Dia " + dia + " |");
                        System.out.println("#########\n");

                        System.out.println("\n##################");
                        System.out.println("| Momento: Tarde |");
                        System.out.println("##################\n");

                        SimsView.menuSims(input, jogador, jogadorController, propriedadeRepos, shoppingController, profissoes);
                        break;
                    case 3:
                        System.out.println("\n#########");
                        System.out.println("| Dia " + dia + " |");
                        System.out.println("#########\n");

                        System.out.println("\n##################");
                        System.out.println("| Momento: Noite |");
                        System.out.println("##################\n");

                        SimsView.menuSims(input, jogador, jogadorController, propriedadeRepos, shoppingController, profissoes);
                        break;
                }
            }
            jogadorController.diminuirNecessidades(jogador); //diminui as necessidades do jogador ao final de cada dia
        }
        if (jogador.getObjetivoVida() == ObjetivoVida.MILIONARIO) {
            if (jogador.getDinheiro() > 1000000) {
                System.out.println("Parabéns! Atingiu o objetivo do jogo " + jogador.getObjetivoVida() + " GANHOU");
            } else {
                System.out.println("Infelizmente não atingiu o seu objetivo " + jogador.getObjetivoVida());
            }
        }
        if (jogador.getObjetivoVida() == ObjetivoVida.FAMILIACOMPLETA) {
            if (jogador.getFamilia().size() > 5) {
                System.out.println("Parabéns! Atingiu o objetivo do jogo " + jogador.getObjetivoVida() + " GANHOU");
            } else {
                System.out.println("Infelizmente não atingiu o seu objetivo " + jogador.getObjetivoVida());
            }
        }
        if (jogador.getObjetivoVida() == ObjetivoVida.INFLUENCER) {
            if (jogador.getPropriedades().size() > 12) {
                System.out.println("Parabéns! Atingiu o objetivo do jogo " + jogador.getObjetivoVida() + " GANHOU");
            } else {
                System.out.println("Infelizmente não atingiu o seu objetivo " + jogador.getObjetivoVida());
            }
        }
        if (jogador.getObjetivoVida() == ObjetivoVida.PROGRAMADOR) {
            if (jogador.getProfissao().getNome().equals("Programador") && jogador.getDinheiro() > 3000) {
                System.out.println("Parabéns! Atingiu o objetivo do jogo " + jogador.getObjetivoVida() + " GANHOU");
            } else {
                System.out.println("Infelizmente não atingiu o seu objetivo " + jogador.getObjetivoVida());
            }
        }
        if (jogador.getDinheiro() < 0) {
            System.out.println("Não são permitidas dívidas! Perdeu o jogo...");
        }
    }
}