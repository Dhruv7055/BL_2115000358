package AssignmentExceptionHandling;
import java.util.Scanner;

public class ExceptionPropagation {

    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return amount * (rate / 100) * years;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the amount: ");
            double amount = scanner.nextDouble();
            if (amount < 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }

            System.out.print("Enter the rate (in percentage): ");
            double rate = scanner.nextDouble();
            if (rate < 0) {
                throw new IllegalArgumentException("Rate must be positive");
            }

            System.out.print("Enter the number of years: ");
            int years = scanner.nextInt();

            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
