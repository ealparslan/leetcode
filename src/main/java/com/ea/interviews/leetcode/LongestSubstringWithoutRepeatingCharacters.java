package com.ea.interviews.leetcode;

// 3

public class LongestSubstringWithoutRepeatingCharacters {

    int maxLenght;
    String substr = new String();

    public int lengthOfLongestSubstring(String s) {
        char[] source = s.toCharArray();
        for (char c:source) {
            int position = substr.indexOf(c);
            if(position>=0) {
                maxLenght = Math.max(maxLenght,substr.length());
                substr = substr.substring(position+1);
            }
            substr += c;
        }
        return Math.max(maxLenght,substr.length());
    }
}
