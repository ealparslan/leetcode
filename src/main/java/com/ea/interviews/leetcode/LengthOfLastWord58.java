package com.ea.interviews.leetcode;

public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')
                count++;
            else{
                if(count!=0)
                    return count;
            }
        }
        return count;
    }
}
