package com.ea.interviews.leetcode;

public class RemoveDuplicates26 {

    public static void main(String[] args){

        int[] nums= {0,0,1,1,1,2,2,3,3,4};

        int p1 = 1;

        for (int p2 = 1; p2 < nums.length; p2++) {
            if(nums[p2]==nums[p1-1]){
                continue;
            }
            else {
                nums[p1] = nums[p2];
                p1++;
            }
        }
        System.out.println(nums);
    }

}
