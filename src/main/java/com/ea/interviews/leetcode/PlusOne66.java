package com.ea.interviews.leetcode;

public class PlusOne66 {

    public static void main(String[] args) {
        int[] digits = {9,9,9,9};
        print(plusOne(digits));
    }

    private static int[] plusOne(int[] digits){

        int l = digits.length;
        int r = 1;

        for (int i = l-1; i >= 0; i--) {
            int sum = digits[i]+r;
            digits[i] = sum % 10;
            r = sum / 10;
        }

        if(r!=0){
            digits =  expand(digits);
            digits[0] = r;
        }
        return digits;

    }

    private static void print(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private static int[] expand(int[] nums){
        int[] newArr = new int[nums.length+1];
        for(int i = 0;i<nums.length;i++){
            newArr[i+1]=nums[i];
        }
        return newArr;
    }
}
