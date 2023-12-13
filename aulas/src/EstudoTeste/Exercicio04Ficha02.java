package EstudoTeste;

import java.util.Scanner;

public class Exercicio04Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lugar;

        System.out.println("Em que lugar ficou na corrida? ");
        lugar = input.nextInt();

        if (lugar == 1){
            System.out.println("Parabéns! Ganhou 10 pontos");
        }
        if (lugar == 2){
            System.out.println("Parabéns! Ganhou 8 pontos");
        }
        if (lugar == 3){
            System.out.println("Parabéns! Ganhou 6 pontos");
        }
        if (lugar == 4){
            System.out.println("Parabéns! Ganhou 5 pontos");
        }
        if (lugar == 5){
            System.out.println("Parabéns! Ganhou 4 pontos");
        }
        if (lugar == 6){
            System.out.println("Parabéns! Ganhou 3 pontos");
        }
        if (lugar == 7){
            System.out.println("Parabéns! Ganhou 2 pontos");
        }
        if (lugar == 8){
            System.out.println("Parabéns! Ganhou 1 pontos");
        }
        if (lugar >=9 ){
            System.out.println("Não conseguiu ganhar pontos. Não desista, tente novamente!");
        }
    }
}
