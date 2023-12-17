package Projeto_POO_DPT_Rita_Severa.Model;

import Projeto_POO_DPT_Rita_Severa.Domain.Shopping;
import Projeto_POO_DPT_Rita_Severa.Tools.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ShoppingRepos {
    private ArrayList<Shopping> vendaArray;

    public ShoppingRepos (String caminho) throws FileNotFoundException {
        CSVReader csvShoppingReader = new CSVReader(caminho);
        this.vendaArray = csvShoppingReader.readCSVToRepos();

    }
    public ArrayList<Shopping> getVendaArray() {
        return vendaArray;
    }
}