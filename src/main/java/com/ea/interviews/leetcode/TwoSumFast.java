package com.ea.interviews.leetcode;

import java.util.*;

public class TwoSumFast {

    public static void main(String[] args){
        int[] input = new int[]{0,1,-5,2,2,-2,-3,0,3,-1,-2};
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(input);

        int onit = 0;
        for (int i = 0; i < input.length; i++) {
            if(input[i] == onit) {
                i++;
                continue;
            }
            result.addAll(twoSum(input,0-input[i], i));
            onit = input[i];
        }
        System.out.println(result);
    }


    private static Set<List<Integer>> twoSum(int[] input, int target, int on){
        Set<List<Integer>> result = new HashSet<>();

        int p1 = 0;
        int p2 = input.length-1;

        while(p1 != p2){
            if(p1==on) {
                p1++;
                continue;
            }
            if(p2==on) {
                p2--;
                continue;
            }
            int sum = input[p1]+input[p2];
            if(sum == target){
                List<Integer> r = new ArrayList<>();
                r.add(input[p1]);
                r.add(input[p2]);
                r.add(input[on]);
                result.add(r);
                int poz =  input[p1];
                while (input[p1] == poz)
                    p1++;
            }
            else if(sum < target){
                p1++;
            }
            else
                p2--;

        }
        return result;
    }



}
