import java.util.*;

public class Factors {
    public static void primeFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Factors of" + number + " are: ");
        primeFactors(number);

        sc.close();
    }
}
/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */