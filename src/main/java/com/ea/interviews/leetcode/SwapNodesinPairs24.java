package com.ea.interviews.leetcode;

public class SwapNodesinPairs24 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//        node.next.next.next.next = new ListNode(5);
//        node.next.next.next.next.next = new ListNode(6);

        ListNode newHead = swapPairs(node);
        System.out.println(newHead.val);
    }

    private static ListNode swapPairs(ListNode head) {

        if(head == null)
            return null;
        if(head.next == null)
            return head;

        ListNode startP = new ListNode(-1);
        startP.next = head.next;
        ListNode p0 = startP;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode ps = head.next.next;

        while (p1.next != null){
            p0.next = p2;
            p1.next = p2.next;
            p2.next = p1;
            p0 = p1;
            if(ps != null)  {
                if(ps.next != null) p2 = ps.next;
                p1 = ps;
                ps = p2.next;
            }
        }
        return startP.next;

    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}
