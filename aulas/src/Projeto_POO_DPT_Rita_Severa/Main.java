package Projeto_POO_DPT_Rita_Severa;

import Projeto_POO_DPT_Rita_Severa.Controllers.SimsController;
import Projeto_POO_DPT_Rita_Severa.Domain.*;
import Projeto_POO_DPT_Rita_Severa.View.SimsView;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //SimsView.menuJogador();
        Shopping shopping = new Shopping();
        Profissao profissao = new Profissao("Cabeleireiro", 90, false, 300, 10);
        Jogador jogador = new Jogador("Rita",300, Objetivo.INFLUENCER, profissao, 100, 100, 100, 100, 20 );
        shopping.comprar(jogador);

    }
}
