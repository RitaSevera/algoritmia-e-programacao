package FichaPratica01_aula02;

import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int minutosTotais, segundosTotais, segundosTotaisAlbum, horas, minutos, segundos;

    }
}
// peço ao utilizador os minutos e os segundos da música 1 até à 5
// quando pergunto pela música 2 tenho que trazer já os que ele tinha dito no 1 e sumar (igual até à música 5)
//segundos totais do álbum = minutos totais * 60 (60 pq 1 min = 60 seg) + os segundos sumados das músicas. aqui o meu álbum está com 8505 (imaginemos) em segundos e agora tenho que pôr em horas, minutos e segundos -variável segundos totais album
// eu tenho 3600 segundos em cada hora e tenho que entender quantos 3600 segundos cabem nos 8505 (assim sendo, o álbum tem 2h e qualquer coisa - pq 8505 / 3600 = 2,36) trabalhando com variável inteira só fica o 2 - isto é a variável horas
//1 min = 60 seg, tenho que saber quantos 60 posso pôr naquele valor, ou seja,(8505 / 60) - (horas * 60) = 141 - 120 =  21min
// segundos totais do álbum (8505) - (horas * 3600s) - (minutos * 60s) = 8505 - 7200 - 1260 = 45 segundos
// logo dá 2h21min45s

