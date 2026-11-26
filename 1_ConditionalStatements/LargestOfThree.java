import java.util.Scanner;

/**
 * Program 1.3: Finds the largest among three numbers using conditional statements.
 */
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double third = scanner.nextDouble();

        // Compare values using an else-if ladder
        double largest;
        if (first >= second && first >= third) {
            largest = first;
        } else if (second >= first && second >= third) {
            largest = second;
        } else {
            largest = third;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
