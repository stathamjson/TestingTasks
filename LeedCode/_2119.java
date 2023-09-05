package code.LeedCode;

import java.util.Arrays;
import java.util.List;

/**
 * Reversing an integer means to reverse all its digits.
 * For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
 * Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2.
 * Return true if reversed2 equals num. Otherwise return false.
 * <p>
 * Example 1:
 * * Input: num = 526
 * Output: true
 * Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.
 * <p>
 * Example 2:
 * * Input: num = 1800
 * Output: false
 * Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not equal num.
 * <p>
 * Example 3:
 * * Input: num = 0
 * Output: true
 * Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.
 * <p>
 * Constraints:
 * * 0 <= num <= 10^6
 */
public class _2119 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(123, 12300, 0);
        for (int element :
                list) {
            System.out.println(isSameAfterReversals(element));
        }
    }

    private static boolean isSameAfterReversals(int num) {

        if (num == 0) {
            return true;
        }
        int firstRev = num;
        int temp = 0;
        while (firstRev > 0) {
            temp = temp * 10 + firstRev % 10;
            firstRev = firstRev / 10;
        }
        firstRev = temp;
        temp = 0;

        while (firstRev > 0) {
            temp = temp * 10 + firstRev % 10;
            firstRev = firstRev / 10;
        }
        return num == temp;
    }
}
