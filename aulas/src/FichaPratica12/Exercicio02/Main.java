package FichaPratica12.Exercicio02;

import FichaPratica10.Exercicio01.tipoCombustivel;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Carro carro01 = new Carro("BMW", "X5", 2023, 420, 2.000, tipoCombustivel.GASOLINA, 15, 5);
        Carro carro02 = new Carro("Volvo", "XC40", 2022, 296, 4000, tipoCombustivel.ELETRICO, 1, 7);
        Mota mota01 = new Mota("Mercedes", "Benz", 2019, 280, 2000, tipoCombustivel.GASOLINA, 6);
        Camiao camiao01 = new Camiao("Mercedes", "Actros", 2018, 200, 1700, 4, 450);
        Camiao camiao02 = new Camiao("BMW", "CAM", 2016, 200, 1700, 4, 450);

        System.out.println("################################################################");
        System.out.println("                         PRIMEIRA CORRIDA                       ");
        System.out.println("*** Veículo 01 ***");
        carro01.exibirDetalhes();
        System.out.println("*** Veículo 02 ***");
        carro02.exibirDetalhes();
        System.out.println("                     VENCEDOR DA CORRIDA:                       ");
        carro01.corrida(carro02).exibirDetalhes();
        System.out.println("###############################################################");
        System.out.println();
        System.out.println("################################################################");
        System.out.println("                         SEGUNDA CORRIDA                       ");
        System.out.println("*** Veículo 01 ***");
        mota01.exibirDetalhes();
        System.out.println("*** Veículo 02 ***");
        camiao01.exibirDetalhes();
        System.out.println("                     VENCEDOR DA CORRIDA:                       ");
        mota01.corrida(camiao01).exibirDetalhes();
        System.out.println("###############################################################");
        System.out.println();
        System.out.println("Custo da viagem de carro - " + carro02.calcularCusto(150) + "€");
        System.out.println();
        camiao01.viagem(2500, 350);
        camiao01.viagem(2000, 500);
        mota01.imagem();
    }
}
