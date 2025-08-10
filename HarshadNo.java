import java.util.*;

public class HarshadNo {
    public static boolean isHarshad(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return num % sum == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isHarshad(n)) {
            System.out.println(n + " is a harshad number.");
        } else {
            System.out.println(n + " is NOT a harshad number.");
        }

        sc.close();
    }
}
/**
 * Function to check if a number is a Harshad Number
 * Time Complexity: O(d) → d = number of digits in the number
 * Space Complexity: O(1)
 */