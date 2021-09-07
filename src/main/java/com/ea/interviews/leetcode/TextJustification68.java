package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TextJustification68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        // ["What","must","be","acknowledgment","shall","be"]
        // 16
        // What must be

        List<String> lines = new ArrayList<>();

        int i=0;
        int capacity=maxWidth;
        List<String> line = new ArrayList<>();

        while(i<words.length){
            if(words[i].length()<=capacity){
                line.add(words[i]);
                capacity-=words[i].length();
                capacity-=1;
                ++i;
            }
            else{
                StringBuilder sb = new StringBuilder();
                int extra=(capacity+line.size()-1)/(line.size()-1);
                for(String item : line){
                    sb.append(item);
                    for(int s=0;s<extra;s++)
                        sb.append(" ");
                }
                lines.add(sb.toString());
                capacity=maxWidth;
                line = new ArrayList<>();
            }
        }
        return lines;
    }
}
