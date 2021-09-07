package com.ea.interviews.leetcode;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        int i=0;
        for(i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);
            boolean common = true;
            for(int s=1;s<strs.length;s++){
                if (strs[s].length()<=i || c!=strs[s].charAt(i)){
                    common = false;
                    break;
                }
            }
            if(!common)
                break;
        }
        return strs[0].substring(0,i);
    }
}
