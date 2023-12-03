package FichaPratica12.Exercicio02;

import FichaPratica10.Exercicio01.tipoCombustivel;

public class Carro extends Veiculo {
    private int quantidadePassageiros;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, FichaPratica10.Exercicio01.tipoCombustivel tipoCombustivel, int litros100, int quantidadePassageiros) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Quantidade de passageiros - " + this.quantidadePassageiros);
    }
}
