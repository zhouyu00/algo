package gn.k48.leetcode.hot100;


import gn.k48.utils.TreeNode;

public class L101_isSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        if (root.left == null || root.right == null || root.left.val != root.right.val) {
            return false;
        }
        return shift(root.left, root.right);
    }

    public boolean shift(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return t1.val == t2.val && shift(t1.left, t2.right) && shift(t1.right, t2.left);
    }

}
