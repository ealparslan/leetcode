package com.ea.interviews.leetcode;

public class FindFirstandLastPositionSortedArray34 {

    static int[] results = {-5,-5};
    static boolean l,r;


    public static void main(String[] args) {

        int[] nums = {5,5,5,5,5,5,5,5,5,5,5,7,7,8,8,8,8,10,10,10,10,10,10,10,10};
        int target = 5;
        searchRange(nums,target );
        System.out.println(0);
    }

    private static int[] searchRange(int[] nums, int target){
        if(nums.length == 0) return results;
        return  _searchRange(nums,target,0, nums.length);
    }

    private static int[] _searchRange(int[] nums, int target, int start, int end) {


        if(end-start == 1){

            return results;
        }

        int mid = (start + end) / 2;
        if(nums[mid] < target){
            start = mid;
            _searchRange(nums,target,start,end);
        }
        else if(nums[mid] > target){
            end = mid;
            _searchRange(nums, target, start, end);
        }
        else{
            if(!l){
                if(mid==nums.length-1 || nums[mid+1] != target){
                    results[1] = mid;
                    r = false;
                }
                else if(nums[mid+1] == target){
                    r = true;
                    _searchRange(nums,target,mid, end);
                }
            }
            if(!r){
                if(nums[mid-1] != target){
                    results[0] = mid;
                    l = false;
                }
                else if(nums[mid-1] == target){
                    l = true;
                    _searchRange(nums,target,start,mid);
                }
            }
        }
        return results;
    }
}
