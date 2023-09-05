package code.LeedCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 242. Valid Anagram
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 */
public class _242 {
    public static void main(String[] args) {

        String str1 = "anagram";
        String str2 = "nagaram";

        System.out.println(isAnagram(str1, str2));

    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str3 = s.toCharArray();
        Arrays.sort(str3);
        char[] str4 = t.toCharArray();
        Arrays.sort(str4);
        String str1 = new String(str3);
        String str2 = new String(str4);

        return str1.equals(str2);
    }
}
