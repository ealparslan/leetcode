package com.ea.interviews.leetcode;

public class ClimbingStairs70 {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int[] cases = new int[n];
        cases[0]=1;
        cases[1]=2;
        for(int i=2;i<n;i++)
            cases[i]=cases[i-2]+cases[i-1];
        return cases[n-1];
    }
}
