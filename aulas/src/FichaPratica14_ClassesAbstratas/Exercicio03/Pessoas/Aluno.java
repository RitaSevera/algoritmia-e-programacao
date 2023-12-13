package FichaPratica14_ClassesAbstratas.Exercicio03.Pessoas;

import FichaPratica14_ClassesAbstratas.Exercicio03.Curso.Curso;
import FichaPratica14_ClassesAbstratas.Exercicio03.Pessoas.Pessoa;

public class Aluno extends Pessoa {
    private double mediaNotas;
    private String [][] pauta;
    private Curso curso;

    public Aluno(String nome, int anoNascimento, String email, String telemovel, double mediaNotas, String[][] pauta, Curso curso) {
        super(nome, anoNascimento, email, telemovel);
        this.mediaNotas = mediaNotas;
        //this.pauta = new String[][2]; //Ver o número de disciplinas
        this.curso = curso;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
