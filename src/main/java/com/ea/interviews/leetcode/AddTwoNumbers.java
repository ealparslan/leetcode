package com.ea.interviews.leetcode;

// 2

 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }


public class AddTwoNumbers {

     boolean hasAdditive;
     boolean topElement = true;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum, sumSimple;
        sum = l1.val + l2.val + ((hasAdditive) ? 1 : 0);
        sumSimple = sum % 10;
        hasAdditive = (sum > 9) ?  true :  false;
        ListNode result = new ListNode(sumSimple);

        if(topElement){
            topElement = false;
        }

        if (l1.next != null && l2.next != null){ // both are not null
            //result.next = new ListNode(0);
            result.next = addTwoNumbers(l1.next , l2.next);
        }
        else if (l1.next == null && l2.next != null){ // 1st is null
            result.next = addTwoNumbers(new ListNode(0) , l2.next);
        }
        else if (l1.next != null && l2.next == null){ // 2nd is null
            result.next = addTwoNumbers(l1.next , new ListNode(0));
        }
        else if (hasAdditive) result.next = new ListNode(1); // both are null but we have an additive

        return result;
    }



}
