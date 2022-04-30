package gn.k48.acwings.dp.pakcage;

import gn.k48.utils.ArrayUtil;

import java.util.Scanner;

/**
 * 01背包问题
 * <a href="https://www.acwing.com/problem/content/2/">https://www.acwing.com/problem/content/2/</a>
 *
 * @author yuriy
 * &#064;date  2022/4/30 10:48
 */
public class ZeroOnePackage {

    public static int solution(int N, int V, int[] v, int[] w) {
        ArrayUtil.printArray(v);
        ArrayUtil.printArray(w);
        //01 背包问题，每个物品只能取用一次，因此每个物品只有放不放的问题
        //对于每次取舍，问题实际简化为不取第i个物品，与取用第i个物品的最大值
//        int[][] dp = new int[N + 1][V + 1];
//        for (int i = 1; i <= N; i++) {
//            for (int j = 0; j <= V; j++) {
//                if (j < v[i]) {
//                    dp[i][j] = dp[i - 1][j];
//                } else {
//                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - v[i]] + w[i]);
//                }
//            }
//        }
//        return dp[N][V];
        int[] dp = new int[V + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = V; j >= v[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - v[i]] + w[i]);
            }
        }
        return dp[V];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int V = in.nextInt();
        int[] v = new int[N + 1];
        int[] w = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            v[i] = in.nextInt();
            w[i] = in.nextInt();
        }
        System.out.println(solution(N, V, v, w));
    }
}
