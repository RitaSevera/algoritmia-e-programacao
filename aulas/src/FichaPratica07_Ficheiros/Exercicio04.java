package FichaPratica07_Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Ficheiros/exercicio_04.csv");

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
