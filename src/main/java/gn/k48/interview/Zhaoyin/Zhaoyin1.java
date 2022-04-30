package gn.k48.interview.Zhaoyin;

public class Zhaoyin1 {
    public static int getMaxValue(int[] nums, int[] values) {
        int[][] dp = new int[nums.length + 2][nums.length + 2];
        for (int i = 0; i < nums.length; i++) dp[i][i] = nums[i] * values[nums.length - 1];

        return rescurve(nums, values, 0, nums.length - 1, 0, 1, dp);
    }

    public static int rescurve(int[] nums, int[] values, int start, int end, int sum, int count, int[][] dp) {
        if (start == end) {
            return sum += dp[start][start];
        }
        int picks = dp[start + 1][end];
        int picke = dp[start][end - 1];
        if (picks == 0) {
            picks = rescurve(nums, values, start + 1, end, sum + nums[start] * values[count - 1], count + 1, dp);
            dp[start + 1][end] = picks;
        }
        if (picke == 0) {
            picke = rescurve(nums, values, start, end - 1, sum + nums[end] * values[count - 1], count + 1, dp);
            dp[start][end - 1] = picke;
        }
//        int picke = rescurve(nums,values,start,end-1,sum+nums[end]*values[count-1],count+1);
        dp[start][end] = Math.max(picks, picke);
        return dp[start][end];
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 2, 4};
        int[] values = new int[]{1, 2, 3, 4, 5};
        System.out.println(getMaxValue(nums, values));
    }
}
