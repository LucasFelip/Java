package poo.staticProblem.programV2;

import java.util.Locale;
import java.util.Scanner;

import poo.staticProblem.programV2.util.calculator;

public class program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        calculator calc = new calculator();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("\nCircumference: %.2f", c);
        System.out.printf("\nVolume: %.2f", v);
        System.out.printf("\nPI value: %.2f", calc.PI);

        sc.close();
    }
}