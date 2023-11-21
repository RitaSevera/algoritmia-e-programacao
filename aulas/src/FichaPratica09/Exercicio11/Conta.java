package FichaPratica09.Exercicio11;

public class Conta {
    private int numeroConta;
    private double saldo;
    private String titular;

    public Conta(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }
    public void transferencia (double valorTransferir, Conta contadestinatario) {
        if (valorTransferir <= this.saldo) {
            System.out.println("Valor transferido: " + valorTransferir);
            this.saldo = this.saldo - valorTransferir;
            contadestinatario.depositar(valorTransferir);
        } else {
            System.out.println("Não é possível efetuar a transferência, não tem saldo suficiente.");
        }
    }

    public double depositar (double valor) {
        System.out.println("Depositou: " + valor);
        return this.saldo = this.saldo + valor;
    }
    public double levantar (double valor) {
        if (valor <= this.saldo) {
            System.out.println("Levantou: " + valor);
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Não tem dinheiro suficiente :( ");
        }
        return this.saldo;
    }
    public void mostrarSaldo () {
        System.out.println(this.saldo);

    }
}
