package hot100;

import base.ArrayUtil;

public class L283_moveZeros {
    public static void moveZeroes(int[] nums) {
        //经过partition处理后第一个不为0的索引
        //可以利用的一个点 0 之间没有区别
        int N = nums.length - 1;
        for (int i = 0, Idx = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                swap(nums, i, Idx++);
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        ArrayUtil.printArray(nums);
    }
}
