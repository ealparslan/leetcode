package com.ea.interviews.leetcode;

public class TrappingRainWater42 {

    public static void main(String args[]){

        int walls[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        int p1 = 0;
        int p2 = 0;
        int vol = 0;

        while (p1!=walls.length && p2!=walls.length-1){
            int between = 0;
            p2++;
            int end=0;
            while (walls[p2]<walls[p1])
            {
                if(p2==walls.length-1)
                {
                    int biggest = walls[walls.length-1];
                    for(int i = walls.length-1; i>p1; i--){
                        if(walls[i] > biggest)
                        {
                            biggest = walls[i];
                            end = biggest;
                        }
                    }
                    break;
                }
                between += walls[p2];
                p2++;
            }
            int v;
            if(end!=0)
            {
                end = walls.length-end;
                v = ((end-p1-1) * (walls[p1]<walls[end] ? walls[p1] : walls[end])) - (between);
            }
            else {
                v = ((p2-p1-1) * (walls[p1]<walls[p2] ? walls[p1] : walls[p2])) - (between);
            }

            vol += v;
            p1 = p2;
        }
        System.out.println(vol);
    }

}
