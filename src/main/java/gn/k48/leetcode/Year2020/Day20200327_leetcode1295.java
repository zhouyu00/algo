package gn.k48.leetcode.Year2020;

public class Day20200327_leetcode1295 {
    public static  int findNumbers(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(getCount(nums[i])%2==0)
                res+=1;
        }
        return res;
    }
    public static  int getCount(int num){
        int count = 0;
        while(num!=0){
            num/=10;
            count+=1;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
