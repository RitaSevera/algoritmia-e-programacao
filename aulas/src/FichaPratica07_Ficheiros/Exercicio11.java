package FichaPratica07_Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Ficheiros/exercicio_11.csv");
        Scanner sc = new Scanner(file);

        String linha = sc.nextLine();
        String[][] matriz = new String[46][4];
        int linhaPrincipal = 0;


        while (sc.hasNextLine() && linhaPrincipal < matriz.length) {
            linha = sc.nextLine();
            String[] itensLinha = linha.split(",");

            for (int coluna = 0; coluna < 4 && coluna < itensLinha.length; coluna++) {
                matriz[linhaPrincipal][coluna] = itensLinha[coluna];
            }
            linhaPrincipal++;
        }
        sc.close();
        Scanner input = new Scanner(System.in);
        int escolha;
        do {
            System.out.println("O que pretende fazer? ");
            System.out.println("1 - Pesquisar por músicas de um determinado género ");
            System.out.println("2 - Pesquisar músicas de um determinado artista ");
            System.out.println("3 - Pesquisar música com maior duração ");
            System.out.println("4 - Pesquisar músicas com duração acima de um valor especificado ");
            System.out.println("5 - Número de músicas no ficheiro ");
            System.out.println("6 - Sair ");
            System.out.println("Insira uma opção: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("\n 1 - Indique o género musical que pretende: ");
                    input.nextLine();
                    String genero = input.nextLine(); //para ler a linha, tenho que pôr isto em cima

                    for (linhaPrincipal = 0; linhaPrincipal < matriz.length; linhaPrincipal++) {

                            if (matriz[linhaPrincipal][2].equalsIgnoreCase(genero)) {
                                System.out.println(matriz[linhaPrincipal][0]); //imprimo os nomes das músicas de rock
                            }
                        }
                    break;
                case 2:
                    System.out.println("\n 2 - Indique que artista pretende: ");
                    input.nextLine();
                    String artista = input.nextLine();
                    for (linhaPrincipal = 0; linhaPrincipal < matriz.length; linhaPrincipal++) {

                            if (matriz[linhaPrincipal][1].equalsIgnoreCase(artista)) {
                                System.out.println(matriz[linhaPrincipal][0]);
                            }
                        }
                    break;
                case 3:
                    System.out.println("\n Escolheu a duração: ");
                    double duracao = 0, duracaoMaxima = 0;
                    String musicaMaiorDuracao;
                    for (linhaPrincipal = 0; linhaPrincipal < matriz.length; linhaPrincipal++) {

                            }
                    break;
                case 4:
                    System.out.println("\n Escolheu a duração específica: ");
                    System.out.println("Insira a duração que pretende: ");
                    double valor = input.nextDouble();

                    for (linhaPrincipal = 0; linhaPrincipal < matriz.length; linhaPrincipal++) {
                        double duracaoatual = Double.parseDouble(matriz[linhaPrincipal][3]);
                            if (duracaoatual > valor) {
                                System.out.println(valor);
                            }
                        }
                    break;
                case 5:
                    System.out.println("\n Escolheu o número de músicas: " + matriz.length);
                    break;
                case 6:

                    System.out.println("\n Escolheu sair. Adeus! ");
                    break;
                default:
                    System.out.println("\n Opção inválida! Escolha outra opção (entre 1 e 6)");
            }
        } while (escolha != 6);
    }

}
