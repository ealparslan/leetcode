package com.ea.interviews.leetcode;

public class ImplementStrStr28 {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0 && needle.length()==0)
            return 0;
        int index=haystack.indexOf(needle);
        return index;
    }
}
