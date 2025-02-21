package AssignmentExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            double result = num1 / num2;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: Please enter valid numeric values.");
        }
        finally {
            sc.close();
        }
    }
}

