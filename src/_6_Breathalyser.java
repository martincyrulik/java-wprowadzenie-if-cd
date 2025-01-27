import java.util.Scanner;

/**
 * This program asks you how many beers you have drunk
 * 0-5 ? YES
 * 5 - more ? NO
 */

public class _6_Breathalyser {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("How many beers have you drunk? ");
        var beersNumber = scanner.nextInt();

        if (beersNumber <= 5) {
            System.out.println("You can drive.");
        } else {
            System.out.println("Sorry! You can't drive.");
        }
    }
}
