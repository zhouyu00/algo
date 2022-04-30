package gn.k48.leetcode.hot100;


import gn.k48.utils.ArrayUtil;

public class L279_numSquares {
    //dp
    /*
    这种解法实际上和1为完全平方数有关
     */
    public static int numSquares1(int n) {
        //假定f代表能够构成n的最小Min(SUM({xi}))
        int[] f = new int[n + 1];
        //变成一个背包问题
        for (int i = 1; i <= n; i++) {
            int t = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                t = Math.min(t, f[i - j * j]);
            }
            f[i] = t + 1;
        }
        ArrayUtil.printArray(f);
        return f[n];
    }

    /*
    我们来考虑完全背包问题方式
    V = n
    v[i] = i^2
    w[i] = 1
    由于所有的w都为1，于是可以
    dp[i][j]表示从前i个物品中选择，体积不超过j的最小
     */
    public static int numSquares2(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) dp[1][i] = i;
        int n1 = (int) Math.sqrt(n);
        //从前i中物品选择，选择的总体积不大于j
        for (int i = 2; i <= n / i; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j];
                for (int k = 0; k * i * i <= j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - k * i * i] + k);
                }
            }
        }
        return dp[n1][n];
    }

    //按照完全背包问题的优化步骤 去掉k这一维度
    public static int numSquares3(int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) dp[1][i] = i;
        int n1 = (int) Math.sqrt(n);
        //从前i中物品选择，选择的总体积不大于j
        for (int i = 2; i <= n / i; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= i * i)
                    dp[i][j] = Math.min(dp[i][j], dp[i][j - i * i] + 1);
            }
        }
        return dp[n1][n];
    }

    //去掉j这一维度
    public static int numSquares4(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) dp[i] = i;
        //从前i中物品选择，选择的总体积不大于j
        for (int i = 1; i <= n; i++) {
            for (int j = i * i; j <= n; j++) {
                dp[j] = Math.min(dp[j], dp[j - i * i] + 1);
            }
        }
        return dp[n];
    }


    public static void main(String[] args) {
        System.out.println(numSquares2(12));
        System.out.println(numSquares2(13));
        System.out.println(numSquares3(12));
        System.out.println(numSquares3(13));
        System.out.println(numSquares4(12));
        System.out.println(numSquares4(13));
    }
}
