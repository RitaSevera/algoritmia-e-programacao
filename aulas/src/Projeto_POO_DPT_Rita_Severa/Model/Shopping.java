package Projeto_POO_DPT_Rita_Severa.Model;

import java.util.ArrayList;

public class Shopping {
    /**
     * Propriedades da classe
     */
    private ArrayList<Propriedade> coisasParaComprar;

    /**
     * Construtor com os atributos
     * @param coisasParaComprar
     */
    public Shopping(ArrayList<Propriedade> coisasParaComprar) {
        this.coisasParaComprar = coisasParaComprar;
    }

    /**
     * Contrutor vazio
     */
    public Shopping() {
    }

    // Getters and Setters
    public ArrayList<Propriedade> getCoisasParaComprar() {
        return coisasParaComprar;
    }

    public void setCoisasParaComprar(ArrayList<Propriedade> coisasParaComprar) {
        this.coisasParaComprar = coisasParaComprar;
    }

    /**
     * Metodo To String
     * @return
     */
    @Override
    public String toString() {
        return "Shopping{" +
                "coisasParaComprar=" + coisasParaComprar +
                '}';
    }
}
