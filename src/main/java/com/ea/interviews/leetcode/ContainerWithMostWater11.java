package com.ea.interviews.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainerWithMostWater11 {

    public static void main(String[] args){

        int[] input = {3,5,2,10,2,3,4,7,6,9,2,10};

        System.out.println(biggestContainer(input));

    }

    private static int biggestContainer(int[] input){

        int max = 0;
        int head = 0;
        int tail = input.length-1;

        while (head != tail){
            int height = (input[head]<input[tail] ? input[head] : input[tail]);
            int area = (tail-head) *  height;
            if (area > max) max = area;
            if (input[head]<input[tail])
                head++;
            else
                tail--;
        }

        return max;

    }
}
