package Projeto_POO_DPT_Rita_Severa.Controllers;

import Projeto_POO_DPT_Rita_Severa.Model.*;
import Projeto_POO_DPT_Rita_Severa.Repository.PropriedadesRepos;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ShoppingController {
    /**
     * Este método carrega todos os dados do ficheiro CSV para um ArrayList "in memory".
     * É necessário correr este método no início da aplicação (na main) para que os dados sejam carregados no programa.
     *
     * @param propriedadesRepos
     */
    public void carregarPropriedade(PropriedadesRepos propriedadesRepos) {
        Shopping shopping = new Shopping();
        shopping.setCoisasParaComprar(propriedadesRepos.getPropriedades());
    }

    /**
     * Este método lista todo o contéudo que foi corregado pelo método anterior e que está no ficheiro CSV
     *
     * @param propriedadesRepos
     */
    public void listarPropriedades(PropriedadesRepos propriedadesRepos) {
        for (Propriedade propriedades : propriedadesRepos.getPropriedades()) {
            System.out.println(propriedades);
        }
    }

    /**
     * Este método cria um arrayList aleatório a partir do "original"
     *
     * @param propriedades
     * @return
     */
    private static ArrayList<Propriedade> getRandomArray(ArrayList<Propriedade> propriedades) {
        ArrayList<Propriedade> randomList = new ArrayList<>(propriedades); //cria uma cópia do arraylist principal

        Random random = new Random(); //serve para criar números aleatórios
        int size = randomList.size(); //tamanho do array

        for (int i = size - 1; i > 0; i--) { //ando no array ao contrário
            int j = random.nextInt(i + 1); //vou buscar posições aleatórias ao array

            // Troca os elementos manualmente
            Propriedade temp = randomList.get(i);
            randomList.set(i, randomList.get(j));
            randomList.set(j, temp);
        }

        int limit = Math.min(10, size); //vou buscar o máximo de 10 elementos
        return new ArrayList<>(randomList.subList(0, limit)); //retorno o array
    }

    /**
     * Método para listar as propriedades por tipo
     *
     * @param propriedadesRepos
     * @param jogador
     * @param input
     * @param opcao
     */
    public void listarPropriedadesPorTipo(PropriedadesRepos propriedadesRepos, Jogador jogador, Scanner input, int opcao) {

        ArrayList<Propriedade> listaPropriedades = new ArrayList<>();

        for (Propriedade propriedades : propriedadesRepos.getPropriedades()) {
            if (propriedades instanceof Imovel && opcao == 1) {
                listaPropriedades.add(propriedades);
            } else if (propriedades instanceof Veiculo && opcao == 2) {
                listaPropriedades.add(propriedades);
            } else if (propriedades instanceof AcessorioModa && opcao == 3) {
                listaPropriedades.add(propriedades);
            }
        }

        ArrayList<Propriedade> listaRandomPropriedades = getRandomArray(listaPropriedades);

        for (int i = 0; i < listaRandomPropriedades.size(); i++) {
            Propriedade propriedade = listaRandomPropriedades.get(i);
            System.out.println("\n******");
            System.out.println("* " + (i + 1) + " *");
            System.out.println("******");
            System.out.println(propriedade);
        }

        boolean escolhaValida = false;

        System.out.println("Escolhe um item para adicionar nas tuas propriedades (digita o número correspondente): ");
        int escolha = input.nextInt();

        while (!escolhaValida) { //enquanto a escolher for inválida, o ciclo não pára
            if (escolha >= 1 && escolha <= listaRandomPropriedades.size()) { //lista começa no número 1
                Propriedade propriedadeEscolhida = listaRandomPropriedades.get(escolha - 1); //como é um array e começa a 0, quero sincronizar com a contagem que fiz

                if (jogador.getDinheiro() < propriedadeEscolhida.getCusto()) { //se o jogador não tiver dinheiro suficiente
                    System.out.println("Não tem dinheiro suficiente para fazer esta compra");
                } else {
                    jogador.addPropriedade(propriedadeEscolhida); //acrescenta ao array de propriedades
                    jogador.setDinheiro(jogador.getDinheiro() - propriedadeEscolhida.getCusto()); //altera o dinheiro do jogador
                    propriedadesRepos.getPropriedades().remove(propriedadeEscolhida); //remove o artigo da lista original
                    listaRandomPropriedades.remove(propriedadeEscolhida); //remove o artigo da lista random
                    System.out.println("Propriedade adicionada às tuas propriedades: \n" + propriedadeEscolhida);
                }
                escolhaValida = true;
            } else {
                System.out.println("Escolha inválida.");
            }
        }
    }
}
