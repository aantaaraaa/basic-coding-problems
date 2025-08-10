import java.util.*;

public class PowerOfNumber {
    public static long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        long result = power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " is: " + result);

        sc.close();
    }
}
/*
 * Time Complexity: O(exp)
 * Space Complexity: O(1)
 */