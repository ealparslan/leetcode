package com.ea.interviews.leetcode;


import java.util.HashMap;

// 1

public class DecodeString {

    int cursor;

    public String decode(String input){

        StringBuilder builder = new StringBuilder();
        StringBuilder all = new StringBuilder();
        boolean inside = false;

        int iter = 0;
        char[] split = input.toCharArray();

        for (int j = 0 ; j< split.length;j++) {
            char c = split[j];
            if(Character.isDigit(c)){
                if(!inside)
                    iter = iter * 10 + Integer.parseInt(String.valueOf(c));
                else{
                    String inStr = decode(input.substring(j,input.indexOf(']')+1));
                    builder.append(inStr);
                    j += inStr.length()-1;
                }
            }
            else if(c == '['){
                inside = true;
            }
            else if(Character.isLetter(c)){
                builder.append(c);
            }
            else if(c == ']'){
                inside = false;
                break;
            }
        }
        for (int i = 0; i < iter; i++) {
            all.append(builder);
        }
        builder = new StringBuilder();
        return all.toString();
    }

}
