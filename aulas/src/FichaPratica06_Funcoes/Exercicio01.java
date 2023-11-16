package FichaPratica06_Funcoes;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        num = input.nextInt();
        System.out.println("numero: ");
        int soma = 0;

        for (int indice = 1; indice < num; indice ++){
            if (num % indice  == 0){
                soma = soma + indice ;
            };
    }
}
}
//quero passar feedback leva return, vai-me dar jeito, então faço return para depois usar e não apenas imprimir na consola
//