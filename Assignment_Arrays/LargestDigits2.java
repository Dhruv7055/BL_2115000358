import java.util.Scanner;

public class LargestDigits2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int[] digits = new int[10];
        int index = 0;

        while (number != 0) {
            if (index == digits.length) {
                int[] temp = new int[digits.length + 10];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index++] = number % 10;
            number /= 10;
        }
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
        sc.close();
    }
}
