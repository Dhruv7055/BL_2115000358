import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age1 = scanner.nextInt();
        int age2 = scanner.nextInt();
        int age3 = scanner.nextInt();
        int height1 = scanner.nextInt();
        int height2 = scanner.nextInt();
        int height3 = scanner.nextInt();
        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(height1, Math.max(height2, height3));
        System.out.println("Youngest friend is " + youngest + " years old.");
        System.out.println("Tallest friend is " + tallest + " cm tall.");
        scanner.close();
    }
}
