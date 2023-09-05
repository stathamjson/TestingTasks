package code.LeedCode;

import LeedCode._203;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _206 {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = null;

        PrintNode(l1);
        PrintNode(reverseListEffective(l1));

    }

    static void PrintNode(ListNode listNode) {
       ListNode head = listNode;
        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println(head.val);
    }

    private static ListNode reverseListEffective(ListNode head) {

        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode preNode = null;
        ListNode currentNode = head;

        while (currentNode != null) {
            ListNode nextNode = currentNode.next;
            currentNode.next = preNode;
            preNode = currentNode;
            currentNode = nextNode;
        }
        head = preNode;
        return head;
    }

    private static ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode list = head;
//        List<Integer> revList = new ArrayList<>();

        while (list != null) {
            stack.push(list.val);
            list = list.next;
        }

        ListNode reverseList = new ListNode(Integer.MIN_VALUE);
        ListNode iter = reverseList;

        while (!stack.isEmpty()) {
            iter.next = new ListNode(stack.pop());
//            revList.add(iter.next.val);
            iter = iter.next;
        }
        return reverseList.next;
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
