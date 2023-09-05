package code.LeedCode;


import java.util.*;

//TODO не получилось пока что
public class _32 {
    public static void main(String[] args) {
        String input = "()[]{}";
        String input1 = "()(()";
        String input2 = ")((()))()";
        System.out.println(longestValidParentheses(input2));
    }

    private static int longestValidParenthesesDeque(String s) {
        int max = 0;
        int length;
        Deque<Integer> stack = new ArrayDeque<>() ;

        char[] chars = s.toCharArray();
        stack.push(-1);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    length = i - stack.peek();
                    max = length > max ? length : max;
                }
            }
        }
        return max;

    }
    private static int longestValidParentheses(String s) {
        int max = 0;
        int length;
        Stack<Integer> stack = new Stack<>();
        char[] chars = s.toCharArray();
        stack.add(-1);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    length = i - stack.peek();
                    max = length > max ? length : max;
                }
            }
        }
        return max;

    }
}
