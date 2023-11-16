package Projeto_PE;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class RitaSevera {

    /**
     * Método que retorna o número de linhas totais de um ficheiro
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de Linhas Totais
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
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Número de Colunas Totais
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
     *
     * @param caminhoFicheiro Caminho do Ficheiro
     * @return Matriz String[][] preenchida com o conteudo
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
     *
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

    public static void menuCliente () {

        Scanner input = new Scanner(System.in);
        int opcao, telemovel;
        String nome, email;

        do {
            System.out.println("\nSelecione o que pretende fazer");
            System.out.println("1 - Registar-se como nosso cliente");
            System.out.println("2 - Ver quantos lugares estacionamente estão disponíveis na nossa loja física do Porto");
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
                    System.out.print("Obrigada pelo seu registo: " +  " " + nome + " " + telemovel + " " + email );
                    break;
                case 2:
                    System.out.println("Os lugares disponíveis no nosso parque de estacionamento: ");
                    lugaresVazios(121);
                    break;
                case 3:
                    System.out.println("Todos os títulos de jogos: ");

                    break;
                case 4:
                    System.out.println("Categorias e respetivos jogos");
                case 5:
                    System.out.println("Até à próxima!");
                    break;
                default:
                    System.out.println("Operação inválida");
            }
        } while (opcao != 5);
    }

    public static void menuAdministrador () throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String[][] matriz = lerFicheiroMatriz("FicheiroProjeto/GameStart_V2.csv");

        int optar;

        do {
            System.out.println("Selecione o que pretende fazer: ");
            System.out.println("1 - Imprimir conteúdo do ficheiro");
            System.out.println("2 - Saber a quantidade de vendas que foram executadas e o seu valor total");
            System.out.println("3 - Saber p total do lucro");
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
                    System.out.println("Quantidade de vendas e o valor total: ");
                    totalVendas(matriz);
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
     * @return os números de 0 até 121 que sejam triangulares e múltiplos de 5
     */
    public static void lugaresVazios (int num) { //Delcaro função e passo num como parâmetro

        int soma = 0, contador = 1;
        num = 121;

        while (soma < num) { //enquanto a soma for menor que 121 o ciclo continua
            soma = soma + contador;// adiciona o valor atual da soma de contador à soma
            contador++;
            if (soma <= num && soma % 5 == 0) {
                System.out.println(soma);
            }
        }
    }
    public static void todosJogos (String matriz [][],String jogo) {

        for (int linha = 0; linha < matriz.length; linha++) {

            if (matriz[linha][7].equals(jogo)) {
                System.out.println("Título do jogo: " + matriz[linha][7]);
            }
        }
    }

    public static void totalVendas (String matriz [][]) {

        int soma = 0;

        for (int linha = 0; linha < matriz.length; linha++ ) {
            String[] vendas = matriz[linha][0].split("-");
            soma = Integer.parseInt(soma + matriz[linha][0]);
            }
        }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String[][] matriz = lerFicheiroMatriz("FicheiroProjeto/GameStart_V2.csv");

        int escolha;
        int password = 12345, passwordUtilizador, contador = 0;

        do {
            System.out.println("Bem-vindo! Selecione o tipo de utilizador: 1 - Administrador || 2 - Cliente ");
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
                    System.out.println("Excedeu as tentativas");
                    if (passwordUtilizador == password) {
                        System.out.println("Inseriu a password corretamente");
                        menuAdministrador();
                    }
                    break;
                case 2:
                    System.out.println("Seja bem-vindo!");
                    menuCliente();
                    break;
                default:
                    System.out.println("Operação inválida.\nEscolha entre administrador e cliente\n");
            }
        } while (escolha != 1 && escolha !=2);
}
}