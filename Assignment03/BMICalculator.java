import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = scanner.nextDouble() / 100.0;

        double bmi = weight / (height * height);
        System.out.printf("Your BMI: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal weight");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
        scanner.close();
    }
}
