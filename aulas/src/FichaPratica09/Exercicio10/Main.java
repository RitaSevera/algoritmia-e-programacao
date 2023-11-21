package FichaPratica09.Exercicio10;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario01 = new Funcionario ("Rita", 1200.5, "Dev");

        funcionario01.exibirDados();
        System.out.println();
        funcionario01.aumentarSalario(50);
        funcionario01.exibirDados();
    }
}
