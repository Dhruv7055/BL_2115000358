package Assignment02;

import java.util.Scanner;

public class SumNaturalNumbersWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using loop: " + sum);
            System.out.println("Both results are " + (formulaSum == sum ? "correct" : "incorrect"));
        } else {
            System.out.println("The number is not a natural number.");
        }
        sc.close();

    }
}
