package LeedCode;

public class _203 {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = null;


        PrintNode(l1);
        PrintNode(removeElements(l1, 3));

    }

    static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        ListNode newHead = new ListNode(Integer.MIN_VALUE);
        newHead.next = head;
        ListNode iter = newHead;

        while (iter.next != null) {
            if (iter.next.val == val) {
                iter.next = iter.next.next;

            } else {
                iter = iter.next;
            }
        }

        return newHead.next;
    }

    static void PrintNode(ListNode listNode) {
        ListNode head = listNode;
        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println(head.val);
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
