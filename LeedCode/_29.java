package code.LeedCode;

import java.util.Scanner;

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
 * * The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
 * * Return the quotient after dividing dividend by divisor.
 * * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.
 * *
 * Example 1:
 * * Input: dividend = 10, divisor = 3
 * Output: 3
 * Explanation: 10/3 = 3.33333.. which is truncated to 3.
 * <p>
 * Example 2:
 * Input: dividend = 7, divisor = -3
 * Output: -2
 * Explanation: 7/-3 = -2.33333.. which is truncated to -2.
 */
public class _29 {
    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = 2;
        System.out.println(divide(dividend, divisor));


    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
            return Integer.MAX_VALUE;
        }
        int quotient = 0;
        int flag = (dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0) ? -1 : 1;
        Long abcDividend = Math.abs(Long.valueOf(dividend));
        Long abcDivisor = Math.abs(Long.valueOf(divisor));
        while (abcDividend >= abcDivisor) {
            int shift = 0;
            while (abcDividend >= (abcDivisor << shift)) {
                shift++;
            }
            quotient += (1 << (shift - 1));
            abcDividend -= abcDivisor << (shift - 1);
        }
        quotient = flag < 0 ? 0 - quotient : quotient;

        return quotient;

    }
}
