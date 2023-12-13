package Singleton.Exercicio01;

public class DataBaseConnection {
    private String connection;
    private static DataBaseConnection instance;


    private DataBaseConnection(String connection) {
        this.connection = connection;
    }

    public static DataBaseConnection getInstance(String connection) {
        if (instance == null) {
            instance = new DataBaseConnection(connection);
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conectado à base de dados - " + this.connection);
    }
    public void desconnect () {
        System.out.println("Desconectado à base de dados - " + this.connection);
    }
}
