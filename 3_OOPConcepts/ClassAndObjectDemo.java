/**
 * Program 3.1: Demonstrates Class and Object in Java.
 * A class is a blueprint; objects are instances created from that blueprint.
 */
class Car {
    // Instance variables (state)
    String brand;
    String color;
    int year;

    // Instance method (behavior)
    void displayDetails() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Year: " + year);
    }
}

public class ClassAndObjectDemo {
    public static void main(String[] args) {
        // Creating first object of Car
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.color = "White";
        car1.year = 2024;

        // Creating second object of Car
        Car car2 = new Car();
        car2.brand = "Honda";
        car2.color = "Blue";
        car2.year = 2025;

        System.out.println("=== Car Details ===");
        car1.displayDetails();
        car2.displayDetails();
    }
}
