package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ZigzagConversion {

    public String convert(String s, int numRows){

        String result = "";

        ArrayList<Character> resultarr = new ArrayList();
        int mod = 2*numRows-2;
        ArrayList<HashSet<Integer>> rows = new ArrayList<>();

        rows.add(new HashSet<>(Arrays.asList(0)));
        for (int i = 1; i < numRows; i++) {
            rows.add(new HashSet<>(Arrays.asList(i, mod-i)));
        }

         // we have [0] [1,7] [2,6] [3,5] [4]

        char[] sarray = s.toCharArray();

        for (HashSet<Integer> row:rows) {

            int position = 0;
            while ( position < sarray.length){
                for (int index:row) {
                    if(position + index < sarray.length)
                        result = result + sarray[position + index];
                }
                position += mod;
            }
        }

        return result;

    }

    public String convert2(String s, int numRows){

        String result = "";

        int mod = 2*numRows-2;
        if(mod == 0) return s;
        ArrayList<HashSet<Integer>> rows = new ArrayList<>();

        rows.add(new HashSet<>(Arrays.asList(0)));
        for (int i = 1; i < numRows; i++) {
            rows.add(new HashSet<>(Arrays.asList(i, mod-i)));
        }

        // we have [0] [1,7] [2,6] [3,5] [4]

        char[] sarray = s.toCharArray();
        if (sarray.length == 0) return "";
        String[] lines = new String[numRows];

        for (int i = 0; i < sarray.length; i++) {
            int linenum = 0;
            for (HashSet row: rows) {
                if(row.contains(i % mod)){
                    if(lines[linenum] == null) lines[linenum] = "";
                    lines[linenum] =lines[linenum] + sarray[i];
                }
             linenum++;
            }
        }

        for (String line:lines) {
            if (line != null)
                result = result.concat(line);
        }

        return result;

    }

}
