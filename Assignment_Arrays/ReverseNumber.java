import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int[] digits = new int[10];
        int index = 0;

        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.println("Reversed Number: ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        sc.close();
    }
}
