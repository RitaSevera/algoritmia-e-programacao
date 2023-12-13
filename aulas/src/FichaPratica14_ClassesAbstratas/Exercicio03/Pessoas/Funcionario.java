package FichaPratica14_ClassesAbstratas.Exercicio03.Pessoas;

import FichaPratica14_ClassesAbstratas.Exercicio03.Enum.Funcao;
import FichaPratica14_ClassesAbstratas.Exercicio03.Pessoas.Pessoa;

public class Funcionario extends Pessoa {
    private Funcao funcao;

    public Funcionario(String nome, int anoNascimento, String email, String telemovel, Funcao funcao) {
        super(nome, anoNascimento, email, telemovel);
        this.funcao = funcao;
    }

    @Override
    public void obterFuncao() {

    }

    @Override
    public void imprimirHorario() {

    }
}
