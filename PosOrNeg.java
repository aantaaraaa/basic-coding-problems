import java.util.*;

public class PosOrNeg {

    public static String checkNumber(int n) {
        if (n > 0) {
            return "Positive.";
        } else if (n < 0) {
            return "Negative.";
        } else {
            return "Zero.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = checkNumber(n);

        System.out.println(result);
    }
}
/*
 * Function to check if the number is positive, negative, or zero.
 * Time Complexity: O(1) -> Only constant number of comparisons.
 * Space Complexity: O(1) -> No extra space used.
 */