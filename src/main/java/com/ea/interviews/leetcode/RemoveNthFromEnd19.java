package com.ea.interviews.leetcode;

public class RemoveNthFromEnd19 {

    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode node = removeNthFromEnd(listNode, 5);
        System.out.println(node);

    }


    private static ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode frontNode = head;
        ListNode backNode = head;

        for (int i = 0; i < n; i++) {
            if(frontNode.next != null)
                frontNode = frontNode.next;
            else{
                head = head.next;
            }
        }

        while (frontNode.next != null){
            frontNode = frontNode.next;
            backNode = backNode.next;
        }

        backNode.next = backNode.next.next;

        return head;
    }


    private static class ListNode {
        int val;
        ListNode next;
          ListNode(int x) { val = x; }
    }

}
