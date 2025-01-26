import java.util.Scanner;

/**
 * After graduating from high school you have to pass an exam,
 * and based on the result (points) choose the college.
 * Assume you must have more than 258 points
 * to be admitted to Harvard College.
 */

public class HarvardAdmission {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("What is your result? ");
        var points = scanner.nextInt();

        if (points > 258) {
            System.out.println("You've got it!");
        } else {
            System.out.println("Sorry! Try again next year!");
        }
    }
}
