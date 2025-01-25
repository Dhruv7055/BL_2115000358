import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the number of students
        System.out.println("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Arrays to store marks, percentages, and grades
        int[][] marks = new int[numberOfStudents][3]; // [Physics, Chemistry, Maths]
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int mark = sc.nextInt();

                // Validate marks (must be positive)
                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter.");
                    j--; // Retry the current subject
                    continue;
                }
                marks[i][j] = mark;
            }
        }

        // Calculate percentage and grade for each student
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300.0) * 100;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
        System.out.println("\nStudent Results:");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f%%\t\t%c\n",
                    i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        sc.close();
    }
}
