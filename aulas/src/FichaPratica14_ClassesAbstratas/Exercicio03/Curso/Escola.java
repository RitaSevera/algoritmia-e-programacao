package FichaPratica14_ClassesAbstratas.Exercicio03.Curso;

import FichaPratica14_ClassesAbstratas.Exercicio03.Pessoas.Aluno;
import FichaPratica14_ClassesAbstratas.Exercicio03.Pessoas.Funcionario;
import FichaPratica14_ClassesAbstratas.Exercicio03.Pessoas.Professor;

import java.util.ArrayList;

public class Escola {
    private String nome;
    private String localizacao;
    private int lotacaoMaxima;
    private ArrayList<Professor> listaProfs;
    private ArrayList<Disciplina> listaDisciplinas;
    private ArrayList<Curso> listaCursos;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Funcionario> listaFuncionarios;

    public Escola(String nome, String localizacao, int lotacaoMaxima) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.lotacaoMaxima = lotacaoMaxima;
        this.listaProfs = new ArrayList<>();
        this.listaDisciplinas = new ArrayList<>();

    }
    public void adicionarProf (Professor profNovo) {
        this.listaProfs.add(profNovo);
    }
}
