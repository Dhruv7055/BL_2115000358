import java.util.Scanner;

public class TriangularPark {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1 (in meters): ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2 (in meters): ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3 (in meters): ");
        double side3 = scanner.nextDouble();
        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete needs to complete " + rounds + " rounds.");
        scanner.close();
    }
}
