package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindandReplacePattern890 {

    public static void main(String[] args) {

        String[] words = {"ccc","abc","deq","mee","aqq","dkd"};
        String pattern = "abb";

        List<String> matches = findAndReplacePattern(words,pattern );

        matches.forEach(m -> System.out.println(m));

    }

    private static List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> matches = new ArrayList<>();

        for (String w:words) {
            if(match(w, pattern))
                matches.add(w);
        }
        return matches;
    }

    private static boolean match(String w, String p){
        boolean match = true;

        if(w.length()!=p.length())
            return false;

        Map<Character, Character> mapping = new HashMap<>();
        char[] warr = w.toCharArray();
        for (int i = 0; i < warr.length; i++) {
            if(mapping.containsKey(warr[i]))
            {
                if(!mapping.get(warr[i]).equals(p.charAt(i)))
                    return false;
            }
            else
            {
                if(mapping.containsValue(p.charAt(i)))
                    return false;
                mapping.put(warr[i], p.charAt(i));
            }
        }
        return match;
    }
}
