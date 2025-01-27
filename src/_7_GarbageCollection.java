import java.util.Scanner;

/**
 * This program calculates cost of garbage collection
 * 1 - 50 euro
 * 2-3 120 euro
 * 4-more 200 euro
 */

public class _7_GarbageCollection {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Family members: ");
        var familyMembers = scanner.nextInt();

        System.out.print("Your cost of garbage collection is equal: ");
        if (familyMembers == 1) {
            System.out.println("50 euro.");
        } else if (familyMembers <= 3) {
            System.out.println("120 euro.");
        } else {
            System.out.println("200 euro.");
        }
    }
}
