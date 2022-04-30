package gn.k48.leetcode.hot100;


import gn.k48.utils.TreeNode;

public class L124_maxPathSum {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    public int maxGain(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftGain = Math.max(maxGain(node.left), 0);
        int rightGain = Math.max(maxGain(node.right), 0);

        int price = node.val + leftGain + rightGain;
        maxSum = Math.max(maxSum, price);
        return node.val + Math.max(leftGain, rightGain);
    }

    public static void main(String[] args) {

    }
}
