package com.ea.interviews.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestConsecutive128 {

    Map<Integer, Bucket> startNeeds = new HashMap<>();
    Map<Integer, Bucket> endsNeeds = new HashMap<>();


    public int[] getLongestConsecutive(int[] in){

        startNeeds.put(in[0]-1,new Bucket(in[0]));
        endsNeeds.put(in[0]+1,new Bucket(in[0]));


        for (int i = 1; i < in.length; i++) {
            if(startNeeds.containsKey(i)){
                Bucket bucket = startNeeds.get(i);
                bucket.elements.add(i);
                startNeeds.put(i-1,bucket );
                startNeeds.remove(i);
            }
            if(endsNeeds.containsKey(i)){
                Bucket bucket = endsNeeds.get(i);
                bucket.elements.add(i);
                endsNeeds.put(i+1,bucket );
                endsNeeds.remove(i);
            }

        }


        return null;
    }

    class Bucket {
        int first;
        int last;
        List<Integer> elements;

        Bucket(int i){
            elements.add(i);
        }
    }

}
