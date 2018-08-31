package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    public static void main(String args[]){


        List<String> seeds = new ArrayList<>();
        seeds.add("");
        System.out.println(generate(seeds, "233"));


    }

    private static List<String> generate(List<String> seeds, String digits){
        if(digits.length() == 0){
            return seeds;
        }
        char dig = digits.charAt(0);
        digits = digits.substring(1);
        List<String> retval = new ArrayList<>();
        for (String seed : seeds) {
            List<String> populated = new ArrayList<>();
            if(dig == '2'){
                populated.add(seed.concat("a"));
                populated.add(seed.concat("b"));
                populated.add(seed.concat("c"));
            }
            if(dig == '3'){
                populated.add(seed.concat("d"));
                populated.add(seed.concat("e"));
                populated.add(seed.concat("f"));
            }
            retval.addAll(generate(populated,digits));
        }
        return retval;
    }

}
