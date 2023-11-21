package FichaPratica07_Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("aulas/Ficheiros/exercicio_06.txt");
        Scanner sc = new Scanner(file);

        String linha, nomeAtual, nomeVelho = "";
        int idadeMaior = 0, idade;

        // Enquanto o ficheiro tiver linha avança
        while (sc.hasNextLine()) {
            linha = sc.nextLine(); // Atribuo a linha atual
            String[] itensLinha = linha.split(","); // Separo a linha atual pela vírgula

            nomeAtual = itensLinha[0];
            idade = Integer.parseInt(itensLinha[1]);

            if (idade > idadeMaior) {
                idadeMaior = idade;
                nomeVelho = nomeAtual;
            }
        }
        System.out.println("Nome da pessoa mais velha é " + nomeVelho + " sendo a sua idade " + idadeMaior);
        sc.close();
    }
}
