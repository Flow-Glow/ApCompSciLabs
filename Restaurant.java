import java.util.Scanner;

public class Restaurant {
  private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your total cost:");
        double cost = scanner.nextDouble();
        double tax = 1.95;
        double totalCost = cost* tax;
        System.out.println("Choose your tipping percentage:(10, 15, 20)");
        double tip = scanner.nextDouble();
        double tipCost = totalCost*(tip/100.0)+totalCost;
        System.out.printf("Your total cost is: $%.2f",tipCost);
        System.out.println("\nWith a " + tip + "% tip");
  }
}
