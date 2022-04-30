package gn.k48.leetcode.Year2020;

public class Day20200402_leetcode283 {
    public static void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                for(int j=i;j<nums.length;j++){
                    if(nums[j]!=0){
                        int t = nums[i];
                        nums[i]=nums[j];
                        nums[j]=t;
                        break;
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
