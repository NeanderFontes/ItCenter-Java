package Singleton.Ex_03;

import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private String sessionToken;
    private long lastAccessTime;

    private UserSessionManager() {
        Random random = new Random();
        this.sessionToken = String.valueOf(random.nextInt(100000000));
        this.lastAccessTime = System.currentTimeMillis();
    }

    public static UserSessionManager getInstance() {
        if (instance == null) instance = new UserSessionManager();
        return instance;
    }

    public void updateLastAccessTime() throws InterruptedException {
        Thread.sleep(2500);
        this.lastAccessTime = System.currentTimeMillis();
    }

    public static void setInstance(UserSessionManager instance) {
        UserSessionManager.instance = instance;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public long getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }
}
