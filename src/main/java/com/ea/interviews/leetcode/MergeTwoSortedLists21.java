package com.ea.interviews.leetcode;

public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 1 2 4
        // 1 3 4
        // pointer to 2
        // 1->1
        ListNode head = new ListNode(-1);
        ListNode p=head;

        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                p.next=l1;
                p=l1;
                l1=l1.next;
            }
            else{
                p.next=l2;
                p=l2;
                l2=l2.next;
            }
        }
        if(l1!=null)
            p.next=l1;
        if(l2!=null)
            p.next=l2;

        return head.next;

    }
}
