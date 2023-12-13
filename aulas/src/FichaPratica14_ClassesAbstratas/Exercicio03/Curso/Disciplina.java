package FichaPratica14_ClassesAbstratas.Exercicio03.Curso;

import FichaPratica14_ClassesAbstratas.Exercicio03.Enum.AreaFormacao;

import java.util.Scanner;

public class Disciplina {
    private String nome;
    private AreaFormacao area;
    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao area, int duracaoHoras) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }
    public Disciplina() {
        Scanner input = new Scanner(System.in);
        String nome;
        int duracao;
        AreaFormacao area;

        System.out.println("*** Nova Disciplina ***");
        System.out.println("Insira o nome da disciplina - ");
        nome = input.next();

        System.out.println("Área de formação - ");
        for (AreaFormacao areaAtual : AreaFormacao.values()){
            System.out.println(areaAtual);
        }
        System.out.println("Área - ");

        System.out.println("Insira a duração total da disciplina - ");
        duracao = input.nextInt();
    }
    public void exibirDetalhes () {
        System.out.println("Disciplina - " + this.nome);
        System.out.println("Duração - " + this.duracaoHoras);
        System.out.println("Área - " + this.area);
    }
}
