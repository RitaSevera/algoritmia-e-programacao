package Projeto_POO_DPT_Rita_Severa.Tools;

import Projeto_POO_DPT_Rita_Severa.Domain.Shopping;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
    private String caminho;

    public CSVReader(String caminho) {
        this.caminho = caminho;
    }
    public ArrayList<Shopping> readCSVToRepos () throws FileNotFoundException {
        File ficheiro = new File(this.caminho);
        Scanner sc = new Scanner(ficheiro);

        String linha = sc.nextLine();
        ArrayList<Shopping> arrayCompras = new ArrayList<>();

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaDividida = linha.split(";");

            String tipo = linhaDividida[0];
            String nome = linhaDividida[1];
            int estatuto = Integer.parseInt(linhaDividida[2]);
            int lotacaoMaxima = Integer.parseInt(linhaDividida[3]);
            String marca = linhaDividida[4];
            String modelo = linhaDividida[5];
            boolean formal = Boolean.parseBoolean(linhaDividida[6]);

            Shopping compraAtual = new Shopping(tipo, nome, estatuto, lotacaoMaxima, marca, modelo, formal);
            arrayCompras.add(compraAtual);
        }
        return arrayCompras;
    }
}
