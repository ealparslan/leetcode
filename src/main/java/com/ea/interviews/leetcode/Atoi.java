package com.ea.interviews.leetcode;

public class Atoi {

    public static void main(String[] args){

        StringBuilder builder = new StringBuilder();
        String input = "    -42";
        input = input.trim();
        if(input.isEmpty())
            System.out.println(0);
        String firstChar = String.valueOf(input.charAt(0));
        if(firstChar.matches("[^0-9+-]"))
            System.out.println(0);
        else{
            builder.append(firstChar);
        }


        char[] chars = input.substring(1).toCharArray();
        for (char c:chars) {
            if(Character.isDigit(c))
                builder.append(c);
            else
                break;
        }
        String num = builder.toString();
        boolean minus = false;
        if(num.charAt(0)=='-')
        {
            minus = true;
            num = num.substring(1);
        }
        else if(num.charAt(0)=='+'){
            num = num.substring(1);
        }

        int len = num.length();

        int ascii_zero = '0';
        int sum = 0;
        for (int i = len-1; i >= 0; i--) {
            if(minus)
                sum -= Math.pow(10, i) * (num.charAt((len-1)-i)-ascii_zero);
            else
                sum += Math.pow(10, i) * (num.charAt((len-1)-i)-ascii_zero);
        }
        System.out.println(sum);


    }
}
