package estudoteste;

import java.util.Scanner;

public class Exercicio12Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;
        System.out.println("Escolha entre o menú 1; 2; 3; 4 ");
        menu = input.nextInt();

        switch (menu){
            case 1:
                System.out.println("Escolheu o menu 1: Criar ");
                break;
            case 2:
                System.out.println("Escolheu o menu 2: Atualizar ");
                break;
            case 3:
                System.out.println("Escolheu o menu 3: Eliminar ");
                break;
            case 4:
                System.out.println("");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
