package Projeto_POO_DPT_Rita_Severa.Controllers;

import Projeto_POO_DPT_Rita_Severa.Domain.Objetivo;
import Projeto_POO_DPT_Rita_Severa.Domain.Pessoa;
import Projeto_POO_DPT_Rita_Severa.Domain.Propriedade;
import Projeto_POO_DPT_Rita_Severa.Domain.Shopping;
import Projeto_POO_DPT_Rita_Severa.Model.PropriedadeRepos;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimsController {
    private ArrayList<Propriedade> jogo;

    public SimsController() throws FileNotFoundException {
       PropriedadeRepos repos = new PropriedadeRepos("aulas/Projeto_POO_DPT/CoisasShopping.csv");
       this.jogo = repos.getPropriedades();
    }

    public static void criarPersonagem (Scanner input) {
        System.out.println("Insira o nome da sua personagem - ");
        String nome = input.next();
        System.out.println("Insira o objetivo de vida da sua personagem - ");
        for (Objetivo objetivoAtual : Objetivo.values()){
            System.out.println(objetivoAtual);
        }
        String objetivo = input.next();
    }
}
