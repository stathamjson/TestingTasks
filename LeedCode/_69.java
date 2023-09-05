package code.LeedCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 */
public class _69 {

    public static void main(String[] args) {
        int n = 63;
        System.out.println(mySqrt(n));

    }

    private static int mySqrt(int x) {
        long low = 0;
        long hi = x ;
        int ans = 0;

        while (low <= hi) {
            long mid = (low + hi) >>> 1;
            long midVal = mid * mid;

            if (x < midVal) {
                hi = mid - 1;
            } else if (x > midVal) {
                ans = (int) mid;
                low = mid + 1;
            } else {
                return (int) mid;
            }
        }
        return ans;
    }


}
