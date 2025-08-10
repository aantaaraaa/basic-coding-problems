import java.util.*;

public class PerfectNumber {
    public static boolean isPerfect(int num) {
        if (num <= 1)
            return false;

        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (isPerfect(n)) {
            System.out.println(n + " is a perfect Number.");
        } else {
            System.out.println(n + " is NOT a perfect number.");
        }

        sc.close();
    }
}
/**
 * Function to check if a number is a Perfect Number
 * Time Complexity: O(n) in worst case, but checking only till n/2 → O(n/2) ≈
 * O(n)
 * Space Complexity: O(1)
 */