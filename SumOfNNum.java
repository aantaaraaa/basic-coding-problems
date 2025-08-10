import java.util.*;

public class SumOfNNum {
    public static int sumOfNNum(int n) {
        return (n * (n + 1)) / 2;

        /*
         * int sum = 0;
         * for(int i=0; i<=n; i++){
         * sum += i;
         * }
         */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = sumOfNNum(n);
        System.out.println(sum);

        sc.close();
    }
}
/*
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */