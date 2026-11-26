/**
 * Program 3.2: Demonstrates Constructors (Default and Parameterized) in Java.
 * Constructors initialize new objects automatically when 'new' is called.
 */
class Student {
    String name;
    int rollNumber;
    double percentage;

    // Default (no-argument) constructor
    Student() {
        name = "Unknown";
        rollNumber = 0;
        percentage = 0.0;
    }

    // Parameterized constructor
    Student(String studentName, int roll, double marksPercentage) {
        name = studentName;
        rollNumber = roll;
        percentage = marksPercentage;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Percentage: " + percentage + "%");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Invokes default constructor
        Student defaultStudent = new Student();

        // Invokes parameterized constructor
        Student parameterizedStudent = new Student("Aarav", 101, 91.5);

        System.out.println("=== Default Constructor Object ===");
        defaultStudent.displayInfo();

        System.out.println("=== Parameterized Constructor Object ===");
        parameterizedStudent.displayInfo();
    }
}
