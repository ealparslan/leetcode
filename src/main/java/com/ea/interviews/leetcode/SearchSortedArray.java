package com.ea.interviews.leetcode;

public class SearchSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9};

        int[] arrPivoted = {4,5,6,7,8,1,2,3};

        //System.out.println(searchSorted(0, arr, 0, arr.length-1));

        System.out.println(searchPivoted(3, arrPivoted,0 ,arrPivoted.length-1 ));

    }

    private static int searchSorted(int t, int[] arr, int start, int end){
        int actPos = (end+start)/2;
        int actual = arr[actPos];

        if(actual == t)
            return (end+start)/2;
        else if(actual > t) {
            if (end - start < 2) return -1;
            end = actPos;
        }
        else{
            if(end-start < 2) return -1;
            start = actPos;
        }
        return searchSorted(t,arr ,start , end);
    }

    private static int searchPivoted(int t, int[] arr, int start, int end){
        if(end-start<2)
        {
            if(arr[start]==t)
                return start;
            if(arr[end]==t)
                return end;
            else return -1;
        }

        int midPos = (end+start)/2;
        int mid = arr[midPos];

        if(arr[0] > mid){
            if(t>mid){
                if(t>arr[start])
                    end = midPos;
                else
                    start = midPos;
            }
            else
                end = midPos;
        }
        else {
            if(t<mid){
                if(t<arr[start])
                    start = midPos;
                else
                    end = midPos;
            }
            else
                start = midPos;
        }

        return searchPivoted(t,arr ,start , end);

    }
}
