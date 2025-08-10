import java.util.*;

public class ArmstrongInRange {

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += (int) Math.round(Math.pow(digit, digits)); // cast with rounding
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower limit: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper limit: ");
        int upper = sc.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");

        boolean found = false;

        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Armstrong numbers found in the given range.");
        }

        sc.close();
    }
}
/*
 * Time Complexity:
 * For each number in the range [lower, upper], we check if it's Armstrong.
 * Checking Armstrong involves:
 * - Counting digits: O(d) (string conversion is roughly O(d))
 * - For each digit, calculate digit^d: O(d)
 * Overall, for each number, work is O(d)
 * Total numbers = (upper - lower + 1)
 * So total time complexity: O((upper - lower + 1) * d)
 * 
 * Space Complexity:
 * Uses only a fixed number of variables (integers), no extra data structures.
 * So, O(1) constant space.
 */
