package code.LeedCode;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <p>
 * Example 2:
 * * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 * * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 * Constraints:
 * * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
public class _2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));


        System.out.println(Solution.addTwoNumbers(l1, l2).toString());


    }

    static class Solution {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode head = new ListNode();
            ListNode l3 = head;
            int carry = 0;

            while ((l1 != null) || (l2 != null)) {
                int x = (l1 != null) ? l1.val : 0;
                int y = (l2 != null) ? l2.val : 0;
                int sum = x + y + carry;
                carry = sum / 10;
                sum = sum % 10;
                ListNode node = new ListNode(sum);
                l3.next = node;

                if (l1 != null) {
                    l1 = l1.next;
                }
                if (l2 != null) {
                    l2 = l2.next;
                }
                l3 = l3.next;
            }
            if (carry > 0) {
                ListNode node = new ListNode(carry);
                l3.next = node;
            }
            return head.next;
        }


        public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
            return rec(l1, l2);
        }

        public ListNode rec(ListNode l1, ListNode l2) {
            if (l1 == null && l2 == null) return null;
            if (l1 == null) l1 = new ListNode(0);
            if (l2 == null) l2 = new ListNode(0);
            int value = l1.val + l2.val;
            if (value > 9) {
                value %= 10;
                if (l1.next == null) l1.next = new ListNode(1);
                else l1.next.val = l1.next.val + 1;
            }

            return new ListNode(value, rec(l1.next, l2.next));
        }

        public ListNode addTwoNumbers3(ListNode l1, ListNode l2) {

            ListNode dummy = new ListNode();
            ListNode temp = dummy;
            int carry=0;
            while(l1!=null || l2!=null || carry==1){
                int sum=0;
                if(l1!=null){
                    sum+=l1.val;
                    l1 = l1.next;
                }
                if(l2!=null){
                    sum+=l2.val;
                    l2 = l2.next;
                }
                sum+=carry;
                carry = sum/10;
                ListNode node = new ListNode(sum%10);
                temp.next = node;
                temp = temp.next;
            }
            return dummy.next;
        }
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
