package Projeto_PE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class RitaSevera {

    /**
     * Método que retorna o número de linhas totais de um ficheiro
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de linhas totais do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarLinhas (String caminhoFicheiro) throws FileNotFoundException {

        File file = new File(caminhoFicheiro);
        Scanner sc = new Scanner(file);

        int contagemLinhas = 0;

        while (sc.hasNextLine()) {
            sc.nextLine();
            contagemLinhas++;
        }
        return contagemLinhas;
    }

    /**
     * Método que retorna o número de colunas totais de um ficheiro
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de colunas totais do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarColunas (String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File file = new File(caminhoFicheiro);
        Scanner sc = new Scanner(file);

        int contagemColunas = 0;

        String linha = sc.nextLine();
        String [] itensLinha = linha.split(delimitador);
        contagemColunas = itensLinha.length;

        return contagemColunas;
        }

    /**
     * Método que armazena numa matriz o conteudo de um ficheiro
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Matriz String[][] preenchida com o conteudo do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String [][] lerFicheiroMatriz (String caminhoFicheiro) throws FileNotFoundException {

        File file = new File(caminhoFicheiro);
        Scanner sc = new Scanner(file);

        int numeroLinhas = (contarLinhas(caminhoFicheiro)) - 1;
        int numeroColunas = contarColunas(caminhoFicheiro, ";");

        String [][] matriz = new String[numeroLinhas][numeroColunas];

        String linhaAtual = sc.nextLine();
        int linhaMatriz = 0;

        while (sc.hasNextLine()) {
            linhaAtual = sc.nextLine();
            String [] itensLinha = linhaAtual.split(";");

            for (int indice = 0; indice < itensLinha.length; indice++) {
                matriz[linhaMatriz][indice] = itensLinha[indice];
            }
            linhaMatriz++;
        }
        return matriz;
    }

    /**
     * Método para imprimir uma matriz na consola
     * @param matriz Matriz a imprimir
     */
    public static void imprimirMatrizConsola(String[][] matriz) { //usar no menu admin - ex: 1

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]);
            }
            System.out.println();
        }
    }

    /**
     * Método para imprimir um menu
     * @param matriz Matriz a imprimir
     */
    public static void menuCliente (String[][] matriz) {

        Scanner input = new Scanner(System.in);
        int opcao, telemovel;
        String nome, email;

        do {
            System.out.println("\nSelecione o que pretende fazer");
            System.out.println("1 - Registar-se como nosso cliente");
            System.out.println("2 - Ver quantos lugares de estacionamente estão disponíveis na nossa loja física do Porto");
            System.out.println("3 - Imprimir todos os títulos de jogos existentes na loja");
            System.out.println("4 - Segundo uma editora à sua escolha, apresentaremos todas as categorias e respetivos jogos");
            System.out.println("5 - Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nIremos proceder ao seu registo como nosso cliente");
                    System.out.print("Insira o seu nome: ");
                    nome = input.next();
                    System.out.print("Insira o seu contacto telefónico: ");
                    telemovel = input.nextInt();
                    System.out.print("Insira o seu email: ");
                    email = input.next();
                    System.out.print("Obrigada pelo seu registo na GameStart: " +  " " + nome + " " + telemovel + " " + email );
                    break;
                case 2:
                    System.out.println("Os lugares disponíveis no nosso parque de estacionamento: ");
                    lugaresVazios(121);
                    break;
                case 3:
                    System.out.println("Todos os títulos de jogos: ");
                    todosJogos(matriz);
                    break;
                case 4:
                    System.out.println("!!!ERRO!!!");
                    System.out.println("Tente novamente no final do curso...");
                    break;
                case 5:
                    System.out.println("Até à próxima!");
                    break;
                default:
                    System.out.println("Operação inválida");
            }
        } while (opcao != 5);
    }
    /**
     * Método para imprimir um menu
     * @param matriz Matriz a imprimir
     */
    public static void menuAdministrador(String[][] matriz) {
        Scanner input = new Scanner(System.in);

        int optar;

        do {
            System.out.println("\nSelecione o que pretende fazer: ");
            System.out.println("1 - Imprimir conteúdo do ficheiro");
            System.out.println("2 - Saber a quantidade de vendas que foram executadas e o seu valor total");
            System.out.println("3 - Saber o total do lucro");
            System.out.println("4 - Imprimir todas as informações associadas a um cliente específico");
            System.out.println("5 - Ver qual é o jogo mais caro e os clientes que o compraram");
            System.out.println("6 - Sair");
            optar = input.nextInt();

            switch (optar) {
                case 1:
                    System.out.println("\nConteúdo do ficheiro: ");
                    imprimirMatrizConsola(matriz);
                    break;
                case 2:
                    System.out.println("Quantidade de vendas: " + matriz.length);
                    System.out.println("Valor total das vendas: " + totalVendas(matriz));
                    break;
                case 3:
                    System.out.println("Total de lucro: ");
                    break;
                case 4:
                    System.out.println("Informações de um cliente: ");
                    break;
                case 5:
                    System.out.println("Jogo mais caro e clientes que o compraram: ");
                    break;
                case 6:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Operação inválida");
            }
        } while (optar != 6);
    }

    /**
     * Método que avalia números triangulares múltiplos de 5
     * @param num número a ser avaliado
     */
    public static void lugaresVazios(int num) { //Delcaro função e passo num como parâmetro

        int soma = 0, contador = 1;

        while (soma < num) { //enquanto a soma for menor que 121 o ciclo continua
            soma = soma + contador;// adiciona o valor atual da soma de contador à soma
            contador++;
            if (soma <= num && soma % 5 == 0) {
                System.out.println(soma);
            }
        }
    }

    /**
     * Método que avalia o título de jogos do ficheiro
     * @param matriz Matriz a imprimir
     */
    public static void todosJogos(String[][] matriz) {
        for (int linha = 0; linha < matriz.length; linha++) {
            System.out.println("Título do jogo: " + matriz[linha][7]);
        }
    }

    /**
     * Método que armazena numa matriz o total das vendas
     * @param matriz Matriz a imprimir
     * @return a soma das vendas
     */
    public static double totalVendas(String[][] matriz) {

        double soma = 0;

        for (int linha = 0; linha < matriz.length; linha++ ) {
            soma = Double.parseDouble((soma + matriz[linha][8]));
        }
        return soma;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String[][] matriz = lerFicheiroMatriz("FicheiroProjeto/GameStart_V2.csv");

        int escolha;
        int password = 12345, passwordUtilizador, contador = 0;

        do {
            System.out.println("Bem-vindo à GameStart! Selecione o tipo de utilizador: 1 - Administrador || 2 - Cliente ");
            escolha = input.nextInt();

            switch (escolha){
                case 1:
                    do {
                        contador ++;
                        System.out.println("Insira a password: ");
                        passwordUtilizador = input.nextInt();
                        if (passwordUtilizador != password) {
                            System.out.println("Password errada.");
                        }
                    } while (passwordUtilizador != password && contador < 3 );

                    if (passwordUtilizador == password) {
                        System.out.println("Inseriu a password corretamente");
                        menuAdministrador(matriz);
                    } else {
                        System.out.println("Excedeu as tentativas");
                    }
                    break;
                case 2:
                    System.out.println("Seja bem-vindo!");
                    menuCliente(matriz);
                    break;
                default:
                    System.out.println("Operação inválida.\nEscolha entre administrador e cliente\n");
            }
        } while (escolha != 1 && escolha !=2);
    }
}