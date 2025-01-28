import java.util.Scanner;

/**
 * Based on the temperature, I will suggest what you can wear
 * more than 30 degrees -> shorts and dress
 * more than 10 degrees -> trousers
 * otherwise -> jacket
 */

public class _10_DressAssistant {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("What is the temperature? ");
        var temperature = scanner.nextInt();

        System.out.print("I suggest: ");
        if (temperature > 30) {
            System.out.println("shorts and dress.");
        } else if (temperature > 10) {
            System.out.println("trousers.");
        } else {
            System.out.println("jacket!");
        }
    }
}
