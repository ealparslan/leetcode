package com.ea.interviews.leetcode;

import java.util.*;

public class Pattern132 {
    public static void main(String[] args) {
        int[] nums = {1,3,2};
        System.out.println(find132pattern(nums));
    }


    private static boolean find132pattern(int[] nums) {


        int big = Integer.MIN_VALUE;
        Set<Integer> smalls = new HashSet<>();

        for (int i = nums.length-1; i > 1; i--){
            smalls.clear();
            for (int j = i-1; j>=0; j--){
                if(nums[i]<nums[j])
                    if(big == Integer.MIN_VALUE) big = j;
                else if(nums[i]>nums[j])
                    smalls.add(j);
            }
            if(containsPattern(big,smalls ))
                return true;
        }
        return false;
    }

    private static boolean containsPattern(int big, Set<Integer> smalls){
        if(smalls.size() == 0 || big == Integer.MIN_VALUE) return false;

        for (Integer i : smalls)
            if (i < big) return true;

        return false;
    }
}
