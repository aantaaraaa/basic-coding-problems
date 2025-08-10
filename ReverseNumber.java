import java.util.*;

public class ReverseNumber {

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reversed = reverseNumber(number);
        System.out.println("Reversed number: " + reversed);

        sc.close();
    }
}
/**
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 * where d is the number of digits in the number
 */
