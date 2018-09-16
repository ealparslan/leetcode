package com.ea.interviews.leetcode;

import java.util.*;

public class PartitionLabels763 {

    public static void main(String[] args) {
        String s = "eaaaabaaec";


        List<Integer> l = partitionLabels(s);
        System.out.println(0);

    }

    private static List<Integer> partitionLabels(String S){
        Map<Character,Letter> letterMap = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (letterMap.containsKey(c))
                letterMap.get(c).end = i;
            else
                letterMap.put(c,new Letter(c,i ) );
        }
        List<Letter> letters = new ArrayList<>(letterMap.values());

        letters.sort(new LetterComperator());
        for (int i = 1; i < letters.size(); i++) {
            if(letters.get(i).start <= letters.get(i-1).end){
                if(letters.get(i).end > letters.get(i-1).end){
                    letters.get(i-1).end = letters.get(i).end;
                }
                letters.remove(i);
                i--;
            }
        }

        List<Integer> lengths = new ArrayList<>();
        for (Letter letter : letters)
            lengths.add(letter.end-letter.start+1);
        return lengths;
    }




    private static class LetterComperator implements Comparator<Letter>{
        @Override
        public int compare(Letter o1, Letter o2) {
            if(o1.start < o2.start) return -1;
            else if(o1.start > o2.start) return 1;
            else return 0;
        }
    }

    private static class Letter{
        private int start;
        private int end;
        private char ch;
        Letter(char c, int start){
            this.ch = c;
            this.start = start;
            this.end = start;
        }
    }
}
