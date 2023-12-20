package Projeto_POO_DPT_Rita_Severa.Controllers;

import Projeto_POO_DPT_Rita_Severa.Domain.*;
import Projeto_POO_DPT_Rita_Severa.Model.PropriedadeRepos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimsController {
    private ArrayList<Propriedade> jogo;

    public SimsController() throws FileNotFoundException {
       PropriedadeRepos repos = new PropriedadeRepos("aulas/Projeto_POO_DPT/Sims.csv");
       this.jogo = repos.getPropriedades();
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
    }
}
