import java.util.*;

public class NthTermFibonacci {

    public static int nthFibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int first = 0, second = 1, next = 0;
        for (int i = 2; i <= n; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the term (n): ");
        int n = sc.nextInt();

        int result = nthFibonacci(n);
        System.out.println(n + "th term of Fibonacci Series is: " + result);

        sc.close();
    }
}
/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
