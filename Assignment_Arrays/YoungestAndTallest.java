import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = { "Amar", "Akbar", "Anthony" };

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age for " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.println("Enter height for " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex])
                youngestIndex = i;
            if (heights[i] > heights[tallestIndex])
                tallestIndex = i;
        }
        System.out.println("Youngest Friend: " + names[youngestIndex] + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: " + names[tallestIndex] + " (Height: " + heights[tallestIndex] + ")");
        sc.close();
    }
}
