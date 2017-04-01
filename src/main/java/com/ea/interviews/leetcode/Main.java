package com.ea.interviews.leetcode;

import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        /*PascalsTriangle2 triangle2 = new PascalsTriangle2();
        System.out.print(triangle2.getRow(10).stream().map(i -> i.toString()).collect(Collectors.joining(" ")));*/

        /*TwoSum twosum = new TwoSum();
        int[] result = twosum.twoSum(new int[]{2,3,4,5},8);
        System.out.print("Elements are: " + result[0] + " and " + result[1]);*/

/*        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(9);
        //l2.next.next = new ListNode(4);

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode result = addTwoNumbers.addTwoNumbers(l1,l2);*/

        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        System.out.print(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwwwkewq"));
    }

}
