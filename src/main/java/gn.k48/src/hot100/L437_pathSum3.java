package hot100;

import base.TreeNode;

public class L437_pathSum3 {
    public static int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        int t = (targetSum == 0) ? 1 : 0;
        int left = pathSum(root.left, targetSum - root.val) + pathSum(root.left, targetSum);
        int right = pathSum(root.right, targetSum - root.val) + pathSum(root.right, targetSum);
        return left + right + t;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(-3);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(11);
        TreeNode t7 = new TreeNode(3);
        TreeNode t8 = new TreeNode(-2);
        TreeNode t9 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;

        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t6.right = t9;

        System.out.println(pathSum(t1, 8));
    }
}
