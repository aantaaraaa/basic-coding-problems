import java.util.*;

public class GreatestOfThree {
    public static int greatestOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        int max = greatestOfThree(num1, num2, num3);
        System.out.println("Greatest: " + max);
        sc.close();
    }
}
/**
 * Time Complexity: O(1)
 * - Only a fixed number of comparisons (two `if` checks).
 * Space Complexity: O(1)
 * - Uses a constant amount of extra space (one variable `max`).
 */