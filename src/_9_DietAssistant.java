import java.util.Scanner;

/**
 * The diet rules are:
 * - Monday, Wednesday, Friday, Sunday -> vegetables (odd days)
 * Tuesday, Thursday, Saturday -> meat (even days)
 * <p>
 * preparation time:
 * max 5 min - Vegetarian1, Meat1, Vegetarian2
 * max 15 min - Vegetarian3, Meat2
 * max 20 min - vegetarian4, Meat3, Meat4
 */

public class _9_DietAssistant {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("What is the day? ");
        var numberOfDay = scanner.nextInt();

        System.out.print("How much time do you have? ");
        var time = scanner.nextInt();

        System.out.print("Your meal is: ");
        if (numberOfDay % 2 == 0) {
            //even days
            if (time >= 5) {
                System.out.print("Meat1 ");
            }
            if (time >= 15) {
                System.out.print("Meat2 ");
            }
            if (time >= 20) {
                System.out.print("Meat3 or Meat4");
            }
        }else {
            // odd days
            if (time >= 5) {
                System.out.print("Vegetarian1, Vegetarian2");
            }
            if (time >= 15) {
                System.out.print("Vegetarian3");
            }
            if (time >= 20) {
                System.out.print("Vegetarian4");
            }
        }
    }
}