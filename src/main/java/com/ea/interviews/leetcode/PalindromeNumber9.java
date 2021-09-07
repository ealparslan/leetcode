package com.ea.interviews.leetcode;

public class PalindromeNumber9 {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int orig=x;
        int gen=0;
        while(x>0){
            gen = gen*10 + x%10;
            x /= 10;
        }
        if(orig==gen)
            return true;
        else
            return false;
    }
}
