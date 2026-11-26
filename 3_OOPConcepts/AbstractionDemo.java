/**
 * Program 3.7: Demonstrates Abstraction in Java using an abstract class.
 * Abstract classes hide implementation details and force subclasses to implement abstract methods.
 */
abstract class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    // Abstract method (no body; must be implemented by subclasses)
    abstract double calculateArea();

    // Concrete method shared by all subclasses
    void displayColor() {
        System.out.println("Shape color: " + color);
    }
}

class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Green", 4.0, 6.0);

        circle.displayColor();
        System.out.printf("Circle Area: %.2f%n", circle.calculateArea());

        rectangle.displayColor();
        System.out.printf("Rectangle Area: %.2f%n", rectangle.calculateArea());
    }
}
