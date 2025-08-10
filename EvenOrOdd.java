import java.util.*;

public class EvenOrOdd {
    public static String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String result = checkEvenOdd(number);
        System.out.println(result);

        sc.close();
    }
}
/**
 * Function to check if the number is even or odd.
 * Time Complexity: O(1) -> Only one modulus operation and comparison.
 * Space Complexity: O(1) -> No extra space used.
 */
