package gn.k48.leetcode.Year2020;

import java.util.Arrays;

public class Day20200401_leetcode1051 {
    public int heightChecker(int[] heights) {
        int[] h2 = Arrays.copyOf(heights,heights.length);
        Arrays.sort(h2);
        int res = 0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=h2[i])res++;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
