package Projeto_POO_DPT_Rita_Severa.Controllers;

import Projeto_POO_DPT_Rita_Severa.Model.NPC;

import java.util.ArrayList;

public class NpcController {
    /**
     * Método para criar npc e adicionar ao array
     * @return
     */
    public ArrayList<NPC> criarNPC() {
        ArrayList<NPC> listaNPC = new ArrayList<>();

        String nome1 = "Janice";
        double dinheiro1 = 1000;
        int estatuto1 = 100;

        String nome2 = "Carol";
        double dinheiro2 = 1500;
        int estatuto2 = 150;

        String nome3 = "Richard";
        double dinheiro3 = 3000;
        int estatuto3 = 300;

        String nome4 = "Ben";
        double dinheiro4 = 150;
        int estatuto4 = 50;

        String nome5 = "Mike";
        double dinheiro5 = 1700;
        int estatuto5 = 170;

        String nome6 = "Emma";
        double dinheiro6 = 150;
        int estatuto6 = 50;

        listaNPC.add(new NPC(nome1, dinheiro1, estatuto1));
        listaNPC.add(new NPC(nome2, dinheiro2, estatuto2));
        listaNPC.add(new NPC(nome3, dinheiro3, estatuto3));
        listaNPC.add(new NPC(nome4, dinheiro4, estatuto4));
        listaNPC.add(new NPC(nome5, dinheiro5, estatuto5));
        listaNPC.add(new NPC(nome6, dinheiro6, estatuto6));

        return listaNPC;
    }
}
