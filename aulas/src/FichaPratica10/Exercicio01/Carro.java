package FichaPratica10.Exercicio01;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private double cilindrada;
    private tipoCombustivel tipoCombustivel;
    private int litros100;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, tipoCombustivel tipoCombustivel , int litros100) {
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
    public Carro corrida (Carro adversario) {
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
    public int consumo (int distancia) {
        return distancia * this.litros100;
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
}
