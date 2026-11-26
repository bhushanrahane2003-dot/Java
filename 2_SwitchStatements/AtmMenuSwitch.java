import java.util.Scanner;

/**
 * Program 2.4: Menu-driven ATM program using switch statements
 * supporting Check Balance, Deposit Money, Withdraw Money, and Exit.
 */
public class AtmMenuSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 10000.00; // Initial account balance
        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Current Balance: %.2f%n", balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("Deposited %.2f. Updated Balance: %.2f%n", depositAmount, balance);
                    } else {
                        System.out.println("Invalid amount! Deposit must be positive.");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount! Withdrawal must be positive.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.printf("Withdrawn %.2f. Remaining Balance: %.2f%n", withdrawAmount, balance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1 to 4.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
