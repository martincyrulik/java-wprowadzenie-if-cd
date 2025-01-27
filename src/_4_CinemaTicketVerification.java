import java.util.List;
import java.util.Scanner;

/**
 * If you have a valid ticket you will go to the cinema,
 * otherwise - you won't
 */

public class _4_CinemaTicketVerification {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var validTickets = List.of("5432", "1234", "5353");

        System.out.print("Enter you ticket numner: ");
        var ticket = scanner.next();

        if (validTickets.contains(ticket)) {
            System.out.println("OK! Come in!");
        } else {
            System.out.println("Sorry! Your ticket is not valid!");
        }
    }
}
