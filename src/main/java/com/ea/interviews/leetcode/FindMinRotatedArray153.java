package com.ea.interviews.leetcode;

public class FindMinRotatedArray153 {

    public static void main(String[] args) {
        int[] nums = {9,10,11,12,3,4,5,6,7,8};

        System.out.println(findMin(nums));
    }

    private static int findMin(int[] nums){
        return helper(nums, 0, nums.length-1);

    }

    private static int helper(int[] nums, int s, int e){
        if(s==e) return Integer.MAX_VALUE;
        int m = (s+e)/2;
        if(m>0 && nums[m]<nums[m-1]) return nums[m];
        else if(m < nums.length-1 && nums[m]>nums[m+1]) return nums[m+1];
        else {
            if(nums[m]<nums[s])
                return helper(nums,s , m-1);
            else
                return helper(nums,m+1 ,e );
        }
    }


}
