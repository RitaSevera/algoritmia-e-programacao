package FichaPratica12.Exercicio02;

import FichaPratica10.Exercicio01.tipoCombustivel;

public class Camiao extends Veiculo {
    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, int litros100, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel.DIESEL, litros100);
        this.capacidadeCarga = capacidadeCarga;
    }
    public void viagem (double distancia, double carga) {
        double litrosConsumidos;
        double litrosExtra;
        double total;
        if (carga > this.capacidadeCarga) {
            System.out.println(carga + " kg. capacidade de carga ultrapassada. A capacidade máxima é: " + this.capacidadeCarga + " kg.");
        } else {
            litrosConsumidos = calcularCusto(distancia);
            litrosExtra = carga / 1000;
            litrosConsumidos = litrosConsumidos + litrosExtra;
            total = litrosConsumidos * 1.95;
            System.out.println("Consumo nesta viagem - " + litrosConsumidos + "L");
            System.out.println("O custo da viagem para o camião com " + carga + "kg - " + total + "€");
        }
    }
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de carga - " + this.capacidadeCarga);
    }
}
