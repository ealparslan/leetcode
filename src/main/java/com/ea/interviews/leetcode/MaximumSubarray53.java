package com.ea.interviews.leetcode;

public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        int max=nums[0], result=nums[0];
        for (int i=1;i<nums.length;i++){
            max=Math.max(nums[i],max+nums[i]);
            result=Math.max(result,max);
        }
        return result;
    }
}
