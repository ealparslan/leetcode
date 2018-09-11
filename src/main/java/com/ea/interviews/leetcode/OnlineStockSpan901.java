package com.ea.interviews.leetcode;

import java.util.Stack;

public class OnlineStockSpan901 {

    public static void main(String[] args) {

        StockSpanner spanner = new StockSpanner();
        System.out.println(spanner.next(100));
        System.out.println(spanner.next(80));
        System.out.println(spanner.next(60));
        System.out.println(spanner.next(70));
        System.out.println(spanner.next(60));
        System.out.println(spanner.next(75));
        System.out.println(spanner.next(85));
        System.out.println(spanner.next(100));

    }


    static class StockSpanner {

        Stack<Integer> weights =  new Stack<>();
        Stack<Integer> prices = new Stack<>();

        public StockSpanner() {

        }

        public int next(int price) {

            int w = 1;
            while (prices.size() > 0 && price >= prices.peek()){
                w += weights.pop();
                prices.pop();
            }
            prices.push(price);
            weights.push(w);
            return w;
        }
    }

}
