package FichaPratica06_Funcoes;

public class BibliotecaMatrizes {
    public static void imprimirMatrizInteiros (int [][] matriz){
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
