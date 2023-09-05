package code.LeedCode;

import java.util.*;


/**
 * 20. Valid Parentheses
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * * An input string is valid if:
 * * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * *
 * Example 1:
 * * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * * Input: s = "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: s = "(]"
 * Output: false
 * *
 * Constraints:
 * * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class _20 {
    public static void main(String[] args) {
        String input = "()[]{}";
        String input1 = "(}";
        String input2 = "(()()()()()(){}{}[][][](()){{{}}}[{}])";

        System.out.println(isValid(input1));

    }

    /**
     * этот вариант уже получше )))
     * @param s
     * @return
     */
    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '[') {
                stack.push(chars[i]);
            } else if (!stack.isEmpty()) {
                char data = stack.pop();
                if (data == '(' & ')' != chars[i]) {
                    return false;
                }
                if (data == '{' & '}' != chars[i]) {
                    return false;
                }
                if (data == '[' & ']' != chars[i]) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    /**
     * не самое оптимальное решение оказалось на литкоде
     *
     * @param s
     * @return
     */
    private static boolean isValid1(String s) {
        Map<String, String> open = new HashMap<>(Map.of("(", ")", "[", "]", "{", "}"));
        String[] input = s.split("");
        Stack<String> stack = new Stack<>();
        boolean result = input.length > 1 ? true : false;

        for (int i = 0; i <= input.length - 1; i++) {
            if (open.containsKey(input[i])) {
                stack.push(input[i]);
            } else if (!stack.empty()) {
                String up = stack.pop();
                String value = open.get(up);
                if (!value.equals(input[i])) {
                    result = false;
                }
                ;
            } else {
                result = false;
            }
        }
        return result & stack.isEmpty();
    }
}
