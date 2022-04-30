package gn.k48.leetcode.Year2020;

import java.util.ArrayList;

public class Day20200402_leetcode1389 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            res.add(index[i],nums[i]);
        }
        return  res.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        int[] n = new int[]{0,1,2,3,4};
        int[] ix = new int[]{0,1,2,2,1};
        int[] res =createTargetArray(n,ix);
        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
}
