import java.util.Scanner;

/**
 * Program 1.5: Checks loan eligibility based on age and monthly salary
 * using nested if statements.
 */
public class LoanEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter applicant's age: ");
        int age = scanner.nextInt();

        System.out.print("Enter applicant's monthly salary: ");
        double salary = scanner.nextDouble();

        // Outer if checks age requirement (21 to 60 years)
        if (age >= 21 && age <= 60) {
            // Inner (nested) if checks minimum salary requirement
            if (salary >= 25000) {
                System.out.println("Congratulations! You are eligible for the loan.");
            } else {
                System.out.println("Not eligible: Minimum monthly salary required is 25000.");
            }
        } else {
            System.out.println("Not eligible: Applicant age must be between 21 and 60.");
        }

        scanner.close();
    }
}
