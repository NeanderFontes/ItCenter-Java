import java.util.Scanner;

public class Java_prova {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;

        a = 10;
        b -= a;

        if (a<b) {
            c=a;
        } else if (a>b) {
            c=b;
        } else if (a==b) {
            c=15;
        }
        System.out.println(c);
    }
}
