package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray442 {
    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> l = findDuplicates(nums);

        System.out.println(l);

    }

    private static List<Integer> findDuplicates(int[] nums) {

        List<Integer> retval = new ArrayList<>();

        for(int i=0; i<nums.length;i++){
            while(nums[i]!=i+1){
                {
                    if(nums[nums[i]-1] == nums[i]) {
                        if(!retval.contains(nums[i]))   retval.add(nums[i]);
                        break;
                    }
                    else
                        swap(nums,i ,nums[i]-1);
                }
            }
        }

        return retval;
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
