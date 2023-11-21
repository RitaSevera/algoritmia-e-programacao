package FichaPratica09.Exercicio07;

public class Main {
    public static void main(String[] args) {

        Livro livro01 = new Livro("Rapariga, Mulher, Outra", "Bernardine Evaristo", "Romance", 480, 97898962);
        Livro livro02 = new Livro("A máquina de fazer espanhóis", "Valter Hugo Mãe", "Romance", 320, 978972004);

        livro01.exibirDetalhes();
        System.out.println();
        livro02.exibirDetalhes();
    }
}
