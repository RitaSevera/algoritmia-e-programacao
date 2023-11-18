package Projeto_PE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RitaSevera {

    /**
     * Método que conta o número de linhas totais de um ficheiro
     * @param caminhoFicheiro ficheiro que é lido
     * @return Número de linhas totais do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarLinhas (String caminhoFicheiro) throws FileNotFoundException {

        File file = new File(caminhoFicheiro);
        Scanner sc = new Scanner(file);

        int contagemLinhas = 0;

        while (sc.hasNextLine()) { //enquanto houver linhas
            sc.nextLine();
            contagemLinhas++; // elas incrementam
        }
        return contagemLinhas;
    }

    /**
     * Método que conta o número de colunas totais de um ficheiro
     * @param caminhoFicheiro ficheiro que é lido
     * @return Número de colunas totais do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static int contarColunas (String caminhoFicheiro, String delimitador) throws FileNotFoundException {

        File file = new File(caminhoFicheiro);
        Scanner sc = new Scanner(file);

        int contagemColunas = 0;

        String linha = sc.nextLine();
        String [] itensLinha = linha.split(delimitador); //estou a dizer que vai dividir sempre que houver ;
        contagemColunas = itensLinha.length;

        return contagemColunas;
        }

    /**
     * Método que lê o conteúdo de um ficheiro e o armazena para dentro de uma matriz
     * @param caminhoFicheiro ficheiro que é lido
     * @return Matriz preenchida com o conteudo do ficheiro
     * @throws FileNotFoundException Caso o ficheiro não seja encontrado
     */
    public static String [][] lerFicheiroMatriz (String caminhoFicheiro) throws FileNotFoundException {

        File file = new File(caminhoFicheiro);
        Scanner sc = new Scanner(file);

        int numeroLinhas = (contarLinhas(caminhoFicheiro)) - 1; //ponho -1 para retirar a linha de cabeçalo
        int numeroColunas = contarColunas(caminhoFicheiro, ";");

        String [][] matriz = new String[numeroLinhas][numeroColunas]; //declaro a matriz com o tamanho certo de linhas e colunas

        String linha = sc.nextLine();
        int linhaAtual = 0;

        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            String [] itensLinha = linha.split(";");

            for (int indice = 0; indice < itensLinha.length; indice++) {
                matriz[linhaAtual][indice] = itensLinha[indice];
            }
            linhaAtual++;
        }
        return matriz;
    }

    /**
     * Método para imprimir uma matriz na consola (conteúdo do ficheiro é impresso)
     * @param matriz Matriz a imprimir
     */
    public static void imprimirMatrizConsola(String[][] matriz) {

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {
                System.out.print(matriz[linha][coluna]);
            }
            System.out.println();
        }
    }

    /**
     * Método para imprimir um menu
     * @param matriz conteúdo
     */
    public static void menuCliente (String[][] matriz) {

        Scanner input = new Scanner(System.in);
        int opcao, telemovel;
        String nome, email;

        do {
            System.out.println("\nMenu Cliente");
            System.out.println("1 - Registar-se como nosso cliente");
            System.out.println("2 - Ver quais os lugares de estacionamente que estão disponíveis na nossa loja física do Porto");
            System.out.println("3 - Imprimir todos os títulos de jogos existentes na loja");
            System.out.println("4 - Segundo uma editora à sua escolha, apresentaremos todas as categorias e respetivos jogos");
            System.out.println("5 - Sair");
            System.out.print(" \nSelecione o que pretende fazer: ");
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
                    System.out.println("\nObrigada pelo seu registo na GameStart: " +  "\n" + nome + "\n" + telemovel + "\n" + email );
                    break;
                case 2:
                    System.out.println("\nOs lugares disponíveis no nosso parque de estacionamento: ");
                    lugaresVazios(121);
                    break;
                case 3:
                    System.out.println("\nTodos os títulos de jogos: ");
                    todosJogos(matriz);
                    break;
                case 4:
                    System.out.println("!!!ERRO!!!");
                    System.out.println("Tente novamente no final do curso :(");
                    break;
                case 5:
                    System.out.println("Obrigada pela sua visita. Até à próxima!");
                    break;
                default:
                    System.out.println("\nOperação inválida. Selecione entre a opção 1 a opção 5.");
            }
        } while (opcao != 5);
    }
    /**
     * Método para imprimir um menu
     * @param matriz conteúdo
     */
    public static void menuAdministrador(String[][] matriz) {
        Scanner input = new Scanner(System.in);

        int optar;
        String id, jogoMaisCaro;

        do {
            System.out.println("\nMenu Administrador");
            System.out.println("1 - Imprimir conteúdo do ficheiro");
            System.out.println("2 - Saber a quantidade de vendas que foram executadas e o seu valor total");
            System.out.println("3 - Saber o total do lucro");
            System.out.println("4 - Imprimir todas as informações associadas a um cliente específico");
            System.out.println("5 - Ver qual é o jogo mais caro e os clientes que o compraram");
            System.out.println("6 - Sair");
            System.out.print("\nSelecione o que pretende fazer: ");
            optar = input.nextInt();

            switch (optar) {
                case 1:
                    System.out.println("\nConteúdo do ficheiro: ");
                    imprimirMatrizConsola(matriz);
                    break;
                case 2:
                    System.out.println("Quantidade de vendas: " + matriz.length);
                    System.out.println("Valor total das vendas: " + totalVendas(matriz) + "€");
                    break;
                case 3:
                    System.out.println("Total de lucro: " + lucro(matriz) + "€");
                    break;
                case 4:
                    System.out.println("Insira o id Cliente do qual pretende obter informações");
                    id= input.next();
                    System.out.println("Informações de um cliente:");
                    idCliente(matriz,id);
                    break;
                case 5:
                    jogoMaisCaro = jogoMaisCaro(matriz); // guardei o que a função me retorna numa variável
                    System.out.println("O jogo mais caro: " + jogoMaisCaro);
                    System.out.println("Clientes que o compraram: ");
                    clientesCompraram(matriz, jogoMaisCaro);
                    break;
                case 6:
                    System.out.println("Até à próxima");
                    break;
                default:
                    System.out.println("\nOperação inválida. Selecione entre a opção 1 a opção 6.");
            }
        } while (optar != 6);
    }

    /**
     * Método que avalia números triangulares múltiplos de 5
     * @param num número a ser avaliado
     */
    public static void lugaresVazios(int num) { //Delcaro função e passo num como parâmetro

        int soma = 0, contador = 1;

        while (soma < num) {
            soma = soma + contador;
            contador++;
            if (soma <= num && soma % 5 == 0) {
                System.out.println(soma);
            }
        }
    }

    /**
     * Método que imprime o título de jogos do ficheiro (sem os duplicar)
     * @param matriz conteúdo
     */
    public static void todosJogos(String[][] matriz) {

        int contador = 0; //conta quantas vezes o jogo aparece na matriz

        for (int linha = 0; linha < matriz.length; linha++) { //percorre todas as linhas da matriz
            for (int indice = 0; indice < matriz.length; indice++) { //volta a percorrer todas as linhas para comparar o título do jogo que tem com todos os outros
                if (matriz[linha][7].equals(matriz[indice][7])) { // se o título for igual a outro título noutra linha, o contador aumenta
                    contador++;
                }
            }
            if (contador == 1) { // se o contador for igual a 1, é sinal que o título só aparece uma vez na matriz
                System.out.println("Título do jogo: " + matriz[linha][7]); // sendo assim, o título é impresso
            }
        }
    }
    /**
     * Método que armazena numa matriz o total das vendas
     * @param matriz conteúdo
     * @return a soma das vendas
     */
    public static double totalVendas(String[][] matriz) {

        double soma = 0, valorTotal=0;

        for (int linha = 0; linha < matriz.length; linha++ ) {
            soma = Double.parseDouble((matriz[linha][8]));
            valorTotal = valorTotal + soma;
        }
        return valorTotal;
    }

    /**
     * Método que armazena numa matriz o lucro das vendas
     * @param matriz conteúdo
     * @return o lucro das vendas
     */
    public static double lucro (String [][] matriz) {

        double vendas = totalVendas(matriz);
        double lucro;

        lucro = vendas*0.20;
        return lucro;
    }

    /**
     * Método que encontra as informações de um cliente em específico
     * @param matriz conteúdo
     * @param idCliente número id associado a cada cliente
     */
    public static void idCliente (String [][] matriz, String idCliente) {

        for (int linha = 0; linha < matriz.length; linha++){
            if (matriz[linha][1].equals(idCliente)) {
                System.out.println(matriz[linha][2] + " " +  matriz[linha][3] + " " + matriz[linha][4]);
                break;// faço break para ele não imprimir as informações várias vezes
            }
        }
    }

    /**
     * Método que encontra o jogo mais cero
     * @param matriz conteúdo
     * @return o nome do jogo mais caro
     */
    public static String jogoMaisCaro (String [][] matriz){

        double preco, jogoMaisCaro = 0;
        String jogoCaro = ""; //criei uma string para aparecer o nome do jogo e não o valor

        for (int linha = 0; linha < matriz.length; linha++){
            preco = Double.parseDouble((matriz[linha][8]));// estou a pôr o preço como double
            if (preco > jogoMaisCaro) { //se o preço atual for maior que o jogo mais caro
                jogoMaisCaro = Double.parseDouble((matriz[linha][8])); // atualizo o jogo mais caro (se ficasse por aqui ia imprimir o valor e não o nome do jogo)
                jogoCaro = matriz[linha][7]; // o nome do jogo está na coluna 7, então é isso que vou imprimir
            }
        }
        return jogoCaro;
    }

    /**
     * Método que encontra os clientes que compraram o jogo mais caro
     * @param matriz conteúdo
     * @param jogoCaro jogo que os clientes compraram
     */

    public static void clientesCompraram (String [][] matriz, String jogoCaro) {

        for (int linha = 0; linha < matriz.length; linha ++){
            if (matriz[linha][7].equals(jogoCaro)) {
                System.out.println(matriz[linha][2]);
            }
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String[][] matriz = lerFicheiroMatriz("FicheiroProjeto/GameStart_V2.csv");

        int escolha;
        int password = 12345, passwordUtilizador, contador = 0;

        do {
            System.out.println("\nBem-vindo à GameStart! Selecione o tipo de utilizador: 1 - Administrador || 2 - Cliente ");
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
                        System.out.println("\nInseriu a password corretamente");
                        menuAdministrador(matriz);
                    } else {
                        System.out.println("Excedeu as tentativas");
                    }
                    break;
                case 2:
                    System.out.println("\nSeja bem-vindo!");
                    menuCliente(matriz);
                    break;
                default:
                    System.out.println("\nOperação inválida.\nEscolha entre 1 - administrador ou 2 - cliente\n");
            }
        } while (escolha != 1 && escolha !=2);
    }
}