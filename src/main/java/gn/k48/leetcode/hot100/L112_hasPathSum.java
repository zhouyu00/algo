package gn.k48.leetcode.hot100;


import gn.k48.utils.TreeNode;

import java.util.LinkedList;

public class L112_hasPathSum {


    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode p = root;
        int sum = 0;
        while (p != null || !stack.isEmpty()) {
            while (p != null) {
                stack.push(p);
                sum += p.val;
                p = p.left;
            }
            System.out.println(sum);
            if (sum == targetSum) return true;
            if (!stack.isEmpty()) {
                TreeNode t = stack.pop();
                sum -= t.val;
                p = t.right;
            }
        }
        return false;
    }

    public static boolean hasPathSum1(TreeNode root, int targetSum) {
        return dfs(root, targetSum, 0);
    }

    public static boolean dfs(TreeNode root, int targetSum, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            if (sum + root.val == targetSum) {
                return true;
            }
        }
        boolean left = dfs(root.left, targetSum, sum + root.val);
        boolean right = dfs(root.right, targetSum, sum + root.val);
        return left || right;
    }

    public boolean hasPathSum2(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum - root.val == 0;
        }
        return hasPathSum(root.left, sum - root.val)
                || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(8);
        TreeNode t4 = new TreeNode(11);
        TreeNode t5 = new TreeNode(13);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(7);
        TreeNode t8 = new TreeNode(2);
        TreeNode t9 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t6.right = t9;
        System.out.println(hasPathSum1(t1, 22));
    }
}
