package Singleton.Ex_03;

import Singleton.Ex_02.Logger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        UserSessionManager sessionManager = UserSessionManager.getInstance();


        System.out.println(sessionManager.getSessionToken());
        System.out.println(sessionManager.getLastAccessTime());
        sessionManager.updateLastAccessTime();
        System.out.println(sessionManager.getSessionToken());
        System.out.println(sessionManager.getLastAccessTime());

    }
}
