package com.ea.interviews.leetcode;

public class MinimumPathSum64 {

    public static void main(String[] args) {

        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};

        System.out.println(minPathSum(grid));

    }

    private static int minPathSum(int[][] grid){
        int sum = grid[0][0];

        sum = sum + minSub(grid,0 , 0);

        return sum;
    }

    private static int minSub(int[][] grid, int posi, int posj){

        int lstrow = grid.length-1;
        int lstcol = grid[0].length-1;

        if(posi==lstrow && posj==lstcol)
            return 0;

        int min = Integer.MAX_VALUE;

        if(posi < lstrow){
            int mindown = grid[posi+1][posj] + minSub(grid,posi+1 ,posj );
            if(mindown < min)
                min = mindown;
        }

        if(posj < lstcol){
            int minright = grid[posi][posj+1] + minSub(grid,posi ,posj+1 );
            if(minright < min)
                min = minright;
        }
        return min;
    }
}
