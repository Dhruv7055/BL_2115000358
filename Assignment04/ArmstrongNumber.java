package Assignment04;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number, sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, 3); // Cube of the digit
            originalNumber /= 10; // Remove last digit
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        sc.close();
    }
}
