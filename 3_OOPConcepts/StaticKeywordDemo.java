/**
 * Program 3.12: Demonstrates static variables and static methods in Java.
 * Static members belong to the class itself rather than any individual object.
 */
class CounterItem {
    // Static variable shared across all instances
    private static int totalObjectsCreated = 0;

    private String itemName;

    CounterItem(String itemName) {
        this.itemName = itemName;
        totalObjectsCreated++; // Increments shared class counter
    }

    public String getItemName() {
        return itemName;
    }

    // Static method can be called directly using the class name without creating an object
    public static int getTotalObjectsCreated() {
        return totalObjectsCreated;
    }

    // Static utility method
    public static int square(int number) {
        return number * number;
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        System.out.println("Initial object count: " + CounterItem.getTotalObjectsCreated());

        CounterItem item1 = new CounterItem("Notebook");
        CounterItem item2 = new CounterItem("Pen");
        CounterItem item3 = new CounterItem("Laptop");

        System.out.println("Created: " + item1.getItemName() + ", " + item2.getItemName() + ", " + item3.getItemName());
        System.out.println("Total objects created: " + CounterItem.getTotalObjectsCreated());
        System.out.println("Static utility square(7): " + CounterItem.square(7));
    }
}
