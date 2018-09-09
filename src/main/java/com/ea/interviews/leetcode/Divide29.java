package com.ea.interviews.leetcode;

public class Divide29 {

    public static void main(String[] args) {
        System.out.println(divide(-2147483648,-1 ));
    }

    private static int divide(int dividend, int divisor) {



        int n = dividend;
        int k = divisor;
        int l = 0;

        boolean negN = false;
        boolean negK = false;

        if(dividend < 0)
        {
            n = 0-dividend;
            negN = true;
        }

        if(divisor < 0)
        {
            k = 0-divisor;
            negK = true;
        }

        while (n >= k){
            n = n-k;
            l++;
        }
        if(negN^negK)
            return 0-l;
        else
            return l;
    }

}
