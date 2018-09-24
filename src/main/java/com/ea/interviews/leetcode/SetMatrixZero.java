package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetMatrixZero {

    public static void main(String[] args) {

    }

    private static void setZero(int[][] nums){
        Set<Integer> zrows= new HashSet<>();
        Set<Integer> zcolumns = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j] == 0)
                {
                    zrows.add(i);
                    zcolumns.add(j);
                }
            }
        }
        for (Integer row: zrows) {
            for (int i = 0; i < nums[row].length; i++) {
                nums[row][i]=0;
            }
        }

        for (Integer column: zcolumns) {
            for (int i = 0; i < nums[column].length; i++) {
                nums[column][i]=0;
            }
        }
    }
}
