package Singleton.Exercicio02;

import java.io.*;
import java.util.Scanner;

public class Logger {
    private String nomeFicheiro;
    private static Logger instance;

    private Logger(String nomeFicheiro) {
        this.nomeFicheiro = nomeFicheiro;
    }
    public static Logger getInstance(String nomeFicheiro) {
        if (instance == null) {
            instance = new Logger(nomeFicheiro);
        }
        return instance;
    }
    public void log (String texto) throws IOException {
        PrintWriter escrever = new PrintWriter(new FileWriter(nomeFicheiro, true));
        //// O parâmetro "true" indica que quero adicionar ao arquivo, não substituí-lo
        escrever.println(texto);
        System.out.println(texto + "\n");
        escrever.close();
    }
}

