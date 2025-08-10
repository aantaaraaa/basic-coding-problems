import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome Number.");
        } else {
            System.out.println(number + " is not a Palindrome Number.");
        }

        sc.close();
    }
}

/**
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 * where d is the number of digits in the number
 */