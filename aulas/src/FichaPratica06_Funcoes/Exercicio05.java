package FichaPratica06_Funcoes;

public class Exercicio05 {
    public static int numMaior (int [] array) {

        int numMaior = array [0];

        for (int indice = 0; indice < array.length; indice++) {//enquanto o indíce for menor que o array
            if (array [indice] > numMaior){
                numMaior = array[indice];
            }
        }
        return numMaior;
    }
    public static int numMenor (int [] array) {

        int numMenor = array [0];

        for (int indice = 0; indice < array.length; indice ++){
            if (array[indice] < numMenor){
                numMenor = array [indice];
            }
        }
        return numMenor;
    }
    public static boolean crescente (int [] array) {

        for (int indice = 1; indice < 10; indice++) { //começo no 1 pq senão não tenho nada para comparar
            if (array[indice] <= array[indice - 1]) {
                return false;
            }
    }
        return true;

    }
}
