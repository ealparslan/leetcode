package com.ea.interviews.leetcode;

import java.util.Scanner;

public class RomanToInteger {

    public static void main(String args[]){

        Scanner scanner = new Scanner( System.in );

        while (true){
            String input = scanner.nextLine();
            char[] chars = input.toCharArray();

            int sum = 0;

            for (int i = 0; i < chars.length; i++) {
                if(i<chars.length-1 && convert(chars[i]) < convert(chars[i+1])){
                    sum = sum - convert(chars[i]) + convert(chars[i+1]);
                    i++;
                }
                else
                    sum += convert(chars[i]);
            }

            System.out.println(sum);
        }

    }


    private static int convert(char c){
        if(c == 'I')
            return 1;
        else if(c == 'V')
            return 5;
        else if(c == 'X')
            return 10;
        else if(c == 'L')
            return 50;
        else if(c == 'C')
            return 100;
        else if(c == 'D')
            return 500;
        else if(c == 'M')
            return 1000;
        else return 0;
    }
}
