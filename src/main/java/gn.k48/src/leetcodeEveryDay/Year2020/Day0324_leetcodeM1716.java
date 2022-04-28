package leetcodeEveryDay.Year2020;

public class Day0324_leetcodeM1716 {
    public static int message(int[] nums){
        int[] res = new int[nums.length];
        res[0]=nums[0];
        res[1]=nums[0]>nums[1]?nums[0]:nums[1];
        for(int i=2;i<res.length;i++){
            res[i]=Math.max(res[i-1],res[i-2]+nums[i]);
        }
        return res[nums.length-1];
    }

    public static void main(String[] args) {
        int[] message = new int[]{1,2,3,1};
        System.out.println(message(message));
    }
}
