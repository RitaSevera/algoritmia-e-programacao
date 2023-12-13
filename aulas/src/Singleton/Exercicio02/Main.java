package Singleton.Exercicio02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getInstance("socorro.txt");

        logger.log("Log 1: Não estou a entender grande coisa.");
        logger.log("Log 2: Tenho que estudar no feriado e no fim de semana :(");

        Logger mylogger = Logger.getInstance("ajuda.txt");
        mylogger.log("Log 3: Nem sequer sei se isto vai funcionar.");
        mylogger.log("Log 4: Como só tenho uma instância, vai ser tudo adicionado ao primeiro ficheiro que criei, mas estas frases também vão aparecer nesse ficheiro.");
    }
}
