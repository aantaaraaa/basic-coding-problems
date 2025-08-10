import java.util.*;

public class Factorial {
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        long result = factorial(number);
        System.out.println("Factorial of" + number + "is: " + result);

        sc.close();
    }
}
/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */