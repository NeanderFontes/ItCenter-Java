package Singleton.Ex_01;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection ligarDataBaseDB = DatabaseConnection.getInstance("mysql//:Localhost3000");
    }
}
