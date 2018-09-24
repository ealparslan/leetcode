package com.ea.interviews.leetcode;

import javafx.collections.transformation.SortedList;

import java.util.List;
import java.util.TreeSet;

public class KthLargestArray {
    public static void main(String[] args) {

        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        System.out.println(findKthLargest(nums,k ));
    }

    private static int findKthLargest(int[] nums, int k) {

        int[] l = new int[k];
        int pos = 0;

        for (int i:nums){
            int p = pos;
            while (p>=0){
                if(i>l[p]){
                    if(p+1 < k)l[p+1]=l[p];
                    if(p==0 || i<=l[p-1]) {
                        l[p] = i;
                        p--;
                        break;
                    }
                }
            }
        }
        return l[k-1];
    }



}
