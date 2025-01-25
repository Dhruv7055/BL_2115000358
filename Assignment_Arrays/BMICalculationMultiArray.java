import java.util.Scanner;

public class BMICalculationMultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();
        double[][] personData = new double[numberOfPersons][3];
        String[] weightStatus = new String[numberOfPersons];
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            System.out.println("Enter height (m) for person " + (i + 1) + ": ");
            double height = sc.nextDouble();
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Weight and height must be positive values. Please re-enter.");
                i--;
                continue;
            }
            double bmi = weight / (height * height);
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][1], personData[i][0], personData[i][2],
                    weightStatus[i]);
        }
        sc.close();
    }
}
