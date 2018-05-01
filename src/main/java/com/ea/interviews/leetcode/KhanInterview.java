package com.ea.interviews.leetcode;

import java.util.HashSet;
import java.util.Set;

public class KhanInterview {

    public static void main(String[] args){

        int[] input = {3,5,2,-10,-2};

        System.out.print(ifExists(input));

    }

    private static boolean ifExists(int[] input){

        Set<Integer> remaining = new HashSet<>();
        for (int i = 1; i < input.length; i++) {
            if(remaining.contains(input[i]))
                return true;
            for (int j = 0; j < i; j++) {
                remaining.add(0-(input[i]+input[j]));
            }
        }

        return false;
    }
}
