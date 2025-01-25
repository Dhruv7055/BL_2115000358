import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary for employee " + (i + 1) + ": ");
            double sal = sc.nextDouble();
            System.out.println("Enter years of service for employee " + (i + 1) + ": ");
            double years = sc.nextDouble();

            if (sal < 0 || years < 0) {
                System.out.println("Invalid input. Please re-enter.");
                i--;
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }
        for (int i = 0; i < 10; i++) {
            bonus[i] = (yearsOfService[i] > 5) ? salary[i] * 0.05 : salary[i] * 0.02;
            newSalary[i] = salary[i] + bonus[i];

            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
            totalBonus += bonus[i];
        }
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}
