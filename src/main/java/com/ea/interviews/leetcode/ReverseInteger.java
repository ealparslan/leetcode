package com.ea.interviews.leetcode;


public class ReverseInteger {

    public int reverse(int x) {

        boolean isNegative=false;
        if(x<0) {
            x=x*-1;
            isNegative = true;
        }

        int remaining;
        long result = 0;
        int divided = x;


        while (divided > 0){
            result = result * 10;
            remaining = divided % 10;
            divided = divided / 10;
            result = result * 10 + remaining;
        }

        if(isNegative) result = result*-1;

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;

        return (int)result;
    }

}
