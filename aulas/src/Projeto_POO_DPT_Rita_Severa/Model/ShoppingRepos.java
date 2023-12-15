package Projeto_POO_DPT_Rita_Severa.Model;

import Projeto_POO_DPT_Rita_Severa.Domain.Shopping;

import java.util.ArrayList;

public class ShoppingRepos {
    private ArrayList<Shopping> listaShopping;

    public ShoppingRepos (String caminho) {
        CSVShoppingReader csvShoppingReader = new CSVShoppingReader(caminho);

    }
}


// public VendasRepository(String filePath) throws FileNotFoundException {
//        CSVVendasReader csvVendasReader = new CSVVendasReader(filePath);
//        this.vendaArray = csvVendasReader.readCSVToRepository();
//    }
//
//    public ArrayList<Venda> getVendaArray() {
//        return vendaArray;
//    }