import java.util.*;

public class FriendlyPair {
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }

    public static boolean isfriendlyPair(int a, int b) {
        int sumA = sumOfDivisors(a);
        int sumB = sumOfDivisors(b);

        return (double) sumA / a == (double) sumB / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        if (isfriendlyPair(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are Friendly Pair Numbers");
        } else {
            System.out.println(num1 + " and " + num2 + " are NOT Friendly Pair Numbers");
        }

        sc.close();
    }
}
/*
 * Time Complexity:
 * sumOfDivisors() runs a loop up to num/2, so O(n) where n = num.
 * isFriendlyPair() calls sumOfDivisors twice, so overall O(a + b).
 * Since a and b can be considered independent inputs, overall complexity is
 * O(max(a, b)).
 * 
 * Space Complexity:
 * Uses only a few integer variables, so O(1) constant space.
 */