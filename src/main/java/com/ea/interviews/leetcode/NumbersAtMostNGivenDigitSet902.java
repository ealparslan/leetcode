package com.ea.interviews.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static java.lang.Math.log;
import static java.lang.StrictMath.pow;

public class NumbersAtMostNGivenDigitSet902 {

    public static void main(String[] args) {

        String[] D = {"1","4","9"};

        System.out.println(atMostNGivenDigitSet(D, 9382));

    }

    private static int atMostNGivenDigitSet(String[] D, int N) {
        return _atMostNGivenDigitSet(D,N , true);
    }


    private static int _atMostNGivenDigitSet(String[] D, int N, boolean restricted) {

        int firstDigit = N/((int)(pow(10,(int)log(N))));

        int comb = 1;

        for (String aD : D) {
            if (!restricted)
                comb *= _atMostNGivenDigitSet(D, N % 10, false);
            else {
                if (Integer.valueOf(aD) < firstDigit) {
                    comb *= _atMostNGivenDigitSet(D, N % 10, false);
                } else if (Integer.valueOf(aD) == firstDigit) {
                    comb *= _atMostNGivenDigitSet(D, N % 10, true);
                }
            }
        }
        return comb;
    }


}
