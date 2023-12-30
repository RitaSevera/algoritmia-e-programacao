package Projeto_POO_DPT_Rita_Severa.Controllers;

import Projeto_POO_DPT_Rita_Severa.Domain.*;
import Projeto_POO_DPT_Rita_Severa.Model.PropriedadeRepos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimsController {
    //private ArrayList<Propriedade> jogo;

    public SimsController() throws FileNotFoundException {
       PropriedadeRepos repos = new PropriedadeRepos("aulas/Projeto_POO_DPT/Sims.csv");
       //this.jogo = repos.getPropriedades();
    }

    public static Jogador criarPersonagem () { //aqui tem que ser public jogador, pq preciso de guardar esta personagem

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o nome da sua personagem - ");
        String nome = input.next();

        System.out.println("Insira o objetivo de vida da sua personagem - ");
        for (Objetivo objetivoAtual : Objetivo.values()){
            System.out.println(objetivoAtual);
        }
        String objetivo = input.next();

        return new Jogador(nome,Objetivo.valueOf(objetivo));
    }
    public void jogo () throws FileNotFoundException {
        Shopping shopping = new Shopping();
        Jogador personagem = criarPersonagem();
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("###############################################################");
            System.out.println("|   Agora que criou a sua personagem" + personagem.getNome() + "vamos começar a jogar   |");
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
                    shopping.comprar(personagem);
                    break;
                case 2:

                    break;
            }
        } while (opcao !=9);
    }
}
