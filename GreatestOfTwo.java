import java.util.*;

public class GreatestOfTwo {
    public static int greatestOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int max = greatestOfTwo(num1, num2);
        System.out.println("Greatest: " + max);
        sc.close();
    }
}
/*
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */