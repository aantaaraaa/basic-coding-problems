import java.util.*;

public class FibonacciSeries {
    public static void printFibonacci(int n) {
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series up to" + n + "terms: ");
        printFibonacci(n);

        sc.close();
    }
}

/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */