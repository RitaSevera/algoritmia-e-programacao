package FichaPratica11.Exercicio02;

import java.util.ArrayList;
import java.util.Random;

public class Sorteio {
    private double premio;
    private ArrayList <Pessoa> participantes = new ArrayList<Pessoa>();

    public Sorteio(double premio) {
        this.premio = premio;
        this.participantes = new ArrayList<>();
    }

    public void adicionarParticipante (Pessoa novoParticipante) {

        if (novoParticipante.getIdade() >= 18) {
            System.out.println("Participante - " + novoParticipante.getNome() + " | " + novoParticipante.getIdade() + " anos | inscrito com sucesso");
            this.participantes.add(novoParticipante);
        } else {
            System.out.println("Participante - " + novoParticipante.getNome() + " | " + novoParticipante.getIdade() +  " anos | é menor de idade, ainda não pode participar");
        }
    }
    public Pessoa sortear () {

        Random random = new Random();
        int vencedor = random.nextInt(0,this.participantes.size());
        return this.participantes.get(vencedor);
    }
    public void imprimirLista () {
        for (int linha = 0; linha < this.participantes.size(); linha++) {
            Pessoa pessoaAtual = this.participantes.get(linha);
            System.out.print("Participante " + (linha+1) + " - ");
            pessoaAtual.exibirDetalhes();
        }
    }
}
