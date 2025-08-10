import java.util.*;

public class AbundantNo {
    public static boolean isAbundant(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isAbundant(n)) {
            System.out.println(n + " is an abundant number.");
        } else {
            System.out.println(n + " is NOT an abundant number.");
        }
    }
}
/**
 * Function to check if a number is an Abundant Number
 * Time Complexity: O(n/2) ≈ O(n) → checking divisors up to n/2
 * Space Complexity: O(1)
 */