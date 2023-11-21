package FichaPratica09.Exercicio06;

public class Calculadora {
    public Calculadora() { //apesar de estar vazio, convém criar
    }
    public double Soma () {
        double soma = 1.5 + 1.5;
        //System.out.println(soma);//ao pôr isto aqui, ele imprime direto na consola e depois no main só tenho que "chamar" (calculadora.Soma);
        return soma;
    }
    public double Subtracao () {
        double subtracao = 5.0 - 3.0;
        return subtracao;
    }
    public double Multiplicacao () {
        double multiplicacao = 3.5 * 3.5;
        return multiplicacao;
    }
    public double Divisao () {
        double divisao = 7.5 / 1.5;
        return divisao;
    }
}
