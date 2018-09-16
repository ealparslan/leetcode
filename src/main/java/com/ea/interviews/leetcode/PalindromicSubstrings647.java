package com.ea.interviews.leetcode;

public class PalindromicSubstrings647 {

    public static void main(String[] args) {

        String s = "aaa";
        System.out.println(countSubstrings(s));
    }

    private static int countSubstrings(String s) {

        if(s.length()==0) return 0;

        int amount = 1;

        int i = 1;
        while (i < s.length()){
            amount++;
            if(i==s.length()-1) break;
            int f = i+1;
            int b = i-1;

            while (f<s.length()-1 && s.charAt(f) == s.charAt(i)){
                f++;
                amount++;
            }


            if(s.charAt(f) != s.charAt(b)){
                i++;
                continue;
            }

            while (b>0 && f<s.length()-1 && s.charAt(f+1) == s.charAt(b-1)){
                f++;
                b--;
            }

            amount++;
            i = f+1;
        }


        return amount;
    }


}
