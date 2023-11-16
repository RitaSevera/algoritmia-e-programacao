package FichaPratica06_Funcoes;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String animal;
        System.out.println("Insira um animal: ");
        animal = input.next();
        fazerBarulho(animal);
    }

    /**
     * Método que avalia o barulho do animal
     * @param animal a ser avaliado
     */
    public static void fazerBarulho (String animal){//void é a função

        animal = animal.toLowerCase(); //ponho isto para aceitar maiúsculas e minúsculas

        switch (animal){
            case "cão":
                System.out.println("Au au au");
                break;
            case "gato":
                System.out.println("Miau");
                break;
            case "peixe":
                System.out.println("Glub glub");
                break;
            case "vaca":
                System.out.println("Muuuuu");
                break;
            case "porco":
                System.out.println("Oinc oinc");
                break;
            default:
                System.out.println("Escolha outro animal");
        }
    }
}
