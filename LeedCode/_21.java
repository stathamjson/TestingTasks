package code.LeedCode;

import java.util.ArrayList;
import java.util.List;

public class _21 {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(7);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(3);
        ListNode l7 = new ListNode(8);
        ListNode l8 = new ListNode(10);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = null;

        System.out.println(mergeTwoLists(l1, l5));


    }
    private ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode returnList = new ListNode(Integer.MIN_VALUE);
        ListNode head = returnList;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val){
                returnList.next=list1;
                list1=list1.next;
            } else {
                returnList.next=list2;
                list2=list2.next;
            }
            returnList=returnList.next;
        }

        if (list1 == null) {
            returnList.next=list2;
        } else if (list2 == null) {
            returnList.next=list1;
        }
        return head.next;

    }
    private static List mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode returnList = new ListNode(Integer.MIN_VALUE);
        ListNode head = returnList;
        List<Integer> list = new ArrayList<>();

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val){
                returnList.next=list1;
                list.add(list1.val);
                list1=list1.next;
            } else {
                returnList.next=list2;
                list.add(list2.val);
                list2=list2.next;
            }
            returnList=returnList.next;
        }

        if (list1 == null) {
            returnList.next=list2;
            list.add(list2.val);
        } else if (list2 == null) {
            returnList.next=list1;
            list.add(list1.val);
        }
        return list;
    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

