package Projeto_POO_DPT_Rita_Severa.Repository;

import Projeto_POO_DPT_Rita_Severa.Model.Propriedade;
import Projeto_POO_DPT_Rita_Severa.Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class PropriedadesRepos {
    private ArrayList<Propriedade> propriedades;

    public PropriedadesRepos(String caminho) throws FileNotFoundException {
        CSVReader csvShoppingReader = new CSVReader(caminho);
        this.propriedades = csvShoppingReader.readCSVToRepos();

    }
    public ArrayList<Propriedade> getPropriedades() {
        return propriedades;
    }
}
