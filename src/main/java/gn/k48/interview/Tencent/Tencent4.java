package gn.k48.interview.Tencent;


public class Tencent4 {

    public static int findReplicate(int[] nums){
        for(int i=0;i<nums.length;i++){
            int t = Math.abs(nums[i]);
            if(nums[t]<0)return nums[i];
            else nums[t] = -nums[t];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(findReplicate(nums));
    }
}
