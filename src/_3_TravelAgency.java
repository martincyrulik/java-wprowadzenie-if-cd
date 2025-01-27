import java.util.Scanner;

/**
 * You and your family have a budget for summer holiday
 * Let's check where you can go
 * 5000 euro -> London
 * 10000 euro -> Madrid
 * 20000 euro -> New York
 */

public class _3_TravelAgency {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("What is your budget? ");
        var budget = scanner.nextInt();

        if (budget >= 5000) {
            System.out.println("You may go London.");
        }
        if (budget >= 10000) {
            System.out.println("You may go to Madrid.");
        }
        if (budget >= 20000) {
            System.out.println("You may go to New York.");
        }
    }
}
