package FichaPratica12.Exercicio01;

import FichaPratica12.Exercicio01.Enum.Armas;

import java.util.ArrayList;

public class AviaoCombate extends Aviao {
    private String paisOrigem;
    private boolean camuflagem;
    private ArrayList<Armas> armas;

    public AviaoCombate(int numeroSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCauda, int numeroMotores, int autonomia, int velocidade, double preco, String paisOrigem, boolean camuflagem) {
        super(numeroSerie, modelo, anoFabrico, peso, comprimentoFuselagem, envergaduraAsas, alturaCauda, numeroMotores, autonomia, velocidade, preco);
        this.paisOrigem = paisOrigem;
        this.camuflagem = camuflagem;
        this.armas = new ArrayList<>();
    }
    public void adicionarArmas (Armas armaNova) {
        if (this.armas.size()<3){
            this.armas.add(armaNova);
        }
    }
    public void removerArma (int linha) {
        this.armas.remove(linha);
    }
    public void listarArmas () {
        System.out.println("Armas: ");
        System.out.println(this.armas);
    }
    public void exibirDetalhesAviaoCombate () {
        super.exibirDetalhes();
        System.out.println("País de origem - " + this.paisOrigem);
        System.out.println("Camuflagem - " + this.camuflagem);
        this.listarArmas();
    }

}
