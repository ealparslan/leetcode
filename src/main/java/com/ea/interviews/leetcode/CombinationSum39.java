package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum39 {
    public static void main(String[] args) {
        int nums[] = {2,3,6,7};


        List<List<Integer>> result = combinationSum(nums,8 );

        result.forEach(res -> res.forEach(r-> System.out.print(r)));
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> resList = new ArrayList<>();

        for (int i = 0; i<candidates.length-1 ; i++) {
            helper(candidates,resList,new ArrayList<>(), target ,i );
        }

        return resList;
    }


    private static void helper(int[] nums,List<List<Integer>> all, List<Integer> canList, int target, int start) {

        if(target<0)
            return;
        else if(target==0)
            all.add(new ArrayList<>(canList));
        else {
            for (int i=start;i<nums.length;i++){
                canList.add(nums[i]);
                helper(nums,all ,canList ,target-nums[i] ,i );
                canList.remove(canList.size()-1);
            }
        }
    }
}
