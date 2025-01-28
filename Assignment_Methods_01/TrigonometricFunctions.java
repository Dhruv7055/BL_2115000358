import java.util.Scanner;

public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert to radians
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an angle (in degrees): ");
        double angle = scanner.nextDouble();
        double[] trigFunctions = calculateTrigonometricFunctions(angle);
        System.out.println("Sine: " + trigFunctions[0]);
        System.out.println("Cosine: " + trigFunctions[1]);
        System.out.println("Tangent: " + trigFunctions[2]);
        scanner.close();
    }
}
