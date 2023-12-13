package EstudoTeste;

import java.util.Scanner;

public class Exercicio11Ficha02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int saldo, movimento, montante;

        System.out.println("Insira o saldo da sua conta bancária: ");
        saldo = input.nextInt();

        System.out.println("Pretende levantar ou depositar na sua conta? Insira 1 para levantar; Insira 2 para depositar ");
        movimento = input.nextInt();

        switch (movimento){
            case 1:
                System.out.println("Qual o montante?");
                montante = input.nextInt();
                if (montante > saldo){
                    System.out.println("Operação inválida. Não tem saldo suficiente.");
                }
                System.out.println("Escolheu um levantamento");
                saldo = saldo - montante;
                System.out.println("Ficou com: " + saldo);
                break;
            case 2:
                System.out.println("Qual o montante?");
                montante = input.nextInt();
                System.out.println("Escolheu depositar");
                saldo = saldo + montante;
                System.out.println("Ficou com: " + saldo);
                break;
            default:
                System.out.println("Operação inválida!");
        }
    }
}
