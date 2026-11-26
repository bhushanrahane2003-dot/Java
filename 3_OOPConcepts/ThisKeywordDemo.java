/**
 * Program 3.10: Demonstrates the 'this' keyword in Java:
 * 1) Distinguishing instance variables from parameters with the same name
 * 2) Calling another constructor in the same class using this(...)
 */
class Employee {
    private int id;
    private String name;
    private String department;

    // Constructor chaining using this(...)
    Employee(int id, String name) {
        this(id, name, "General");
    }

    // Resolving variable shadowing using this.field
    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Department: " + this.department);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Rohan");
        Employee emp2 = new Employee(2, "Meera", "Engineering");

        emp1.display();
        emp2.display();
    }
}
