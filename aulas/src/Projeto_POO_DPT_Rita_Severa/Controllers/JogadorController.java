package Projeto_POO_DPT_Rita_Severa.Controllers;

import Projeto_POO_DPT_Rita_Severa.Domain.Shopping;
import Projeto_POO_DPT_Rita_Severa.Model.ShoppingRepos;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class JogadorController {
    private ArrayList<Shopping> jogo;

    public JogadorController() throws FileNotFoundException {
        ShoppingRepos repos = new ShoppingRepos("aulas/Projeto_POO_DPT/CoisasShopping.csv");
        this.jogo = repos.getVendaArray();
    }

    public String criarPersonagem () {

    }
}
