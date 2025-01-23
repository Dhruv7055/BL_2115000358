import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = number - 1; i > 0; i--) {
            if (number % i == 0) {
                System.out.println("Greatest Factor: " + i);
                break;
            }
        }
        scanner.close();
    }
}
