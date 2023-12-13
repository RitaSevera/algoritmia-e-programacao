package Singleton.Exercicio01;

public class Main {
    public static void main(String[] args) {
        DataBaseConnection connection = DataBaseConnection.getInstance("lkjsdhshj");

        connection.connect();
        connection.desconnect();

    }
}
