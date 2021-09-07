package com.ea.interviews.leetcode;

public class Sqrt69 {
    public int mySqrt(int x) {
        if(x==1) return 1;
        long l=0, r=x, mid=0;
        while(l<=r){
            mid = l+(r-l)/2;
            long pr=mid*mid;
            if(pr==(long)x)
                return (int)mid;
            else if(pr>(long)x)
                r=mid-1;
            else
                l=mid+1;
        }
        return (int)r;
    }
}
