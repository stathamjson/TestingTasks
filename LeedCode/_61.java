package LeedCode;

public class _61 {

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

        int k = 6666;

        PrintNode(l1);
        PrintNode(rotateRight(l1, k));


    }

    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }

        ListNode iter = head;
        int size = 0;
        while (iter != null) {
            size++;
            iter = iter.next;
        }
        k = k % size;

        iter = head;

        for (int i = 0; i < size - k; i++) {
            iter = iter.next;
        }

        ListNode newNode = new ListNode(Integer.MIN_VALUE);
        ListNode start = newNode;


        for (int i = 0; i < k; i++) {
            newNode.next = iter;
            iter = iter.next;
            newNode = newNode.next;

        }
        iter = head;
        for (int i = 0; i < size - k; i++) {
            newNode.next = iter;
            iter = iter.next;
            newNode = newNode.next;

        }
        newNode.next = null;

        return start.next;
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

    static void PrintNode(ListNode listNode) {
        ListNode head = listNode;
        while (head.next != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println(head.val);
    }
}
