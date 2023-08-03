import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 1, num2 = 1;
        while (num1 <= 5) {
            while (num2 <= num1) {
                System.out.print(num2);
                num2++;
            }
            System.out.println("");
            num1++;
            num2 = 1;
        }
    }
}