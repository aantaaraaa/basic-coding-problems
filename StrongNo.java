import java.util.*;

public class StrongNo {
    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;

            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (isStrong(n)) {
            System.out.println(n + " is a strong number.");
        } else {
            System.out.println(n + "is NOT a strong number.");
        }

        sc.close();
    }
}
/*
 * Function to check if a number is a Strong Number
 * Time Complexity: O(d × m) → d = number of digits, m = max digit value
 * (factorial up to 9!)
 * Space Complexity: O(1) → constant extra space
 */