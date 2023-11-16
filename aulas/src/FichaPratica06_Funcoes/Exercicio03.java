package FichaPratica06_Funcoes;

public class Exercicio03 {
    /**
     * Metódo que avalia se um número é impar ou não
     *
     * @param num número a ser avaliado
     * @return true: se for par; false se for impar
     */

    public static boolean par (int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metódo que avalia se um número é positivo ou não
     *
     * @param num número a ser avaliado
     * @return true: se for positivo; false se for negativo
     */
    public static boolean positivo (int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Método que avalia se um número é primo ou não
     *
     * @param num número a ser avaliado
     * @return true: se for primo; false se não for primo
     */
    public static boolean primo (int num) {

        for (int divisor = 2; divisor < num; divisor++) {
            if (num % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Método que avalia se número é perfeito
     * @param num número a ser avaliado
     * @return true se for perfeito; false se não for
     */
    public static boolean perfeito (int num) {

        int soma = 0;

        for (int divisor = 1; divisor < num; divisor++) {
            if (num % divisor == 0) {
                soma = soma + divisor;
            }
        }
        if (soma == num) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Método que avalia se um número é triangular
     * @param num número a ser avaliado
     * @return true se for triangular; false se não for
     */
    public static boolean triangulo (int num) {

        int soma = 0, contador = 1;

        while (soma < num) {
            soma = soma + contador;
            contador ++ ;
            if (soma == num){
                return true;
            }
        }
        return false;
    }
}


