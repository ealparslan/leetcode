package com.ea.interviews.leetcode;

import java.util.ArrayList;

public class LongestPalindromicSubstring {

    public String longestPalindromeSubstring(String s){

        if(s.length() == 1)
            return s;

        int consecutiveCenterLenght = 1;

        char[] splitted = s.toCharArray();
        int biggestStep = 0;
        String biggestSub="";

        for (int i = 1; i < splitted.length-1; i++) {
            if(splitted[i] == splitted[i+1]){
                consecutiveCenterLenght++;
                biggestSub = s.substring(i-consecutiveCenterLenght , i   );
                continue;
            }

            int step = getBiggerStep(splitted,i,1);
            if(step > biggestStep)
            {
                biggestStep = step;
                biggestSub = s.substring(i - biggestStep, i + consecutiveCenterLenght + biggestStep );
            }

        }
//        if(biggestSub.equals(""))
//        {
//            for (int i = 0; i < splitted.length-1; i++) {
//                if(splitted[i] == splitted[i+1])
//                    biggestSub = String.valueOf(splitted[i]).concat(String.valueOf(splitted[i+1]));
//            }
//        }

        return biggestSub;
    }

    private int getBiggerStep(char[] splitted, int index, int step){
        int ret = step-1;
        if( (step <= index) && (step + index < splitted.length) && (splitted[index-step] == splitted[index+step]) )
        {
            ret = getBiggerStep(splitted,index,++step);
        }
        return ret;
    }

}
