package GrandesNegocios.View;

import java.util.Scanner;

public class AdminView {
    public AdminView() {
    }
    public static void menuAdmin () {
        Scanner input = new Scanner(System.in);

        int escolha;

        do {
            System.out.println("\n##############################################################################################");
            System.out.println("|                           Bem-vindo ao Menu Administrador!                                   |");
            System.out.println("+ -------------------------------------------------------------------------------------------- +");
            System.out.println("| 1 - Analisar qual o produto que vendeu mais unidades                                         |");
            System.out.println("| 2 - Analisar qual o produto que gerou mais valor de vendas                                   |");
            System.out.println("| 3 - Consultar qual a venda que vendeu mais unidades                                          |");
            System.out.println("| 4 - Consultar qual a venda que vendeu mais valor                                             |");
            System.out.println("| 5 - Obter o total de todas as vendas                                                         |");
            System.out.println("| 6 - Obter a média de todas as vendas                                                         |");
            System.out.println("| 7 - Sair                                                                                     |");
            System.out.println("################################################################################################");
            System.out.print("\nSelecione o que pretende fazer: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Produto que vendeu mais unidades");
                    break;
                case 2:
                    System.out.println("Produto que gerou mais valor de vendas");
                    break;
                case 3:
                    System.out.println("Venda que vendeu mais unidades");
                    break;
                case 4:
                    System.out.println("Venda que vendeu mais valor");
                    break;
                case 5:
                    System.out.println("Total de todas as vendas");
                    break;
                case 6:
                    System.out.println("Média de todas as vendas");
                case 7:
                    System.out.println("Até à próxima :)");
                    break;
            }
        } while (escolha != 7);
    }
}
