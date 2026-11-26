import java.util.Scanner;

/**
 * Program 2.5: Checks whether an alphabet character is a vowel or consonant
 * using switch statements.
 */
public class VowelOrConsonantSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single alphabet character: ");
        char ch = scanner.next().charAt(0);

        // Verify the input is an English letter before checking vowel vs consonant
        if (!Character.isLetter(ch)) {
            System.out.println("'" + ch + "' is not an alphabet character.");
        } else {
            // Convert to lowercase so both 'A' and 'a' match the same cases
            char lowerCh = Character.toLowerCase(ch);
            switch (lowerCh) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("'" + ch + "' is a Vowel.");
                    break;
                default:
                    System.out.println("'" + ch + "' is a Consonant.");
                    break;
            }
        }

        scanner.close();
    }
}
