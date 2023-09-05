package code.LeedCode;

/**
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
 * A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
 * You must not use any built-in library function, such as sqrt.
 * <p>
 * Example 1:
 * Input: num = 16
 * Output: true
 * Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 * <p>
 * Example 2:
 * Input: num = 14
 * Output: false
 * Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 */
public class _367 {
    public static void main(String[] args) {
        int n = 1000;
        System.out.println(isPerfectSquare(n));
    }

    private static boolean isPerfectSquare(int num) {

        long low = 0;
        long hi = num+1;

        while (low <= hi) {
            long mid = (low + hi) >>> 1;
            long midVal = mid * mid;

            if (num < midVal) {
                hi = mid - 1;
            } else if (num > midVal) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
