package FichaPratica04_ciclos;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;

        do {
            System.out.println("Apresentação dos menús");
            System.out.println("Menú 1: Criar");
            System.out.println("Menú 2: Atualizar");
            System.out.println("Menú 3: Eliminar");
            System.out.println("Menú 4: Sair");
            System.out.println("\nEscolha o menú que pretende (1; 2; 3 ou 4): ");
            menu = input.nextInt();

            switch (menu){
                case 1:
                    System.out.println("\nEscolheu o menú 1: Criar\nEscolha novamente um menú\n");
                    break;
                case 2:
                    System.out.println("\nEscolheu o menú 2: Atualizar\nEscolha novamente um menú\n");
                    break;
                case 3:
                    System.out.println("\nEscolheu o menú 3: Eliminar\nEscolha novamente um menú\n");
                    break;
                case 4:
                    System.out.println("\nParabéns! Escolheu o menú 4: Sair");
                    break;
                default:
                    System.out.println("Operação inválida.\nEscolha novamente\n");
            }
        }while (menu != 4);
    }
}
