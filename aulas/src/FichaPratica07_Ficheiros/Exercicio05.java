package FichaPratica07_Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Ficheiros/exercicio_05_31.txt");

        Scanner sc = new Scanner(file);

        double soma = 0;
        int num = 0;

        while (sc.hasNextInt()){
            num = sc.nextInt();
            soma = soma + num;
        }
        System.out.println("Soma dos números: " + soma);
        sc.close();
    }
}

