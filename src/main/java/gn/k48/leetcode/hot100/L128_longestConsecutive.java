package gn.k48.leetcode.hot100;

import java.util.*;

public class L128_longestConsecutive {
    //
    public static int longestConsecutive1(int[] nums) {
        if (nums.length == 0) return 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
        }
        int res = 1;
        int cnt = 1;
        int t = queue.poll();
        while (!queue.isEmpty()) {
            int temp = queue.poll();
            if (temp == t) {
            } else if (temp == t + 1) {
                cnt++;
            } else {
                cnt = 1;
            }
            res = Math.max(res, cnt);
            t = temp;
        }
        return res;
    }

    //hash匹配方法
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        int res = 0;
        for (int num : numSet) {
            if(!numSet.contains(num-1)){
                int t = num;
                int cnt = 0;
                while (numSet.contains(t)) {
                    t = t + 1;
                    cnt++;
                }
                res = Math.max(res, cnt);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
//        int[] nums = {1, 2, 0, 1};
        System.out.println(longestConsecutive(nums));
    }
}
