/**
 * Program 3.11: Demonstrates the 'super' keyword in Java:
 * 1) Calling the parent class constructor with super(...)
 * 2) Accessing the parent class's overridden method and hidden field with super.
 */
class Vehicle {
    String type = "Generic Vehicle";

    Vehicle(String type) {
        this.type = type;
        System.out.println("Vehicle constructor called.");
    }

    void start() {
        System.out.println("Starting the " + type + "...");
    }
}

class Bike extends Vehicle {
    String type = "Sports Bike"; // Shadows parent 'type' field

    Bike() {
        // Calls parent class constructor
        super("Two-Wheeler Vehicle");
        System.out.println("Bike constructor called.");
    }

    @Override
    void start() {
        super.start(); // Calls parent class start() method
        System.out.println("Parent type: " + super.type);
        System.out.println("Child type: " + this.type);
        System.out.println("Bike engine roared to life!");
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.start();
    }
}
