package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets78 {

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        List<List<Integer>> result = subsets(nums);
        System.out.println(0);
    }

    private static List<List<Integer>> subsets(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        for(int i:nums){
            generate(result,i );
        }

        return result;

    }

    private static void generate(List<List<Integer>> l, int n){
        List<List<Integer>> newSubs = new ArrayList<>();
        for (List<Integer> sub : l){
            List<Integer> newSub = new ArrayList<>(sub);
            newSub.add(n);
            newSubs.add(newSub);
        }
        l.addAll(newSubs);
    }

    
}
