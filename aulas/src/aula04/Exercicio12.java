package aula04;

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menu;
        System.out.println("Escolha o menú:");
        System.out.println("Menú 1: Criar");
        System.out.println("Menú 2: Atualizar");
        System.out.println("Menú 3: Eliminar");
        System.out.println("Menú 4: Sair");
        menu = input.nextInt();

        if (menu==1){
            System.out.println("Escolheu o menu 1:");
        }
        if (menu==2){
            System.out.println("Escolheu o menu 2");
        }
        if (menu==3){
            System.out.println("Escolheu o menu 3");
        }
        if (menu==4){
            System.out.println("");
        }
        if (menu >=5){
            System.out.println("Operação inválida");
        }
    }
}
// podia fazer com switch
//switch (menu){
//case 1:
// sout ("escolheu o menu 1");
//break;
//case 2:
// sout ("Escolheu o menu 2");
//break;
//case 4:
//break;
//defautl
// sout ("Operação inválida")


