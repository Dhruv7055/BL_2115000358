package Assignment02;

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number for the countdown: ");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Liftoff!");
        sc.close();
    }
}
