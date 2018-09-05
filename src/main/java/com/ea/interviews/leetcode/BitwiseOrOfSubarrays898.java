package com.ea.interviews.leetcode;

import java.util.HashSet;
import java.util.Set;

public class BitwiseOrOfSubarrays898 {

    public static void main(String[] args){

        Integer[] A = {1,2,5};


        Set<Integer> opers =new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            Integer oper = 0;
            for (int j = i; j < A.length; j++) {
                oper |= A[j];
                opers.add(oper);
            }
        }
        System.out.println(opers);
    }

}
