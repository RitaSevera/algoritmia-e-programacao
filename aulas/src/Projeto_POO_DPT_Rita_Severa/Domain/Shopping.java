package Projeto_POO_DPT_Rita_Severa.Domain;

import Projeto_POO_DPT_Rita_Severa.Model.PropriedadeRepos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Shopping {
    private ArrayList<Propriedade> itensComprar;

    public Shopping() throws FileNotFoundException {

        PropriedadeRepos propriedadeRepository = new PropriedadeRepos("aulas/Projeto_POO_DPT/CoisasShopping.csv");

        this.itensComprar = propriedadeRepository.getPropriedades();
    }

    public ArrayList<Propriedade> getItensComprar() {
        return itensComprar;
    }
    public void comprar (Pessoa jogador) {
        Scanner input = new Scanner(System.in);
        int seccao = 0;
        Random random = new Random();

        System.out.println("###############################################################");
        System.out.println("|                 Bem-vinda ao Shopping Severa                |");
        System.out.println("|                          1 - Moda                           |");
        System.out.println("|                          2 - Imobiliária                    |");
        System.out.println("|                          3 - Stand                          |");
        System.out.println("|                          4 - Sair do Shopping               |");
        System.out.println("|          Escolha a secção a que pretende aceder -           |");
        seccao = input.nextInt();

        switch (seccao) {
            case 1:
                System.out.println("Artigos de moda disponíveis");
                ArrayList<Integer> arrayAleatorio = new ArrayList<>();

                while (arrayAleatorio.size() < 10) {
                    int indexAleatorio = random.nextInt(0, this.itensComprar.size());

                    if (arrayAleatorio.size() == 0) {
                        arrayAleatorio.add(indexAleatorio);
                    }
                    if (!arrayAleatorio.contains(indexAleatorio)) {
                        arrayAleatorio.add(indexAleatorio);
                    }
                }
                for (int linha = 0 ; linha < arrayAleatorio.size(); linha++) {
                    System.out.println("Artigos de moda disponíveis" + linha + " - ");
                    this.itensComprar.get(arrayAleatorio.get(linha)).exibirDetalhes();
                }
        }
    }
}
