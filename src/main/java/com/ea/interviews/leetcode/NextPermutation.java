package com.ea.interviews.leetcode;

public class NextPermutation {
    public static void main(String[] args) {

        int[] nums = {1,2,3};

        int decreaseIndex = 0;

        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]) {
                decreaseIndex = i;
                break;
            }
        }
        for(int j=decreaseIndex+1;j<nums.length;j++)
        {
            if(nums[j]>nums[decreaseIndex]){
                if(j+1 <= nums.length-1 && nums[j+1] > nums[decreaseIndex]) continue;
                int swap = nums[decreaseIndex];
                nums[decreaseIndex]=nums[j];
                nums[j]=swap;
                break;
            }
        }
        int last = nums[nums.length-1];
        for(int j=nums.length-2;j>decreaseIndex;j--){
            nums[j+1]=nums[j];
        }
        nums[decreaseIndex+1]=last;

        System.out.println(0);
    }


}
