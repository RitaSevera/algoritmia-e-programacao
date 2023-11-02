package estudoteste;

import java.util.Scanner;

public class Exercicio09Ficha01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int codigoFunc, dias;
        final double VENCIMENTO = 40, ALIMENTACAO = 5, IRS = 0.1, SSF = 0.11, SSP = 0.2375;
        double iliquido, totalalimentacao, retencao, segSoc, liquido, totaldescontos;


        System.out.println("Insira o seu códido de funcionário: ");
        codigoFunc = input.nextInt();
        System.out.println("Insira o número de dias que trabalhou este mês: ");
        dias = input.nextInt();

        iliquido = VENCIMENTO * dias;
        System.out.println("\nO valor ilíquido referente ao seu vencimento: " + iliquido);

        totalalimentacao = ALIMENTACAO * dias;
        System.out.println("O total do subsídio de alimentação: " + totalalimentacao);

        retencao = (iliquido + totalalimentacao) * IRS;
        System.out.println("A sua retenção de IRS será: " + retencao);

        segSoc = iliquido * (SSF + SSP);
        System.out.println("O valor total a entregar à Segurança Social é: " + segSoc);

        totaldescontos = retencao + segSoc;
        System.out.println("Irá descontar um total de: " + totaldescontos);

        liquido = (iliquido + totalalimentacao) -totaldescontos;
        System.out.println("No final, apenas irá receber: " + liquido);
    }
}
