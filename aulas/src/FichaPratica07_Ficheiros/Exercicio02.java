package FichaPratica07_Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercicio02 {
    public static void main(String[] args) throws FileNotFoundException {

        String conteudoFicheiro = "Que engraçado";

        File file = new File("aulas/Ficheiros/exercicio_02.txt"); //máquina de ler ficheiro
        PrintWriter escrever = new PrintWriter(file); //máquina de escrever

        escrever.println(conteudoFicheiro);
        escrever.println("Adoro isto!");

        escrever.close();
    }
}
