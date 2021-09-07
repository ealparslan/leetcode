package com.ea.interviews.leetcode;


import java.util.HashMap;

// 1

public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> needsWhat = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0 ; i<nums.length ; i++) {
            int value = nums[i];
            int needs = target-value;
            if(needsWhat.containsKey(value)) result = new int[]{i,needsWhat.get(value)};
            needsWhat.put(needs,i);
        }
        return result;
    }

}
