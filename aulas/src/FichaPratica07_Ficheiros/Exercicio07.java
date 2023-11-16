package FichaPratica07_Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Ficheiros/exercicio_07.txt");
        Scanner sc = new Scanner(file);

        String linha; //não precisava disto
        int totalPalavras = 0, totalLinhas = 0;

        while (sc.hasNextLine()) { //continua enquanto tiver linha
            linha = sc.nextLine(); // Não tinha que pôr linha =; bastava o sc.nextLine();
            totalLinhas++;
        }
        System.out.println("Total de linhas do seu ficheiro: " + totalLinhas);
        sc.close();

        Scanner in = new Scanner(file);
        while (in.hasNext()) { // continua enquanto tiver palavras
            in.next();
            totalPalavras++;
        }
        System.out.println("O número de palavras do seu ficheiro: " + totalPalavras);
    }
}
