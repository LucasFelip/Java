package poo.staticProblem.programV3;

import java.util.Locale;
import java.util.Scanner;

import poo.staticProblem.programV3.util.calculator;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calculator.circumference(radius);
        double v = calculator.volume(radius);

        System.out.printf("\nCircumference: %.2f", c);
        System.out.printf("\nVolume: %.2f", v);
        System.out.printf("\nPI value: %.2f", calculator.PI);

        sc.close();
    }
}