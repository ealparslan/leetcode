package com.ea.interviews.leetcode;

import java.util.*;

public class AreSentencesSimilar734 {

    public static void main(String[] args) {

        String[] words1 = {"great"};
        String[] words2 = {"great"};
        String[][] pairs = {};

        System.out.println(areSentencesSimilar(words1, words2, pairs));
    }

    private static boolean areSentencesSimilar(String[] words1, String[] words2, String[][] pairs) {

        Set<String> similarities = new HashSet<>();

        for (String[] pair:pairs) {
            similarities.add(pair[0]+"#"+pair[1]);
            similarities.add(pair[1]+"#"+pair[0]);
        }

        for (int i = 0; i < words1.length; i++) {
            if(!words1[i].equals(words2[i])
                    && !similarities.contains(words1[i]+"#"+words2[i])
                    && !similarities.contains(words2[i]+"#"+words1[i])){
                return false;
            }
        }
        return true;
    }
}
