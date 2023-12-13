package GrandesNegocios.View;

import java.util.Scanner;

public class ClientView {
    public ClientView() {//construtor
    }
    public static void menuClient () {
        Scanner input = new Scanner(System.in);

        int escolha;

        do {
            System.out.println("\n##############################################################################################");
            System.out.println("|                           Bem-vindo ao Menu Cliente!                                         |");
            System.out.println("+ -------------------------------------------------------------------------------------------- +");
            System.out.println("| 1 - Consultar produtos disponíveis                                                           |");
            System.out.println("| 2 - Consultar um produto de determinada categoria                                            |");
            System.out.println("| 3 - Consultar o produto mais barato                                                          |");
            System.out.println("| 4 - Consultar o produto mais caro                                                            |");
            System.out.println("| 5 - Abandonar a nossa loja                                                                   |");
            System.out.println("################################################################################################");
            System.out.print("\nSelecione o que pretende fazer: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Produtos disponíveis no nosso minimercado");
                    break;
                case 2:
                    System.out.println("Produto de determinada categoria");
                    break;
                case 3:
                    System.out.println("O produto mais barato");
                    break;
                case 4:
                    System.out.println("O produto mais caro");
                    break;
                case 5:
                    System.out.println("Obrigada! Até à próxima :)");
                    break;
            }
        } while (escolha != 5);
    }
}
