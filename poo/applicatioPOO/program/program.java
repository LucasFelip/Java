package poo.applicatioPOO.program;

import java.util.Locale;
import java.util.Scanner;

import poo.applicatioPOO.entity.triangle;

// Solution with POO
public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        triangle x = new triangle();
        triangle y = new triangle();
        
        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

        System.out.printf("Triangle X area: %.4f%n", x.calArea());
		System.out.printf("Triangle Y area: %.4f%n", y.calArea());

        if (x.calArea() > y.calArea())
			System.out.println("Triangle larger area: X");
		else
		    System.out.println("Triangle larger area: y");

        sc.close();
    }
}
