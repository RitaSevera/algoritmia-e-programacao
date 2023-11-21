package FichaPratica10.Exercicio02;

public class Conta {
    private int numeroConta;
    private double saldo;
    private String titular;
    private int anoAbertura = 2023;
    private double margemEmprestimo = 0.9;
    private double valorDivida=0;

    public Conta(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }
    /*public double margemEmprestimo () {
        double margem;
        margem = this.saldo * this.margemEmprestimo;
        return margem;
    }*/

    public void pedirEmprestimo(int valorPretendido) {

        if (valorPretendido > this.saldo * this.margemEmprestimo && this.valorDivida > 0) {
            System.out.println("Empréstimo impedido");
        } else {
            this.saldo = this.saldo + valorPretendido;
            this.valorDivida+=valorPretendido;
            System.out.println("Empréstimo permitido");
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public double getValorDivida() {
        return valorDivida;
    }
}
