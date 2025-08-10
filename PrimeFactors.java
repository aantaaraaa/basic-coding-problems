import java.util.*;

public class PrimeFactors {
    public static void printPrimeFactors(int num) {
        while (num % 2 == 0) {
            System.out.println(2 + " ");
            num /= 2;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            while (num % i == 0) {
                System.out.println(i + " ");
                num /= i;
            }
        }

        if (num > 2) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("Prime factors of " + number + " are: ");
        printPrimeFactors(number);

        sc.close();
    }
}
/*
 * Time Complexity: O(√n)
 * Space Complexity: O(1)
 */