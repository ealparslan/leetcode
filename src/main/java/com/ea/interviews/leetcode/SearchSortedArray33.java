package com.ea.interviews.leetcode;

import java.util.Arrays;

public class SearchSortedArray33 {
    public int search(int[] nums, int target) {
        if(nums.length==1) return nums[0]==target ? 0 : -1;
        int l=0,r=nums.length-1, mid=0,pivot=0;
        while(l<=r){
            mid=l+(r-l)/2;
            if(mid<nums.length-1 && nums[mid]>nums[mid+1]){
                pivot=mid+1;
                break;
            }
            else if(nums[0]<=nums[mid]) // pivot is in right side
                l=mid+1;
            else
                r=mid-1;
        }


        int[] arr= Arrays.copyOf(nums,nums.length*2);
        for(int i=0;i<nums.length;i++)
            arr[nums.length+i]=nums[i];
        l=pivot; r=pivot+nums.length-1; mid=-1;
        while(l<=r){
            mid=l+(r-l)/2;
            if(arr[mid]==target)
                return mid%nums.length;
            else if(arr[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}
