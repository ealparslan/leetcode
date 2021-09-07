package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber17 {

    Character[][] map = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return new ArrayList<>();
        List<StringBuilder> combs = new ArrayList<>();
        combs.add(new StringBuilder());
        return helper(digits,0,combs);

    }

    List<String> helper(String digits, int index, List<StringBuilder> combs){
        List<String> combinations = new ArrayList<>();
        if(index>=digits.length()){
            combinations = new ArrayList<>();
            for(StringBuilder comb : combs)
                combinations.add(comb.toString());
            return combinations;
        }

        List<StringBuilder> gen;

        for(StringBuilder comb : combs){

            for(char c : this.map[Character.getNumericValue(digits.charAt(index))]){
                gen = new ArrayList<>();
                StringBuilder sb = new StringBuilder();
                sb.append(comb).append(c);
                gen.add(sb);
                combinations.addAll(helper(digits, index+1,gen));
            }
        }
        return combinations;
    }

}
