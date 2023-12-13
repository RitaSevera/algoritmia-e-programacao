package GrandesNegocios.View;

import java.util.Scanner;

public class FuncView {
    public FuncView() {
    }
    public static void menuFunc () {
        Scanner input = new Scanner(System.in);

        int escolha;

        do {
            System.out.println("\n##############################################################################################");
            System.out.println("|                           Bem-vindo ao Menu Funcionário!                                     |");
            System.out.println("+ -------------------------------------------------------------------------------------------- +");
            System.out.println("| 1 - Adicionar uma nova venda                                                                 |");
            System.out.println("| 2 - Consultar stock de determinado produto                                                   |");
            System.out.println("| 5 - Sair                                                                                     |");
            System.out.println("################################################################################################");
            System.out.print("\nSelecione o que pretende fazer: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Adicione uma nova venda");
                    break;
                case 2:
                    System.out.println("Stock de determinado produto");
                    break;
                case 3:
                    System.out.println("Até à próxima");
                    break;
            }
        } while (escolha != 3);
    }
}
