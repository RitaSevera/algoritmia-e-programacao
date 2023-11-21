package FichaPratica10.Exercicio02;

public class Main {
    public static void main(String[] args) {

        Conta conta01 = new Conta(123456, 700.50, "Rita");
        Conta conta02 = new Conta(654321, 1000, "Nuno");
        Conta conta03 = new Conta(2468, 2500, "Joaquim");

        System.out.println("Saldo inicial da conta 01: " + conta01.getSaldo() + "€");
        System.out.println("Saldo inicial da conta 02: " + conta02.getSaldo() + "€");
        System.out.println("Saldo inicial da conta 03: " + conta03.getSaldo() + "€");
        System.out.println();

        System.out.println("Pediu um empréstimo de 900€");
        conta02.pedirEmprestimo(900);
        System.out.println("O valor atual da sua conta 02: " + conta02.getSaldo() + "€");
        System.out.println("O valor da sua dívida na conta 02: " + conta02.getValorDivida() + "€");
        conta02.pedirEmprestimo(1710);
    }
}
