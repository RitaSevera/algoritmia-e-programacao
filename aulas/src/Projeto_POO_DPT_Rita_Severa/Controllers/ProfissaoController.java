package Projeto_POO_DPT_Rita_Severa.Controllers;

import Projeto_POO_DPT_Rita_Severa.Model.Profissao;

import java.util.ArrayList;

public class ProfissaoController {
    /**
     * Método para criar profissões e adicionar ao array
     * @return
     */

    public ArrayList<Profissao> criarProfissoes() {
        ArrayList<Profissao> listaProfissoes = new ArrayList<>();

        String nome1 = "Programador";
        double salarioDia1 = 150.0;
        boolean formal1 = false;
        int estatuto1 = 150;
        int nivelMinimoEducacao1 = 7;

        String nome2 = "Ator";
        double salarioDia2 = 50.0;
        boolean formal2 = false;
        int estatuto2 = 50;
        int nivelMinimoEducacao2 = 4;

        String nome3 = "Paleontologo";
        double salarioDia3 = 100.0;
        boolean formal3 = true;
        int estatuto3 = 130;
        int nivelMinimoEducacao3 = 7;

        String nome4 = "Chef de cozinha";
        double salarioDia4 = 100.0;
        boolean formal4 = false;
        int estatuto4 = 120;
        int nivelMinimoEducacao4 = 5;

        String nome5 = "Empregado de mesa";
        double salarioDia5 = 15;
        boolean formal5 = false;
        int estatuto5 = 0;
        int nivelMinimoEducacao5 = 0;

        listaProfissoes.add(new Profissao(nome1, salarioDia1, formal1, estatuto1, nivelMinimoEducacao1));
        listaProfissoes.add(new Profissao(nome2, salarioDia2, formal2, estatuto2, nivelMinimoEducacao2));
        listaProfissoes.add(new Profissao(nome3, salarioDia3, formal3, estatuto3, nivelMinimoEducacao3));
        listaProfissoes.add(new Profissao(nome4, salarioDia4, formal4, estatuto4, nivelMinimoEducacao4));
        listaProfissoes.add(new Profissao(nome5, salarioDia5, formal5, estatuto5, nivelMinimoEducacao5));

        return listaProfissoes;
    }
}
