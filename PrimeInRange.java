import java.util.*;

public class PrimeInRange {

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper bound: ");
        int upper = sc.nextInt();

        System.out.println("Prime numbers between" + lower + " and " + upper + ": ");
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.println((i));
            }
        }
        sc.close();
    }
}
/*
 * Time Complexity: O(√n)
 * Space Complexity: O(1)
 */