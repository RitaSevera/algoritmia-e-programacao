package FichaPratica09.Exercicio10;

public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }
    public void aumentarSalario (double valorPercentual) {
        this.salario = this.salario * (valorPercentual/100);
    }
    public void exibirDados () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário: " + this.salario + "€");
        System.out.println("Departamento: " + this.departamento);
    }
}
