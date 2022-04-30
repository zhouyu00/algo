package gn.k48.leetcode.hot100;


import gn.k48.utils.TreeNode;

public class L104_maxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

    }
}

