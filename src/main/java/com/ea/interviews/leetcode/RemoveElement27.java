package com.ea.interviews.leetcode;

public class RemoveElement27 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int p1 = 0;

        for (int p2 = 0; p2 < nums.length; p2++) {
            if(nums[p1] == val){
                if(nums[p2] == val)
                    continue;
                else {
                    nums[p1] = nums[p2];
                    p1++;
                }
            }
            else
            {   if(nums[p2] == val)
                    continue;
                nums[p1] = nums[p2];
                p1++;
            }
        }
        System.out.println(p1);
    }
}
