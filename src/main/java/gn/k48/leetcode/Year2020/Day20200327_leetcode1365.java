package gn.k48.leetcode.Year2020;

public class Day20200327_leetcode1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] counts = new int[101];
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            counts[nums[i]]+=1;
        }
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=0;j<nums[i];j++){
                sum+=counts[j];
            }
            res[i]=sum;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] inputs = new int[]{7,7,7,7};
        int[] res  = smallerNumbersThanCurrent(inputs);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
