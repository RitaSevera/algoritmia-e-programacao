package FichaPratica06_Funcoes;

import java.util.Scanner;

public class Exercicio02 {
    /**
     * Método que lê número positivo e inteiro do utilizador
     * @return Retorna um número posivito e inteiro
     */
    public static int lerNumeroPositivo() {

        Scanner input = new Scanner(System.in);

        int num;

        do {
            System.out.println("Insira um número positivo: ");
            num = input.nextInt();
        } while (num < 0);

        return num;
    }

    /**
     * Método que imprime uma quantidade de asteriscos recebida como parâmetro
     * @param numAsteriscos - número de asteriscos a imprimir na consola
     */
    public static void imprimirAsteriscos (int numAsteriscos){

        for (int indice = 0; indice < numAsteriscos; indice ++){
            System.out.print("*" + " ");
        }
    }
    public static void main(String[] args) {
        int numeroPositivo = lerNumeroPositivo();
        imprimirAsteriscos(numeroPositivo);
    }
}
