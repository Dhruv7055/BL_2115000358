import java.util.Scanner;

public class ChocolatesDistribution {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int eachChildGets = chocolates / children;
        int remainingChocolates = chocolates % children;
        return new int[] { eachChildGets, remainingChocolates };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int children = scanner.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
        scanner.close();
    }
}
