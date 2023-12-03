package FichaPratica12.Exercicio02;

import FichaPratica10.Exercicio01.Carro;
import FichaPratica10.Exercicio01.tipoCombustivel;

public class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private double cilindrada;
    private FichaPratica10.Exercicio01.tipoCombustivel tipoCombustivel;
    private int litros100;

    public Veiculo(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, FichaPratica10.Exercicio01.tipoCombustivel tipoCombustivel, int litros100) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100 = litros100;
    }
    public void Ligar () {
        int idade = 2023 - this.anoFabrico;

        if (idade > 30) {
            if (this.tipoCombustivel.equals(FichaPratica10.Exercicio01.tipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        } else {
            if (this.potencia >= 250){
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMMMM");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmm");
            }
        }
    }
    public Veiculo corrida (Veiculo adversario) {
        if (this.potencia > adversario.potencia) {
            return this;
        } else {
            if (this.potencia < adversario.potencia) {
                return adversario;
            } else {
                if (this.cilindrada > adversario.cilindrada) {
                    return this;
                } else {
                    if (this.cilindrada < adversario.cilindrada) {
                        return adversario;
                    } else {
                        if (this.anoFabrico > adversario.anoFabrico) {
                            return this;
                        } else {
                            if (this.anoFabrico < adversario.anoFabrico) {
                                return adversario;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    public double consumo (double distancia) {
        return (distancia * this.litros100)/100;
    }
    public double calcularCusto (double distancia) {
        double total = 0;
        if (this.getTipoCombustivel().equals(FichaPratica10.Exercicio01.tipoCombustivel.DIESEL)) {
            total = consumo(distancia)*1.95;
        }
        if (this.getTipoCombustivel().equals(FichaPratica10.Exercicio01.tipoCombustivel.GASOLINA)) {
            total = consumo(distancia)*2.10;
        }
        if (this.getTipoCombustivel().equals(FichaPratica10.Exercicio01.tipoCombustivel.GPL)) {
            total = consumo(distancia)*1.15;
        }
        if (this.getTipoCombustivel().equals(FichaPratica10.Exercicio01.tipoCombustivel.ELETRICO)) {
            total = consumo(distancia)*0.12;
        }
        return total;
    }
    public String getMarca() {
        return marca;
    }
    public void exibirDetalhes () {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de fabrico: " + this.anoFabrico);
        System.out.println("Potencia: " + this.potencia);
        System.out.println("Cilindrada: " + this.cilindrada);
        System.out.println("Tipo de combustível: " + this.tipoCombustivel);
        System.out.println("Litros aos 100: " + this.litros100);
    }

    public FichaPratica10.Exercicio01.tipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }
}
