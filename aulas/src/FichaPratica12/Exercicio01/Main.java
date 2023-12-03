package FichaPratica12.Exercicio01;

import FichaPratica12.Exercicio01.Enum.Armas;
import FichaPratica12.Exercicio01.Enum.Categoria;
import FichaPratica12.Exercicio01.Enum.Instalacao;

public class Main {
    public static void main(String[] args) {

        JatoParticular jato01 = new JatoParticular(12345, "Severa", 2022, 2978, 25, 7, 2.5, 3, 3770, 750, 17000, 7, 700, Categoria.MIDSIZE_JET);
        jato01.adicionarInstalacao(Instalacao.CHUVEIRO);
        jato01.adicionarInstalacao(Instalacao.COZINHA);
        jato01.adicionarInstalacao(Instalacao.SUITE);
        jato01.adicionarInstalacao(Instalacao.WC);
        jato01.adicionarInstalacao(Instalacao.TOMADAS);

        AviaoCombate aviaoCombate01 = new AviaoCombate(54321, "RitaF16", 2020, 1000, 7.5, 2, 1,2, 900, 750, 20000, "Portugal", true);
        aviaoCombate01.adicionarArmas(Armas.FOGUETES);
        aviaoCombate01.adicionarArmas(Armas.BOMBAS);
        aviaoCombate01.adicionarArmas(Armas.METRALHADORAS);
        aviaoCombate01.adicionarArmas(Armas.MISSEIS);

        Catalogo catalogo01 = new Catalogo();
        catalogo01.adquirir(jato01);
        catalogo01.adquirir(aviaoCombate01);
        System.out.println("Valor total do nosso catálogo - " + catalogo01.calcularTotal());
        catalogo01.listarCatalogo();
    }
}
