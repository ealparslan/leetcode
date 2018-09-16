package com.ea.interviews.leetcode;

public class MergeKLists23 {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = new ListNode[3];
        lists[0] = l1;
        lists[1] = l2;
        lists[2] = l3;

        ListNode l = mergeKLists(lists);
        System.out.println(l.next);

    }

    private static ListNode mergeKLists(ListNode[] lists) {

        if(lists == null || lists.length == 0) return null;

        ListNode newHead = new ListNode(0);
        ListNode newEnd = newHead;
        _mergeKLists(lists,newEnd);

        return newHead;

    }

    private static void _mergeKLists(ListNode[] lists, ListNode newEnd) {

        int minIndex = 0;
        int minVal = 0;
        boolean minSet = false;
        for (int i = 0; i < lists.length; i++) {
            if(lists[i] == null) continue;
            if(!minSet)
            {
                minVal = lists[i].val;
                minSet = true;
            }
            if(lists[i] != null && lists[i].val <= minVal)
            {
                minIndex = i;
                minVal = lists[i].val;
            }
        }

        newEnd.next = lists[minIndex];
        newEnd = newEnd.next;
        if(lists[minIndex] != null)
        {
            lists[minIndex] = lists[minIndex].next;
            _mergeKLists(lists,newEnd);
        }


    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
