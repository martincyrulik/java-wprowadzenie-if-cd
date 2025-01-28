import java.util.Scanner;

/**
 * Test Grade Calculator - this program calculates grade
 * based on number of percentage on the exam
 * 81-100 - 5
 * 61-80 - 4
 * 51-60 - 3
 * 31-50 - 2
 * 0-30- - 1
 */

public class _8_TestGradeCalculator {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("How many percentage did you get: ");
        var value = scanner.nextInt();

        System.out.print("Your grade: ");
        if (value > 80) {
            System.out.println("5.");
        } else if (value > 60) {
            System.out.println(4.);
        } else if (value > 50) {
            System.out.println("3.");
        } else if (value > 30) {
            System.out.println("2.");
        } else {
            System.out.println("1.");
        }
    }
}
