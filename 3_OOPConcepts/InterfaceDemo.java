/**
 * Program 3.9: Demonstrates Interfaces in Java.
 * An interface defines a contract of methods that implementing classes must fulfill.
 */
interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// A class can implement multiple interfaces in Java
class AllInOnePrinter implements Printable, Scannable {
    private String documentName;

    AllInOnePrinter(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public void print() {
        System.out.println("Printing document: " + documentName);
    }

    @Override
    public void scan() {
        System.out.println("Scanning document: " + documentName);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        AllInOnePrinter device = new AllInOnePrinter("Assignment_Report.pdf");
        device.print();
        device.scan();
    }
}
