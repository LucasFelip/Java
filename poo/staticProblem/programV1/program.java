package poo.staticProblem.programV1;

import java.util.Locale;
import java.util.Scanner;

public class program {

    // PI static const
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("\nCircumference: %.2f", c);
        System.out.printf("\nVolume: %.2f", v);
        System.out.printf("\nPI value: %.2f", PI);

        sc.close();
    }

    public static double circumference(Double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(Double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0; 
    }
}
