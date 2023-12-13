package FichaPratica14_ClassesAbstratas.Exercicio03.Curso;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;
    private ArrayList<DisciplinaCurso> planoCurricular;
    private boolean longaDuracao;

    public Curso() {
        Scanner input = new Scanner(System.in);
        String nome;
        int quantidade;

        System.out.println("*** Novo Curso ***");
        System.out.println("Insira o nome do curso -  ");
        nome = input.next();
        System.out.println("Insira a quantidade de disciplinas - ");
        quantidade = input.nextInt();

        for (int linha = 0; linha < quantidade; linha++){

        }
    }
}
