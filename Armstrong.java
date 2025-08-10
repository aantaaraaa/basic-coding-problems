import java.util.*;

public class Armstrong {
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + "is NOT an Armstrong number. ");
        }

        sc.close();
    }
}
/*
 * Time Complexity: O(d)
 * Space Complexity: O(1)
 * where d is the number of digits in the number
 */