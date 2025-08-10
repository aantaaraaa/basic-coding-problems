import java.util.*;

public class PerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if (num < 0)
            return false;

        double sqrt = Math.sqrt(num);
        return sqrt == Math.floor(sqrt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (isPerfectSquare(n)) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is NOT a perfect square.");
        }

        sc.close();
    }
}
/**
 * Function to check if a number is a Perfect Square
 * Time Complexity: O(1) → Uses constant time Math.sqrt()
 * Space Complexity: O(1)
 */