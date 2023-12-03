package FichaPratica12.Exercicio01;

import FichaPratica12.Exercicio01.Enum.Categoria;
import FichaPratica12.Exercicio01.Enum.Instalacao;

import java.util.ArrayList;

public class JatoParticular extends Aviao {
    private int lotacao;
    private double capacidadeBagagem;
    private Categoria categoria;
    private ArrayList<Instalacao> instalacoes;

    public JatoParticular(int numeroSerie, String modelo, int anoFabrico, double peso, double comprimentoFuselagem, double envergaduraAsas, double alturaCauda, int numeroMotores, int autonomia, int velocidade, double preco, int lotacao, double capacidadeBagagem, Categoria categoria) {
        super(numeroSerie, modelo, anoFabrico, peso, comprimentoFuselagem, envergaduraAsas, alturaCauda, numeroMotores, autonomia, velocidade, preco);
        this.lotacao = lotacao;
        this.capacidadeBagagem = capacidadeBagagem;
        this.categoria = categoria;
        this.instalacoes = new ArrayList<>();
    }
    public void adicionarInstalacao (Instalacao nova) {
        this.instalacoes.add(nova);
    }
    public void removerInstalacao (int linha) {
        this.instalacoes.remove(linha);
    }
    public void listarInstalacao () {
        System.out.println("Instalações: ");
        System.out.println(this.instalacoes);
    }
    public void exibirDetalhesJato () {
        super.exibirDetalhes();
        System.out.println("Lotação máxima - " + this.lotacao);
        System.out.println("Categoria - " + this.categoria);
        this.listarInstalacao();
    }

}
