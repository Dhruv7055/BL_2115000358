import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double total = 0.0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            total += heights[i];
        }
        double mean = total / heights.length;
        System.out.println("Mean height of players: " + mean);
        sc.close();
    }
}
