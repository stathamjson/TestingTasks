package task3;

import java.util.HashSet;


public class Task3 {
    public static void main(String[] args) {
        Solution3 solution = new Solution3();
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}

class Solution3 {
    public int lengthOfLongestSubstring (String s) {
        int a_pointer = 0, b_pointer = 0, max = 0;
        HashSet<Character> hashSet = new HashSet();

        while (b_pointer<s.length()) {
            if (!hashSet.contains(s.charAt(b_pointer))) {
                hashSet.add(s.charAt(b_pointer));
                b_pointer++;
                max = Math.max(hashSet.size(),max);
            } else {
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}









