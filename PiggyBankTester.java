import java.util.Scanner;

public class PiggyBankTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();

        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        PiggyBankL A = new PiggyBankL(quarters, dimes, nickels, pennies);

        System.out.println("Quarters: " + A.getQuarter());
        System.out.println("Dimes: " + A.getDime());
        System.out.println("Nickels: " + A.getNickel());
        System.out.println("Pennies: " + A.getPenny());
        System.out.printf("Total: $%.2f", A.calculateTotal());

        scanner.close();
    }
}
