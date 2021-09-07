package com.ea.interviews.leetcode;

import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagrams49 {
    public ArrayList<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> appears = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            StringBuilder sb = new StringBuilder();
            for(char c : chars)
                sb.append(c);
            if(appears.containsKey(sb.toString()))
                appears.get(sb.toString()).add(strs[i]);
            else
                appears.put(sb.toString(),new ArrayList(List.of(strs[i])));
        }
        return new ArrayList(appears.values());
    }
}
