package com.ea.interviews.leetcode;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Set;

public class WordSearch79 {
    public static void main(String[] args) {

        char[][] board = {{'A','A'}};
        System.out.println(exist(board, "AAA"));

    }

    private static boolean exist(char[][] board, String word){

        boolean retval = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j]==word.charAt(0))
                {
                    Set<String> traverse = new HashSet<>();
                    traverse.add(String.valueOf(i)+'#'+j);
                    retval = retval || helper(board,word , 1, i,j, traverse);
                }
            }
        }
       return retval;

    }


    private static boolean helper(char[][] board, String word, int pos, int i, int j, Set<String> traverse){
        boolean retval = false;
        if(pos==word.length()) return true;
        else {
            if(i>0 && !traverse.contains(String.valueOf(i-1)+'#'+j) && board[i-1][j]==word.charAt(pos))
            {
                traverse.add(String.valueOf(i-1)+'#'+j);
                retval =  helper(board,word ,++pos ,i-1 ,j ,traverse);
            }
            if(retval) return retval;
            if(i<board.length-1 && !traverse.contains(String.valueOf(i+1)+'#'+j)  && board[i+1][j]==word.charAt(pos))
            {
                traverse.add(String.valueOf(i+1)+'#'+j);
                retval =  helper(board,word ,++pos ,i+1 ,j, traverse );
            }
            if(retval) return retval;
            if(j>0 && !traverse.contains(String.valueOf(i)+'#'+(j-1))  &&  board[i][j-1]==word.charAt(pos))
            {
                traverse.add(String.valueOf(i)+'#'+(j-1));
                retval =  helper(board,word ,++pos ,i ,j-1, traverse );
            }
            if(retval) return retval;
            if(j<board[0].length-1 && !traverse.contains(String.valueOf(i)+'#'+(j+1))  && board[i][j+1]==word.charAt(pos))
            {
                traverse.add(String.valueOf(i)+'#'+(j+1));
                retval =  helper(board,word ,++pos ,i ,j+1, traverse );
            }
            if(retval) return retval;
        }
        return retval;
    }
}
