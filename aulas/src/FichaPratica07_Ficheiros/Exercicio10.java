package FichaPratica07_Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("aulas/Ficheiros/exercicio_10.csv"); //trazer ficheiro para o programa
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine(); //grava a linha do cabeçalho, para depois já não entrar no ciclo (quis avançar esta à frente)
        double total = 0, preco, quantidade, totalFinal = 0;

        while (sc.hasNextLine()) { //enquanto scanner tiver linha para a frente
            linha = sc.nextLine(); // agora já não tenho a do cabeçalho, mas sim a segunda linha do ficheiro
            String [] itensLinha = linha.split(","); //vírgula é caractér de separação. Crio array com base na linha que está a ler
            // crio como string pq é o mais abrangente, aceita texto e números

            quantidade = Double.parseDouble(itensLinha[2]); //a quantidade está na posição 2 do array. É uma string mas quero entende-la como double
            preco = Double.parseDouble(itensLinha[3]); //o preço está na posição 3 do array. É uma string mas quero entende-la como double

            total = quantidade * preco;
            totalFinal = totalFinal + total;
        }
        System.out.println("Total: " + totalFinal + "€");
        sc.close();
    }
}