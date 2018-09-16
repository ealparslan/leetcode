package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationInt {

    public static void main(String[] args){

        int[] nums = {1,2,3};

        List<List<Integer>> llist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        llist.add(list);

        List<List<Integer>> result = permute(llist, nums,1);

        System.out.println(0);
    }

    private static List<List<Integer>> permute(List<List<Integer>> llist, int[] nums, int pos){

        if(pos==nums.length) return llist;
        int n = nums[pos];
        pos++;
        List<List<Integer>> result = new ArrayList<>();

        for (List<Integer> list : llist) {
            List<List<Integer>> iterList = new ArrayList<>();
            for (int i = 0; i <= list.size(); i++) {
                List<Integer> nlist = new ArrayList<>(list);
                nlist.add(i, n);
                iterList.add(nlist);
            }
            result.addAll(permute(iterList,nums , pos));
        }
        return result;
    }

}
