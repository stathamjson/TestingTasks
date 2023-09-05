package code.LeedCode;

/**
 * 9. Palindrome Number
 * Given an integer x, return true if x is a palindrome  and false otherwise.
 * <p>
 * Example 1:
 * * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * <p>
 * Example 2:
 * * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class _9 {
    public static void main(String[] args) {
        int input = 0;
        System.out.println(input + " это палиндром? : " + isPalindrome(input));
    }

    private static boolean isPalindrome(int x) {

        if (x < 0 ) {
            return false;
        }
        int newX = 0;
        int oldX = x;

        while (x > 0) {
            int digit = x % 10;
            newX = newX * 10 + digit;
            x=x/10;
        }

        return oldX==newX;
    }

}
