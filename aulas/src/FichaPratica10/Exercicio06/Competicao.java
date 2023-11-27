package FichaPratica10.Exercicio06;

public class Competicao {
    private String nomeCompeticao;
    private String pais;
    private Atleta [] listaAtletas; //crio array de atleta pq preciso da inf.toda

    public Competicao(String nomeCompeticao, String pais, Atleta[] listaAtletas) {
        this.nomeCompeticao = nomeCompeticao;
        this.pais = pais;
        this.listaAtletas = listaAtletas;
    }

    public void adicionarAtletas (Atleta novaAtleta) {
        for (int linha = 0; linha < this.listaAtletas.length; linha++) {
            if (this.listaAtletas[linha] == null) {// tenho que ver quando é null para poder pôr um atleta novo
                this.listaAtletas[linha] = novaAtleta;
                return;
            }
        }
    }
    // para imprimir a lista de participantes tenho que iterar o array (fazer o ciclo for para ler listaAtletas),
    // se for diferente de null imprimo as inf. do atleta inscrito
    // para imprimir ponho .getnome ou crio um imprimirDetalhes na classe Atleta
}
