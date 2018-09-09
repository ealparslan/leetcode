package com.ea.interviews.leetcode;

public class Strstr28 {

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issi";
        System.out.println(pos(haystack,needle));
    }

    private static int pos(String haystack, String needle){
        if(needle.length() == 0) return 0;
        int pos = -1;

        char[] hay = haystack.toCharArray();
        char[] ne = needle.toCharArray();

        int p1 = 0;

        for (int i = 0; i < hay.length; i++) {
            if(hay[i] != ne[p1])
            {
                if (p1!=0) i = i-p1;
                p1 = 0;
            }
            else {
                if(p1 == ne.length-1)
                    return i-p1;
                else
                    p1++;
            }
        }
        return pos;
    }

}
