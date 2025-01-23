package Assignment02;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n >= 0) {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The number must be a non-negative integer.");
        }
        sc.close();
    }
}
