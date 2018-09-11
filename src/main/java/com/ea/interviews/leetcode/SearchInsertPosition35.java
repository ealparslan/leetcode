package com.ea.interviews.leetcode;

public class SearchInsertPosition35 {

    public static void main(String[] args) {
        int[] nums = {};
        int target = 4;
        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target) {
        if(nums.length == 0) return 0;
        return _searchInsert(nums,target ,0 , nums.length-1);
    }


    private static int _searchInsert(int[] nums, int target, int s, int e) {
        int mid = (e+s)/2;
        if(nums[mid] == target)
            return mid;
        else{
            if(nums[mid] > target){
                if(mid == s) return mid;
                return _searchInsert(nums,target ,s , mid-1);
            }
            else {
                if(mid == e) return mid+1;
                return _searchInsert(nums,target ,mid+1 ,e );
            }
        }
    }


}
