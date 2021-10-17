package leetcodeEveryDay.Year2020;

import java.util.HashMap;

public class Day20200323_leetcode169 {
    /*
    先不考虑一边循环的方法，采用最笨的方式做一做
     */
    public static int majorityElement(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!countMap.containsKey(nums[i])){
                countMap.put(nums[i],1);
            }
            else countMap.put(nums[i],countMap.get(nums[i])+1);
            if(countMap.get(nums[i])>=(nums.length/2)){
                res = nums[i];
            }
        }
        return res;
    }


    /*
    想用最
     */
    public static int majorityElement1(int[] nums) {
        int c = 1;
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
            if(res == nums[i])c+=1;
            else c-=1;
            if(c<0){
                res = nums[i];
            }
        }
        return res;

    }


    public static void main(String[] args) {
        int[] e = new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement1(e));
    }
}
