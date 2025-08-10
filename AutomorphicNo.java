import java.util.*;

public class AutomorphicNo {
    public static boolean isAutomorphic(int num){
        int square = num*num;

        int digits = String.valueOf(num).length();
        int modulus = (int) Math.pow(10, digits);

        return square % modulus == num;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(isAutomorphic(n)){
            System.out.println(n + " is an automorphic Number.");
        }else{
            System.out.println(n + " is NOT an automorphic number.");
        }

        sc.close();
    }
}
/*
 * Time Complexity:
 * - Calculating square of num: O(1) (basic arithmetic operation)
 * - Finding number of digits via String conversion: O(d), where d = number of digits in num
 * - Calculating modulus using Math.pow: O(log d) approximately (power function depends on implementation)
 * - Modulus operation: O(1)
 * Overall, dominated by digit counting and power calculation, so roughly O(d).
 *
 * Space Complexity:
 * - Uses only a fixed number of variables (ints), so O(1) constant space.
 */
