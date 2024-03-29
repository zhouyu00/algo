package gn.k48.leetcode.hot100;


import gn.k48.utils.TreeNode;

public class L98_isValidBST {
    public static Integer last;
    public static boolean result;

    public boolean isValidBST(TreeNode root) {
        last = null;
        result = true;
        preTraversal(root);
        return result;
    }

    public static void preTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        preTraversal(root.left);
        result &= (last == null || last < root.val);
        last = root.val;
        preTraversal(root.right);
    }
}
