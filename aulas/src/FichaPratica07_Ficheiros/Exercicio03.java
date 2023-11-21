package FichaPratica07_Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio03 {
    public Exercicio03() throws FileNotFoundException {
    }

    public static void main(String[] args) throws FileNotFoundException { //Definição do método MAIN

        //Vou abrir o ficheiro que quero
        File file = new File("aulas/Ficheiros/exercicio_03_Alternativa01.txt");

        File ficheiro = new File("aulas/Ficheiros/exercicio_03_cópia.txt"); //máquina de ler ficheiro

        Scanner sc = new Scanner(file); //o tipo
        PrintWriter escrever = new PrintWriter(ficheiro);

        String linha;

        //Digo que, enquanto houver linha, ele vai imprimi-lá
        while (sc.hasNextLine()){
            linha = sc.nextLine();
            System.out.println(linha);
            escrever.println(linha);
        }
        //Fecho o ficheiro
        sc.close();
        escrever.close();
    }
}




