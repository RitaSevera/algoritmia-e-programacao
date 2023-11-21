package FichaPratica09.Exercicio08;

public class Main {
    public static void main(String[] args) {

        Aluno aluna01 = new Aluno("Rita", 26, "SoftDev", 15.3);
        Aluno aluno02 = new Aluno("Nuno", 27, "SoftDev", 8.3);

        System.out.println("Média: " + aluna01.getMedia());
        aluna01.Situacao();
        System.out.println();
        System.out.println("Média: " + aluno02.getMedia());
        aluno02.Situacao();
    }
}
