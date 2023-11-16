package FichaPratica07_Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) throws FileNotFoundException {

        //Vou abrir o ficheiro que quero
        File file = new File("Ficheiros/exercicio_01.txt");

        Scanner sc = new Scanner(file);

        String linha;

        //Digo que, enquanto houver linha, ele vai imprimi-lá
        while (sc.hasNextLine()){
            linha = sc.nextLine();
            System.out.println(linha);
        }
        //Fecho o ficheiro
        sc.close();
    }
}
