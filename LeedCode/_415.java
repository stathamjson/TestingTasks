package code.LeedCode;

import java.math.BigInteger;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

/**
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 * * You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
 * You must also not convert the inputs to integers directly.
 * <p>
 * Example 1:
 * Input: num1 = "11", num2 = "123"
 * Output: "134"
 * <p>
 * Example 2:
 * Input: num1 = "456", num2 = "77"
 * Output: "533"
 * <p>
 * Example 3:
 * Input: num1 = "0", num2 = "0"
 * Output: "0"
 */
public class _415 {
    public static void main(String[] args) {
        String s1 = "999";
        String s2 = "9999";

        long startTime = System.nanoTime();
        System.out.println(addStrings(s1, s2));
        long endTime = System.nanoTime();
        long duration = TimeUnit.MICROSECONDS.toMillis(endTime - startTime);
        System.out.println("Время выполнения метода " + duration + " мс");

        startTime = System.nanoTime();
        System.out.println(addStrings2(s1, s2));
        endTime = System.nanoTime();
        duration = TimeUnit.MICROSECONDS.toMillis(endTime - startTime);
        System.out.println("Время выполнения метода " + duration + " мс");

        startTime = System.nanoTime();
        System.out.println(addStrings3(s1, s2));
        endTime = System.nanoTime();
        duration = TimeUnit.MICROSECONDS.toMillis(endTime - startTime);
        System.out.println("Время выполнения метода " + duration + " мс");

    }


    private static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        var length1 = num1.length();
        var length2 = num2.length();

        while (length1 > 0 || length2 > 0) {
            int digit1 = length1 > 0 ? Character.getNumericValue(num1.charAt(length1 - 1)) : 0;
            int digit2 = length2 > 0 ? Character.getNumericValue(num2.charAt(length2 - 1)) : 0;

           int temp = digit1+digit2+carry;
            carry = temp / 10;

            res = res.append(temp%10);
            length1--;
            length2--;
        }
        if (carry > 0) {
            res = res.append(carry);
        }
        return res.reverse().toString();
    }

    static String addStrings2(String num1, String num2) {
        BigInteger i = new BigInteger(num1);
        BigInteger j = new BigInteger(num2);
        BigInteger x = i.add(j);
        String s = x.toString();
        return s;
    }

    static String addStrings3(String num1, String num2) {

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0) {
            int a = i >= 0 ? Character.getNumericValue(num1.charAt(i)) : 0;
            int b = j >= 0 ? num2.charAt(j) - '0' : 0;

            int sum = carry + a + b;
            carry = sum / 10;
            sb.append(sum % 10);
            i--;
            j--;

        }

        if (carry != 0)
            sb.append(carry);

        return sb.reverse().toString();
    }
}
