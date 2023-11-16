package FichaPratica03_ciclos;

public class Exercicio06 {
    public static void main(String[] args) {

        int num = 1, soma = 0;

        while (num <=100){
            System.out.println("Número: " + num);

            soma = num + soma;// vou buscar o 0 (da soma) e vou acrescentar o 1 (do num) = 1; volto para cima e repete até chegar ao 100 // estou sempre a acrescentar alguma coisa à soma, mas o número também está sempre a mudar
            System.out.println("Somatório = " + soma +  "+" + num + "=");
            num = num + 1;
        }
            System.out.println("Somatório:" + soma);
        }
    }