package com.ea.interviews.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals56 {

    private static class Interval{
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    private static class intervalComperator implements Comparator<Interval>{
        @Override
        public int compare(Interval o1, Interval o2) {
            if(o1.start>o2.start) return 1;
            else if(o1.start<o2.start) return -1;
            else return 0;
        }
    }

    public static void main(String[] args) {

        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1,4));
        intervals.add(new Interval(0,2));
        intervals.add(new Interval(3,5));

        List<Interval> results = merge(intervals);

        System.out.println(0);

    }

    private static List<Interval> merge(List<Interval> intervals){
        if(intervals.size()==0) return intervals;
        intervals.sort(new intervalComperator());
        for (int i = 1; i < intervals.size(); i++) {
            if(intervals.get(i).start <= intervals.get(i-1).end){
                if(intervals.get(i).end > intervals.get(i-1).end){
                    intervals.get(i-1).end = intervals.get(i).end;
                }
                intervals.remove(i);
                i--;
            }
        }
        return intervals;
    }

}
