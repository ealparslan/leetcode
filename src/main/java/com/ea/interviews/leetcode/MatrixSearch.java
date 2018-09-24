package com.ea.interviews.leetcode;

public class MatrixSearch {

    public static void main(String[] args) {
        int[][] nums = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};

        System.out.println(searchMatrix(nums,13 ));

    }

    private static boolean searchMatrix(int[][] matrix, int target){
        int rowNum = findRow(matrix,target ,0 , matrix.length-1);

        if(rowNum == -1) return false;

        return findColumn(matrix,target ,rowNum ,0 ,matrix[rowNum].length-1 );
    }

    private static boolean findColumn(int[][] matrix,int target, int rowNum, int colS, int colE ){

        int midColumn = (colE+colS)/2;

        if(colE<=colS && matrix[rowNum][colE]!=target) return false;

        if(matrix[rowNum][midColumn] == target)
            return true;
        else if(matrix[rowNum][midColumn] > target)
            return findColumn(matrix,target ,rowNum ,colS ,midColumn-1 );

        else
            return findColumn(matrix,target ,rowNum ,midColumn+1 ,colE );
    }


    private static int findRow(int[][] matrix, int target, int rowS, int rowE){
        if(rowS>rowE) return -1;
        int midRow = (rowE+rowS)/2;
        int val = matrix[midRow][matrix[midRow].length-1];

        if(target < val){
            if(target < matrix[midRow][0])
                midRow--;
            return midRow;
        }
        else
            return findRow(matrix,target ,++midRow , rowE);
    }
}
