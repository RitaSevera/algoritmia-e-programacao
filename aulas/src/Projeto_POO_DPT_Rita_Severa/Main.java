package Projeto_POO_DPT_Rita_Severa;

import Projeto_POO_DPT_Rita_Severa.Controllers.SimsController;
import Projeto_POO_DPT_Rita_Severa.View.SimsView;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SimsController simsController = new SimsController();
        simsController.jogo();
    }
}
