package LeedCode;

import code.LeedCode._206;

import java.util.Stack;

public class _234 {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(3);
        ListNode l7 = new ListNode(2);
        ListNode l8 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = null;

        System.out.println(isPalindrom(l1));
        ;


    }

    private static boolean isPalindrom(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        boolean res = true;

        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }

        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            if (curr.val != stack.pop()) {
                return false;
            }
            curr = curr.next;
        }
        return true;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
