package gn.k48.leetcode.hot100;

public class L287_findDuplicate {

    //二分查找
    public static int findDuplicate1(int[] nums) {
        int l = 0, r = nums.length - 1;
        int ans = 0;
        /*
        二分查找最根本的实质是单调
        cnt[i]可以看做是这样一个单调递增的数组
        满足cnt[i] <=i不存在重复，cnt[i]>i时存在重复
        那么我们要寻找的就是cnt[i]<=i的最后元素或者cnt[i]>i的首个元素的满足这个条件的i
         */
        while (l <= r) {
            int m = l + (r - l) / 2;
            int cnt = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= m) {
                    cnt++;
                }
            }
            //满足条件
            //谁在先谁在后
            if (cnt <= m) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    //二进制
    //按照bit位遍历nums数组
    /*
    对数组nums,bit[i]为count 为 x，对于[1-n],bit[i]为y
    因为 至少有一个重复数字，如果 x>y 则证明该 bit位在重复数字中，则可以由此重构重复数字
     */
    public static int findDuplicate2(int[] nums) {
        //求最高位的bit位数
        int N = nums.length, bitMax = 0;
        while (N > 0) {
            N >>= 1;
            bitMax++;
        }
        //从最高bit位重构重复数字
        int res = 0;
        for (int b = bitMax; b >= 0; b--) {
            int x = 0, y = 0;
            for (int i = 0; i < nums.length; i++) {
                x += (1 & nums[i] >> b);
            }
            for (int i = 1; i < nums.length; i++) {
                y += (1 & i >> b);
            }
            res <<= 1;
            if (x > y) {
                res += 1;
            }
        }
        return res;
    }

    //快慢指针
    /*
    为什么可以使用快慢指针？一定成环吗？
    1.数组元素为向1-n，必定在数组index内有指向，即每个点必定有后继节点
    2.
    将数组看做是 node ->next 的节点映射，那么多个重复数字，
    则即多个节点指向同一个后续节点，即成环

    */
    public static int findDuplicate3(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int[] nums1 = {3, 1, 3, 4, 2};
        System.out.println(findDuplicate2(nums));
        System.out.println(findDuplicate3(nums));
    }
}
