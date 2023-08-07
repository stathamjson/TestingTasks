package task3;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode l1 = new ListNode(2);
        l1.next = l1;

        ListNode l2 = new ListNode(5);

        ListNode l3 = solution.addTwoNumbers(l1, l2);
        System.out.println(l3);
    }
}

class Solution {
    public Solution() {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode l3 = head;

        int carry = 0;
        while (l1 != null || l2 != null) {
            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            int current_sum = l1_val + l2_val + carry;
            carry = current_sum / 10;
            int last_digit = current_sum % 10;

            ListNode new_node = new ListNode(last_digit);
            l3.next = new_node;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            l3 = l3.next;


        }
        if (carry > 0) {
            ListNode new_node = new ListNode(carry);
            l3.next = new_node;
            l3 = l3.next;
        }
        return head.next;

    }
}

//Definition for singly-linked list.
class ListNode {
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





