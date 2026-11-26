import java.util.Scanner;

/**
 * Program 1.1: Checks whether an integer entered by the user
 * is positive, negative, or zero using an else-if ladder.
 */
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check sign using if / else-if / else
        if (number > 0) {
            System.out.println(number + " is a Positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a Negative number.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
