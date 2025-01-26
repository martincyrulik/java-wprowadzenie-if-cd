import java.util.Scanner;

/**
 * Dependiing on production date - you will have didfferent insurance offers
 * before 1900 - 5000 euro
 * 1900 - 1950 - 3500 euro
 * 1951 - 2000 - 2800 euro
 * 2000 or later - 1000 euro
 */

public class _5_CarInsurance {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Car production date: ");
        var productionDate = scanner.nextInt();

        System.out.print("Your car insurance is equal: ");
        if (productionDate < 1900) {
            System.out.println("5000 euro.");
        } else if (productionDate <= 1950) {
            System.out.println("3500 euro.");
        } else if (productionDate <= 2000) {
            System.out.println("2800 euro.");
        } else {
            System.out.println("1000 euro.");
        }
    }
}
