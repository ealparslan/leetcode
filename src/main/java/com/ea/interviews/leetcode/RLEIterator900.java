package com.ea.interviews.leetcode;

public class RLEIterator900 {
    public static void main(String[] args) {

        int[] A = {3,8,0,9,2,5};

        RLEIterator obj = new RLEIterator(A);
        System.out.println(obj.next(2));
        System.out.println(obj.next(1));
        System.out.println(obj.next(1));
        System.out.println(obj.next(2));
    }

    static class  RLEIterator {

        int[] A;
        int pos = 0;

        public RLEIterator(int[] A) {
            this.A = A;
        }

        public int next(int n) {
            if(pos > A.length-1) return -1;
            if(n<A[pos]){
                A[pos] -= n;
                return A[pos+1];
            }
            else if(n==A[pos]){
                pos += 2;
                return A[pos-1];
            }
            else {
                pos += 2;
                if(pos > A.length-1) return -1;
                return next(n-A[pos-2]);
            }
        }
    }
}
