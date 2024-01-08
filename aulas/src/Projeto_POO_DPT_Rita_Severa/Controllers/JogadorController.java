package Projeto_POO_DPT_Rita_Severa.Controllers;

import Projeto_POO_DPT_Rita_Severa.Model.*;
import Projeto_POO_DPT_Rita_Severa.Repository.PropriedadesRepos;
import Projeto_POO_DPT_Rita_Severa.View.NpcView;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JogadorController {
    /**
     * Método para repôr a necessidade de refeição e retirar 5€ do dinheiro do jogador
     *
     * @param jogador
     */
    public void comer(Jogador jogador) {
        System.out.println("Bem me parecia que já estavas com fome");
        System.out.println("Estava refeição vai-te custar 5€");
        jogador.setNecessidadeRefeicao(100);
        jogador.setDinheiro(jogador.getDinheiro() - 5);
        System.out.println("A tua necessidade de refeição já está reposta - " + jogador.getNecessidadeRefeicao());
        System.out.println("A tua fortuna só sofreu uma pequena redução - " + jogador.getDinheiro() + "€");
    }

    /**
     * Método para repôr a necessidade de dormir
     *
     * @param jogador
     */
    public void dormir(Jogador jogador) {
        System.out.println("Já estás cansadito. Dorme bem!");
        jogador.setNecessidadeSono(100);
        System.out.println("A tua necessidade de dormir já está reposta - " + jogador.getNecessidadeSono());
    }

    /**
     * Método para repôr a necessidade de socializar
     *
     * @param jogador
     */
    public void socializar(Jogador jogador) {
        System.out.println("Socializar é das coisas que melhor faz à nossa saúde mental!");
        jogador.setNecessidadeSocial(100);
        System.out.println("A tua necessidade social já está reposta - " + jogador.getNecessidadeSocial());
    }

    /**
     * Método para o jogador poder ir trabalhar e aumentar o seu dinheiro, consoante o emprego que tem
     *
     * @param jogador
     */
    public void trabalhar(Jogador jogador) {
        if (jogador.getProfissao() == null) { //se o jogador não tiver profissão
            System.out.println("Ainda não tens profissão.");//o jogador é muito trabalhador e vai trabalhar mesmo sem ter profissão e sem receber salário
        } else {
            System.out.println("Ainda bem que vieste trabalhar, precisam mesmo de ti!");
            jogador.setDinheiro(jogador.getDinheiro() + jogador.getProfissao().getSalarioDia()); //aumenta o dinheiro consoante o salário diário de determinada profissão
            System.out.println("A tua fortuna já está a crescer - " + jogador.getDinheiro());
        }
    }

    /**
     * Método que irá alterar as necessidades do jogador a cada fim de iteração de ciclo
     *
     * @param jogador
     */
    public void diminuirNecessidades(Jogador jogador) {
        jogador.setNecessidadeSocial(jogador.getNecessidadeSocial() - 10);
        jogador.setNecessidadeRefeicao(jogador.getNecessidadeRefeicao() - 15);
        jogador.setNecessidadeSono(jogador.getNecessidadeSono() - 20);
    }

    /**
     * Método que irá verificar, a cada iteração do ciclo principal do jogo, as necessidades do jogador e aconselha a repôr, quando estas estão abaixo de 25. Quando o jogador opta por não o fazer e chega a 0, termina o jogo.
     *
     * @param jogador
     */
    public void assistenciaMedica(Jogador jogador) {
        System.out.println();
        if (jogador.getNecessidadeSono() < 25) { // se a necessidade de sono for abaixo de 25
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Tens que ir dormir, estás demasiado/a cansado/a!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        if (jogador.getNecessidadeRefeicao() < 25) { // se a necessidade de refeição for abaixo de 25
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Tens que comer, estás com demasiada fome!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        if (jogador.getNecessidadeSocial() < 25) { // se a necessidade social for abaixo de 25
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("2Estás demasiado/a ansioso/a, vai praticar o teu hobbie e socializa!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
        if (jogador.getNecessidadeRefeicao() == 0 || jogador.getNecessidadeSono() == 0 || jogador.getNecessidadeSocial() == 0) {
            System.out.println("Avisamos que devias de ter reposto as tuas necessidades. Agora perdeste o jogo...");
            System.out.println("┌───────────────────────────────┐\n" +
                    "│ _                             │\n" +
                    "│| |    ___  ___  ___  ___ _ __ │\n" +
                    "│| |   / _ \\/ __|/ _ \\/ _ \\ '__|│\n" +
                    "│| |__| (_) \\__ \\  __/  __/ |   │\n" +
                    "│|_____\\___/|___/\\___|\\___|_|   │\n" +
                    "└───────────────────────────────┘");
            System.exit(0); //termino o jogo
        }
    }

    /**
     * Método para o utilizador escolher que formação pretende tirar, alterando assim o seu estatuto e o seu nível de educação
     *
     * @param jogador
     * @param input
     */
    public void formacao(Jogador jogador, Scanner input) {

        System.out.println("\n+----------------------------------------------------------------------------------------------------------+");
        System.out.println("| Ficamos contentes por apostares na tua formação!                                                         |");
        System.out.println("| Aqui tens a lista de formações disponíveis:                                                              |");
        System.out.println("| 1 - Formação de cozinha chinesa | Estatuto - 120 | Nível de educação - 5                                 |");
        System.out.println("| 2 - Formação em Web Designer | Estatuto - 150 | Nível de educação - 7                                    |");
        System.out.println("| 3 - Formação em representação | Estatuto - 50 | Nível de educação - 4                                    |");
        System.out.println("| 4 - Formação do ciclo da vida animal | Estatuto - 130 | Nível de educação - 7                            |");
        System.out.println("| 5 - Formação de empratamento | Estatuto - 120 | Nível de educação - 5                                    |");
        System.out.println("| 6 - Formação em Java | Estatuto - 150 | Nível de educação - 7                                            |");
        System.out.println("| 7 - Formação de suporte básico de vida | Estatuto - 40 | Nível de educação - 2                           |");
        System.out.println("| 8 - Formação de fósseis | Estatuto - 130 | Nível de educação - 7                                         |");
        System.out.println("| 0 - Pode ir para casa e pensar melhor na sua escolha                                                     |");
        System.out.println("+----------------------------------------------------------------------------------------------------------+");
        System.out.println("Escolhe a formação que pretendes tirar");

        int opcao = 0;
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                jogador.setEducacao(jogador.getEducacao() + 5);
                jogador.setEstatuto(jogador.getEstatuto() + 120);
                System.out.println("Parabéns! Concluiu a sua formação com distinção!");
                System.out.println("O seu nível de educação aumentou para: " + jogador.getEducacao() + " e o seu estatuto aumentou para: " + jogador.getEstatuto());
                break;
            case 2:
                jogador.setEducacao(jogador.getEducacao() + 7);
                jogador.setEstatuto(jogador.getEstatuto() + 150);
                System.out.println("Parabéns! Concluiu a sua formação com distinção!");
                System.out.println("O seu nível de educação aumentou para: " + jogador.getEducacao() + " e o seu estatuto aumentou para: " + jogador.getEstatuto());
                break;
            case 3:
                jogador.setEducacao(jogador.getEducacao() + 4);
                jogador.setEstatuto(jogador.getEstatuto() + 50);
                System.out.println("Parabéns! Concluiu a sua formação com distinção!");
                System.out.println("O seu nível de educação aumentou para: " + jogador.getEducacao() + " e o seu estatuto aumentou para: " + jogador.getEstatuto());
                break;
            case 4:
                jogador.setEducacao(jogador.getEducacao() + 7);
                jogador.setEstatuto(jogador.getEstatuto() + 130);
                System.out.println("Parabéns! Concluiu a sua formação com distinção!");
                System.out.println("O seu nível de educação aumentou para: " + jogador.getEducacao() + " e o seu estatuto aumentou para: " + jogador.getEstatuto());
                break;
            case 5:
                jogador.setEducacao(jogador.getEducacao() + 5);
                jogador.setEstatuto(jogador.getEstatuto() + 125);
                System.out.println("Parabéns! Concluiu a sua formação com distinção!");
                System.out.println("O seu nível de educação aumentou para: " + jogador.getEducacao() + " e o seu estatuto aumentou para: " + jogador.getEstatuto());
                break;
            case 6:
                jogador.setEducacao(jogador.getEducacao() + 7);
                jogador.setEstatuto(jogador.getEstatuto() + 155);
                System.out.println("Parabéns! Concluiu a sua formação com distinção!");
                System.out.println("O seu nível de educação aumentou para: " + jogador.getEducacao() + " e o seu estatuto aumentou para: " + jogador.getEstatuto());
                break;
            case 7:
                jogador.setEducacao(jogador.getEducacao() + 2);
                jogador.setEstatuto(jogador.getEstatuto() + 40);
                System.out.println("Parabéns! Concluiu a sua formação com distinção!");
                System.out.println("O seu nível de educação aumentou para: " + jogador.getEducacao() + " e o seu estatuto aumentou para: " + jogador.getEstatuto());
                break;
            case 8:
                jogador.setEducacao(jogador.getEducacao() + 7);
                jogador.setEstatuto(jogador.getEstatuto() + 135);
                System.out.println("Parabéns! Concluiu a sua formação com distinção!");
                System.out.println("O seu nível de educação aumentou para: " + jogador.getEducacao() + " e o seu estatuto aumentou para: " + jogador.getEstatuto());
                break;
            case 0:
                System.out.println("Esperamos por si novamente");
                break;
            default:
                System.out.println("Escolha inválida. Por favor, escolha um dos cursos disponíveis.");
        }
    }

    /**
     * Método que permite e jogador ir para a faculdade
     *
     * @param jogador
     * @param input
     */
    public void faculdade(Jogador jogador, Scanner input) {
        System.out.println();
        System.out.println("#######################################################################################");
        System.out.println("| Vejo que és muito/a trabalhador/a! Tens agora a oportunidade de ir para a faculdade |");
        System.out.println("| 1 - Se quiseres ir para a faculade                                                  |");
        System.out.println("| 2 - Se não quiseres aproveitar esta oportunidade                                    |");
        System.out.println("+-------------------------------------------------------------------------------------+");
        System.out.println("| Faz a tua escolha:                                                                  |");
        int opcao = 0;
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Decidiste apostar na tua formação, parabéns!");
                jogador.setEducacao(jogador.getEducacao() + 50);
                jogador.setEstatuto(jogador.getEstatuto() + 50);
                jogador.setDinheiro(jogador.getDinheiro() - 1000);
                System.out.println("O teu nível de educação aumentou - " + jogador.getEducacao());
                System.out.println("O teu estatuto também aumentou - " + jogador.getEstatuto());
                System.out.println("Infelizmente ficou mais pobre - " + jogador.getDinheiro());
                break;
            case 2:
                System.out.println("Preferiste recusar esta oportunidade");
                break;
            default:
                System.out.println("Escolha inválida. Agora perdeste esta oportunidade única...");
        }
    }

    /**
     * Método que lista os NPC e permite ao utilizador escolher com quem quer casar
     *
     * @param listaNPC
     * @param jogador
     * @param input
     * @param opcao
     */
    public void casar(ArrayList<NPC> listaNPC, Jogador jogador, Scanner input, int opcao, PropriedadesRepos propriedadeRepository, ShoppingController shoppingController, ArrayList<Profissao> profissoes) throws FileNotFoundException {

        System.out.println();
        File file = new File("aulas/src/Projeto_POO_DPT_Rita_Severa/files/Quim");

        Scanner sc = new Scanner(file);

        String linha;

        //Digo que, enquanto houver linha, ele vai imprimi-lá
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            System.out.println(linha);
        }
        //Fecho o ficheiro
        sc.close();

        boolean escolhaValida = false;

        System.out.println();
        System.out.println("Achamos que já estava na hora de te dar a oportunidade de casar");
        for (int i = 0; i < listaNPC.size(); i++) {
            NPC npc = listaNPC.get(i);
            System.out.println("\n******");
            System.out.println("* " + (i + 1) + " *");
            System.out.println("******");
            System.out.println(npc);
        }

        while (!escolhaValida) { //enquanto a escolha for inválida, o ciclo não pára
            System.out.print("Escolha qual o NPC que quer: ");
            opcao = input.nextInt();

            if (opcao >= 1 && opcao <= listaNPC.size()) { //lista começa no número 1 e acaba no tamanho da lista dos NPC
                if (jogador.getEstatuto() < listaNPC.get(opcao - 1).getEstatutoMinimo()) { //se o estatuto do jogador for inferior ao estatuto do npc escolhido, não pode casar
                    System.out.println("Não tem o nivel mínimo de estatuto para casar com este NPC.");
                    NpcView.menuNPC(input, listaNPC, jogador, propriedadeRepository, shoppingController, profissoes); //volta ao menu para escolher com quem casar
                } else if (!temCasa(jogador)) {
                    System.out.println("Como diz o ditado: Quem casa, quer casa! E como não tens casa, não podes casar...");
                    escolhaValida = true;
                } else {
                    jogador.addFamilia(listaNPC.get(opcao - 1)); //adiciona a pessoa à sua família (arrayList)
                    jogador.setDinheiro(jogador.getDinheiro() + listaNPC.getFirst().getDinheiro());
                    System.out.println("Parabéns pelo seu casamento com: " + jogador.getFamilia());
                    escolhaValida = true;
                }
            } else {
                System.out.println("Escolha inválida. Por favor, escolha um número válido.");
            }
        }
    }

    /**
     * Método que verifica se o jogador tem uma casa que albergue 2 ou + pessoas
     *
     * @param jogador
     * @return
     */
    public boolean temCasa(Jogador jogador) {
        for (Propriedade propriedadeAtual : jogador.getPropriedades()) {
            if (propriedadeAtual instanceof Imovel imovel) {
                return imovel.getCapacidadePessoas() >= 2;
            } else {
                return false;
            }
        }
        return false;
    }

    /**
     * Método que retira 10€ ao jogador por cada membro da família que ele tenha
     *
     * @param jogador
     */
    public void pagamentoFamiliar(Jogador jogador) {
        if (jogador.getFamilia().size() > 1) {
            jogador.setDinheiro(jogador.getDinheiro() - (10 * jogador.getFamilia().size()));
        }
    }

    /**
     * Método que permite o jogador adotar um animal
     *
     * @param input
     * @throws FileNotFoundException
     */
    public void adotarAnimal(Scanner input) throws FileNotFoundException {
        System.out.println();
        System.out.println("#######################################################################################");
        System.out.println("| Achamos que lhe fazia bem adotar um animal                                     |");
        System.out.println("| 1 - Se quiseres adotar um cão                                                  |");
        System.out.println("| 2 - Se não quiseres aproveitar esta oportunidade                               |");
        System.out.println("+-------------------------------------------------------------------------------------+");
        System.out.println("| Faz a tua escolha:                                                                  |");
        int opcao = 0;
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Ficamos muito feliz por ti! Um animal é sempre uma ótima companhia e um grande Amor");
                File file = new File("aulas/src/Projeto_POO_DPT_Rita_Severa/files/Animal");

                Scanner sc = new Scanner(file);

                String linha;

                //Digo que, enquanto houver linha, ele vai imprimi-lá
                while (sc.hasNextLine()) {
                    linha = sc.nextLine();
                    System.out.println(linha);
                }
                //Fecho o ficheiro
                sc.close();
                break;
            case 2:
                System.out.println("Temos pena que não queiras adotar um animal, mas sabemos que são muitas responsabilidades");
        }
    }

    /**
     * Metódo que lista as profissões disponíveis e permite ao utilizador escolher uma
     *
     * @param profissoes
     * @param jogador
     * @param input
     * @param opcao
     * @param jogadorController
     * @param propriedadeRepository
     * @param shoppingController
     * @throws FileNotFoundException
     */
    public void escolherProfissao(ArrayList<Profissao> profissoes, Jogador jogador, Scanner input, int opcao, JogadorController jogadorController, PropriedadesRepos propriedadeRepository, ShoppingController shoppingController) throws FileNotFoundException {
        boolean escolhaValida = false;

        for (int i = 0; i < profissoes.size(); i++) {
            Profissao profissao = profissoes.get(i);
            System.out.println("\n******");
            System.out.println("* " + (i + 1) + " *");
            System.out.println("******");
            System.out.println(profissao);
        }

        while (!escolhaValida) { //enquanto a escolher for inválida, o ciclo não pára
            System.out.print("Escolha o número da profissão desejada: ");
            opcao = input.nextInt();

            if (opcao >= 1 && opcao <= profissoes.size()) { //lista começa no número 1 e acaba no tamanho da lista das profissões
                if (jogador.getEducacao() < profissoes.get(opcao - 1).getNivelMinimoEducacao() && jogador.getEstatuto() < profissoes.get(opcao - 1).getEstatuto()) { //como é um array e começa a 0, quero sincronizar com a contagem que fiz das profissões
                    System.out.println("Ainda nao tem o nivel mínimo de educação/estatuto para conseguir este emprego.");
                } else {
                    jogador.setProfissao(profissoes.get(opcao - 1));
                    System.out.println("Parabéns pelo seu novo emprego: " + jogador.getProfissao());
                    escolhaValida = true;
                }
            } else {
                System.out.println("Escolha inválida. Por favor, escolha um número válido.");
            }
        }
    }

    /**
     * Método que pede um número ao utilizador e verifica se coincide com número gerado aleatoriamente
     *
     * @param input
     * @param jogador
     */
    public void euromilhoes(Scanner input, Jogador jogador) {
        System.out.println();
        System.out.println("#######################################################################################");
        System.out.println("| Parabéns! Hoje parece-me um dia de sorte, não queres jogar numa raspadinha?         |");
        System.out.println("| 1 - Se quiseres jogar                                                               |");
        System.out.println("| 2 - Se não quiseres aproveitar esta oportunidade                                    |");
        System.out.println("+-------------------------------------------------------------------------------------+");
        System.out.println("| Faz a tua escolha:                                                                  |");
        int opcao = 0;
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                int numero, numeroSorte;
                Random random = new Random();
                System.out.println("Escolhe um número inteiro à tua escolha: ");
                numero = input.nextInt();
                numeroSorte = random.nextInt();

                if (numero == numeroSorte) {
                    System.out.println("Eu bem disse que hoje era o seu dia de sorte! Parabéns, acabou de ganhar 100000€");
                    jogador.setDinheiro(jogador.getDinheiro() + 100000);
                } else {
                    System.out.println("Infelizmente não conseguiu acertar no número da sorte " + numeroSorte);
                }
                break;
            case 2:
                System.out.println("Devias de ter tentado a tua sorte...");
        }
    }

    /**
     * Método genérico de criar jogador (e vou chamá-lo no JogadorView
     *
     * @param nome
     * @param objetivoVida
     * @return retorna o jogador
     */
    public Jogador criarJogador(String nome, ObjetivoVida objetivoVida) {
        Profissao profissao = new Profissao("N/A", 0, false, 0, 0);
        return new Jogador(nome, 0, objetivoVida, profissao, 100, 100, 100, 0, 0);
    }

    /**
     * Método mostrarDetalhes que escreva na consola todos os detalhes da personagem
     */
    public void mostrarJogador(Jogador jogador) {
        System.out.println("############################################");
        System.out.println("|          Detalhes da personagem:         |");
        System.out.println("+------------------------------------------+");
        System.out.println("| Name: " + jogador.getNome());
        System.out.println("| Dinheiro: " + jogador.getDinheiro());
        System.out.println("| Objetivo de vida: " + jogador.getObjetivoVida());
        System.out.println("| Profissao: " + jogador.getProfissao());
        System.out.println("| Necessidade de sono: " + jogador.getNecessidadeSono());
        System.out.println("| Necessidade de refeicao: " + jogador.getNecessidadeRefeicao());
        System.out.println("| Necessidade de social: " + jogador.getNecessidadeSocial());
        System.out.println("| Estatuto: " + jogador.getEstatuto());
        System.out.println("| Educação: " + jogador.getEducacao());
        System.out.println("| Propriedades: ");
        for (Propriedade propriedades : jogador.getPropriedades()) {
            System.out.println("| *" + propriedades + "\n");
        }
        System.out.println("| Família: ");
        for (NPC familia : jogador.getFamilia()) {
            System.out.println("| " + familia + "\n");
        }
    }
}
