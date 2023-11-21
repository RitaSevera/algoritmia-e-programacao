package FichaPratica09.Exercicio11;

public class Main {
    public static void main(String[] args) {

        Conta conta01 = new Conta(123456, 700.50, "Rita");
        Conta conta02 = new Conta(654321, 1000, "Nuno");
        Conta conta03 = new Conta(2468, 2500, "Joaquim");

        System.out.print("Saldo inicial da conta 01: ");
        conta01.mostrarSaldo();
        System.out.print("Saldo inicial da conta 02: ");
        conta02.mostrarSaldo();
        System.out.print("Saldo inicial da conta 03: ");
        conta03.mostrarSaldo();
        System.out.println();

        System.out.println(conta01.depositar(1000) + "€");
        System.out.println(conta01.levantar(120) + "€");
        System.out.println();

        conta02.transferencia(200,conta03);
        System.out.println("Saldo final da conta 02: ");
        conta02.mostrarSaldo();
        System.out.println("Saldo final da conta 03: ");
        conta03.mostrarSaldo();
        System.out.println("Saldo final da conta 01: ");
        conta01.mostrarSaldo();
    }
}
