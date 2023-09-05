package code.LeedCode;


import java.util.Arrays;
import java.util.List;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * Example 1:
 * Input: x = 123
 * Output: 321
 * <p>
 * Example 2:
 * Input: x = -123
 * Output: -321
 * <p>
 * Example 3:
 * Input: x = 120
 * Output: 21
 */
public class _7 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(123, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, -123345, 98753);
        for (int element : list) {
            System.out.println(reverse(element));
        }
    }

    private static int reverse(int x) {
        int result = 0;
        int flag = x > 0 ? 1 : -1;
        long temp = 0;
        x = Math.abs(x);
        while (x > 0) {
            temp = x % 10 + temp * 10;
            x = x / 10;
        }
        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
            result = 0;
        } else {
            result = (int) temp * flag;
        }
        return result;
    }
}
