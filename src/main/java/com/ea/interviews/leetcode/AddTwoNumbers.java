package com.ea.interviews.leetcode;

// 2

public class AddTwoNumbers {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode l = addTwoNumbers(l1,l2 );

        System.out.println(l);
    }


    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int rem = 0;

        ListNode head = l1;

        while (l1.next != null){
            int sum = l1.val + (l2 == null ? 0 : l2.val);
            l1.val = sum / 10;
            rem = sum % 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1.next == null)
            {
                while(l2.next != null){
                    if(l2.val == 9){
                        l2.val = 0;
                        rem = 1;
                    }
                }

            }



        return head;
    }



}
