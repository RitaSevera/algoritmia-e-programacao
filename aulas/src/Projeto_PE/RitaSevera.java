package Projeto_PE;

import java.util.Scanner;

import static FichaPratica06_Funcoes.Exercicio03.triangulo;

public class RitaSevera {

    /**
     * Método que avalia se um número é triangular
     * @param num número a ser avaliado
     * @return true se for triangular; false se não for
     */
    public static int triangulo (int num) {

        int soma = 0, contador = 1;

        while (soma < num) {
            soma = soma + contador;
            contador ++ ;
            if (soma == num){
                return true;
            }
        }
        return false;
    }

    public static void menuCliente ( ) {
        Scanner input = new Scanner(System.in);

        int opcao, telemovel, lugar = 0, estacionamento;
        String nome, email;

        do {
            System.out.println("Selecione o que pretende fazer: ");
            System.out.println("1 - Registar-se como nosso cliente");
            System.out.println("2 - Procurar lugar de estacionamente na nossa loja física do Porto");
            System.out.println("3 - Imprimir todos os títulos de jogos existentes na loja");
            System.out.println("4 - Segundo uma editora à sua escolha, apresentaremos todas as categorias e respetivos jogos");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nIremos proceder ao seu registo como nosso cliente");
                    System.out.print("Insira o seu nome: ");
                    nome = input.next();
                    System.out.print("Insira o seu contacto telefónico: ");
                    telemovel = input.nextInt();
                    System.out.println("Insira o seu email: ");
                    email = input.next();
                    System.out.println("Obrigada pelo seu registo: " + nome + telemovel + email);
                    break;
                case 2:
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
                            System.out.println("Password errada. Tente novamente");
                        } else if (contador == 2){
                            System.out.println("Excedeu as tentativas");
                        }
                    } while (passwordUtilizador != password && contador < 3 );
                    if (passwordUtilizador == password) {
                        System.out.println("Inseriu a password corretamente");
                    }
                    break;
                case 2:
                    System.out.println("Seja bem-vindo!");
                    break;
                default:
                    System.out.println("Operação inválida.\nEscolha entre administrador e cliente\n");
            }
        } while (escolha != 1 && escolha !=2);
    }
}
