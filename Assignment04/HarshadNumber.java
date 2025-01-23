package Assignment04;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number, sum = 0;

        while (originalNumber != 0) {
            sum += originalNumber % 10; // Add last digit
            originalNumber /= 10; // Remove last digit
        }

        if (number % sum == 0) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }
        sc.close();

    }
}
