package fichaextraciclos;

public class Exercicio01 {
    public static void main(String[] args) {

// começo com o primeiro número do intervalo (só executado 1 única vez; avalio a condição, que sendo verdadeira executa a instrução
// do sout passa novamente para o num++ e depois para o num<=500
// 1 é <= 500? sim. então imprime número 2; num 2 <=500? sim.

        for (int num = 1; num <= 500; num++) {
            System.out.println(num);
        }
    }
}
