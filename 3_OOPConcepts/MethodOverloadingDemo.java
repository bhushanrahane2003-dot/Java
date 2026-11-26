/**
 * Program 3.4: Demonstrates Method Overloading (Compile-time Polymorphism).
 * Multiple methods share the same name with different parameter counts or types.
 */
class MathOperations {
    // Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Adds three integers (different parameter count)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Adds two doubles (different parameter types)
    double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("add(5, 10) = " + math.add(5, 10));
        System.out.println("add(5, 10, 15) = " + math.add(5, 10, 15));
        System.out.println("add(3.5, 4.2) = " + math.add(3.5, 4.2));
    }
}
