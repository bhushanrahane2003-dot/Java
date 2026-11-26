import java.util.Scanner;

/**
 * Program 1.4: Calculates a student's grade from marks (0-100)
 * using an else-if ladder.
 */
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student marks (0 to 100): ");
        int marks = scanner.nextInt();

        // Validate input range first, then evaluate grade using else-if ladder
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        } else if (marks >= 90) {
            System.out.println("Grade: A+ (Outstanding)");
        } else if (marks >= 80) {
            System.out.println("Grade: A (Excellent)");
        } else if (marks >= 70) {
            System.out.println("Grade: B (Good)");
        } else if (marks >= 60) {
            System.out.println("Grade: C (Average)");
        } else if (marks >= 50) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        scanner.close();
    }
}
