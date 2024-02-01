package task001;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        /**
         * 3. Escreva um programa que calcule e apresente a área e o perímetro de um retângulo. As dimensões
         * devem ser requisitadas ao utilizador.
         * A = b * h
         * P = 2(b + h)
         */
        // Scanner input for data:
        Scanner input = new Scanner(System.in);

        // Declaration of variables:
        int baseRetangulo = 0;
        int alturaRetangulo = 0;
        int perimetroRetangulo;
        double areaRetangulo;

        // Data input by the user:
        System.out.println("To calculate area of a rectangle going to need.");
        System.out.print("Base of the rectangle: ");
        baseRetangulo = input.nextInt();
        System.out.print("Height of the rectangle: ");
        alturaRetangulo = input.nextInt();
        areaRetangulo = (baseRetangulo * alturaRetangulo);
        perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);

        // Final data:
        System.out.println("The area of the rectangle is: " + areaRetangulo);
        System.out.println("The perimeter of the rectangle is: " + perimetroRetangulo);
    }
}
