package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 119

public class PascalsTriangle2 {
    List<Integer> kthRow = new ArrayList<Integer>();

    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return new ArrayList<>(Arrays.asList(1));
        List<Integer> prevRow = getRow(rowIndex-1);
        kthRow = new ArrayList<Integer>();
        for(int i=1 ; i<rowIndex ; i++){
            kthRow.add(prevRow.get(i-1) + prevRow.get(i));
        }
        kthRow.add(0,1);
        if(rowIndex != 0) kthRow.add(rowIndex,1);
        return kthRow;
    }


}
