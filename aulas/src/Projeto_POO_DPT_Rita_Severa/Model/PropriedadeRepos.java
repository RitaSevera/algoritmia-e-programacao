package Projeto_POO_DPT_Rita_Severa.Model;

import Projeto_POO_DPT_Rita_Severa.Domain.Propriedade;
import Projeto_POO_DPT_Rita_Severa.Domain.Shopping;
import Projeto_POO_DPT_Rita_Severa.Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PropriedadeRepos {
    private ArrayList<Propriedade> propriedades;

    public PropriedadeRepos(String caminho) throws FileNotFoundException {
        CSVReader csvShoppingReader = new CSVReader(caminho);
        this.propriedades = csvShoppingReader.readCSVToRepos();

    }
    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }
}