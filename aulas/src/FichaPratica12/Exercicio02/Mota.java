package FichaPratica12.Exercicio02;

import FichaPratica10.Exercicio01.tipoCombustivel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo {
    public Mota(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, FichaPratica10.Exercicio01.tipoCombustivel tipoCombustivel, int litros100) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100);
    }
    public void imagem () throws FileNotFoundException {
        File file = new File("aulas/Ficheiros/Mota.txt");
        Scanner sc = new Scanner(file);
        String linha;

        while (sc.hasNextLine()){
            linha = sc.nextLine();
            System.out.println(linha);
        }
        sc.close();
    }
}
