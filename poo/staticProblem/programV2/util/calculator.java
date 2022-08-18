package poo.staticProblem.programV2.util;

public class calculator {
    
    // PI static const
    public final double PI = 3.14159;

    public double circumference(Double radius) {
        return 2.0 * PI * radius;
    }

    public double volume(Double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0; 
    }
}
