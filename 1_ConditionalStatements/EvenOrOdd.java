import java.util.Scanner;

/**
 * Program 1.2: Checks whether an integer is even or odd using if-else.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // A number divisible by 2 (remainder 0) is even; otherwise odd
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        scanner.close();
    }
}
