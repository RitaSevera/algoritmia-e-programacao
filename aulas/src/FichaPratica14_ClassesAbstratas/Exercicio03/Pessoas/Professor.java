package FichaPratica14_ClassesAbstratas.Exercicio03.Pessoas;

import FichaPratica14_ClassesAbstratas.Exercicio03.Enum.AreaFormacao;
import FichaPratica14_ClassesAbstratas.Exercicio03.Pessoas.Pessoa;

import java.util.ArrayList;

public class Professor extends Pessoa {
    private ArrayList<AreaFormacao> areaFormacao;
    private int nivelAcademico;

    public Professor(String nome, int anoNascimento, String email, String telemovel, int nivelAcademico) {
        super(nome, anoNascimento, email, telemovel);
        this.nivelAcademico = nivelAcademico;
        this.areaFormacao = new ArrayList<>();
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
