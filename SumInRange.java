import java.util.*;

public class SumInRange {
    public static int sumInRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();

        int sum = sumInRange(start, end);
        System.out.println("Sum: " + sum);
        sc.close();
    }
}
/**
 * Time Complexity: O(end - start + 1)
 * Space Complexity: O(1)
 */