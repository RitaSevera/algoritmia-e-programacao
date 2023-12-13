package Singleton.Exercicio03;

import java.time.LocalDateTime;
import java.util.Random;

public class UserSessionManager {
    private int sessionToken;
    private String lastAccess;

    private UserSessionManager() {
        Random rd = new Random();
        this.sessionToken = rd.nextInt();
        this.lastAccess = String.valueOf(LocalDateTime.now());
    }
    private static UserSessionManager instance;
}
