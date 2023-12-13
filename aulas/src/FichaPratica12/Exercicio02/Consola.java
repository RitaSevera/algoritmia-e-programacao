package FichaPratica12.Exercicio02;

import FichaPratica10.Exercicio01.tipoCombustivel;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Consola {
    public static Veiculo criarVeiculo () {
        Scanner sc = new Scanner(System.in);

        String marca, modelo, tipoVeiculo;
        tipoCombustivel combustivel;
        int ano, potencia, litros100, passageiros;
        double cilindrada, carga;

            System.out.println("Prentende um carro, uma mota ou um camião?");
            tipoVeiculo = sc.next();
            System.out.println("Insira a marca que pretende : ");
            marca = sc.next();
            System.out.println("Insira o modelo que pretende : ");
            modelo = sc.next();
            System.out.println("Insira o ano de fabrico : ");
            ano = sc.nextInt();
            System.out.println("Insira a potência que pretende : ");
            potencia = sc.nextInt();
            System.out.println("Insira a cilindrada que pretende : ");
            cilindrada = sc.nextDouble();
            System.out.println("Insira o tipo de combustível que pretende : ");
            combustivel = tipoCombustivel.valueOf(sc.next().toUpperCase());
            System.out.println("Insira quantos litros quer que o veículo gaste aos 100km : ");
            litros100 = sc.nextInt();

        if (tipoVeiculo.equalsIgnoreCase("Carro")){
            System.out.println("Insira o número de passsageiros : ");
            passageiros = sc.nextInt();
        } else {
            if (tipoVeiculo.equalsIgnoreCase("Camião")){
                System.out.println("Insira a capacidade de carga : ");
                carga = sc.nextDouble();
            }
        }
        return null;
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        int escolha;
        double distancia;
        Veiculo veiculo = null;

        Carro carro01 = new Carro("BMW", "X5", 2023, 420, 2.000, tipoCombustivel.GASOLINA, 15, 5);
        Mota mota01 = new Mota("Mercedes", "Benz", 2019, 280, 2000, tipoCombustivel.GASOLINA, 6);
        Camiao camiao01 = new Camiao("Mercedes", "Actros", 2018, 200, 1700, 4, 450);

        do {
            System.out.println("\n####################################################################################################");
            System.out.println("|                              Bem-vinda/o ao Stand Severa                                         |");
            System.out.println("+ ------------------------------------------------------------------------------------------------ +");
            System.out.println("| 1 - Crie o seu veículo, sendo que pode escolher entre carro, mota ou camião                      |");
            System.out.println("| 2 - Calcule o consumo do seu veículo                                                             |");
            System.out.println("| 3 - Faça uma corrida entre o seu veículo e o meu carro                                           |");
            System.out.println("| 4 - Faça uma corrida entre o seu veículo e a minha mota                                          |");
            System.out.println("| 5 - Faça uma corrida entre o seu veículo e o meu camião                                          |");
            System.out.println("| 6 - Se escolheu um camião, podemos calcular os custos da sua viagem de transporte de carga       |");
            System.out.println("| 7 - Se escolheu uma mota, podemos imprimir uma imagem para si!                                   |");
            System.out.println("| 8 - Sair do Stand                                                                                |");
            System.out.println("####################################################################################################");
            System.out.print("\nSelecione o que pretende fazer: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    veiculo = criarVeiculo();
                    break;
                case 2:
                    System.out.println("Insira a distância que irá percorrer, para podermos calcular o custo: ");
                    distancia = input.nextDouble();
                    veiculo.consumo(distancia);
                    break;
                case 3:
                    System.out.println("Vencedor da corrida - ");
                    veiculo.corrida(carro01).exibirDetalhes();
                    break;
                case 4:
                    System.out.println("Vencedor da corrida - ");
                    veiculo.corrida(mota01).exibirDetalhes();
                    break;
                case 5:
                    System.out.println("Vencedor da corrida - ");
                    veiculo.corrida(camiao01).exibirDetalhes();
                    break;
                case 6:
                    System.out.println("Os custos da sua viagem - ");
                    veiculo.calcularCusto(100);
                    break;
                case 7:
                    System.out.println("Mota");
                    mota01.imagem();
                case 0:
                    System.out.println("Até à próxima!");
                    break;
                default:
                    System.out.println("\nOperação inválida. Selecione entre a opção 1 e a opção 8.");
            }
        } while (escolha != 0);
    }

}
