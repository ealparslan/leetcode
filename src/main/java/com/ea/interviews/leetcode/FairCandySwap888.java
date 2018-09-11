package com.ea.interviews.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FairCandySwap888 {

    public static void main(String[] args) {

        int[] A = {};
        int[] B = {};

        int[] swap = fairCandySwap(A, B);
        System.out.println(swap[0] + " " + swap[1]);

    }

    private static int[] fairCandySwap(int[] A, int[] B) {

        int[] swap = new int[2];

        int sumA = 0;
        for (int a:A) {
            sumA += a;
        }

        Set<Integer> elementsB = new HashSet<>();
        int sumB = 0;
        for (int b:B) {
            sumB += b;
            elementsB.add(b);
        }

        int need = (sumB-sumA)/2;

        for (int a:A) {
            if(elementsB.contains(a+need))
            {
                swap[0] = a;
                swap[1] = a+need;
            }
        }
        return swap;
    }
}
