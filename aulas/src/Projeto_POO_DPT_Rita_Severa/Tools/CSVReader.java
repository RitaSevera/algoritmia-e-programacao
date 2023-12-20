package Projeto_POO_DPT_Rita_Severa.Tools;

import Projeto_POO_DPT_Rita_Severa.Domain.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVReader {
    private String caminho;

    public CSVReader(String caminho) {
        this.caminho = caminho;
    }
    public ArrayList<Propriedade> readCSVToRepos () throws FileNotFoundException {
        File ficheiro = new File(this.caminho);
        Scanner sc = new Scanner(ficheiro);

        String linha = sc.nextLine();
        ArrayList<Propriedade> arrayCompras = new ArrayList<>();

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            String[] linhaDividida = linha.split(";");

            String tipo = linhaDividida[0];
            String nome = linhaDividida[1];
            double custo = Double.parseDouble(linhaDividida[2]);
            int estatuto = Integer.parseInt(linhaDividida[3]);
            int lotacaoMaxima = Integer.parseInt(linhaDividida[4]);
            String marca = linhaDividida[5];
            String modelo = linhaDividida[6];
            boolean formal = Boolean.parseBoolean(linhaDividida[7]);

            Propriedade itemAtual = null;

            switch (tipo) {
                case "Imovel":
                    itemAtual = new Imovel(nome, custo, estatuto, lotacaoMaxima);
                    break;
                case "Veiculo":
                    itemAtual = new Veiculo(nome, custo, estatuto, marca, modelo);
                    break;
                case "AcessorioModa":
                    itemAtual = new AcessorioModa(nome, custo, estatuto, marca, formal);
                    break;
            }
            arrayCompras.add(itemAtual);
        }
        return arrayCompras;
    }
}

