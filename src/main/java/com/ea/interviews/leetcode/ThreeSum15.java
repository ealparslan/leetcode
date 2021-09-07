package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length<3)
            return result;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            if(nums[i]>0)
                break;
            int target=0-nums[i];
            int p1=i+1;
            int p2=nums.length-1;
            while(p1<p2){
                if(nums[p1]+nums[p2]==target){
                    result.add(new ArrayList<>(Arrays.asList(nums[i],nums[p1],nums[p2])));
                    p1++;
                    while(nums[p1]==nums[p1-1] && p1<p2)
                        p1++;
                }
                else if (nums[p1]+nums[p2]>target)
                    p2--;
                else
                    p1++;
            }

        }

        return result;
    }
}
