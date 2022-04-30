package gn.k48.leetcode.hot100;


import gn.k48.utils.TreeNode;

public class L114_flatten {

    static TreeNode last;

    public static void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flat(root);
    }

    public static void flat(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode left = node.left;
        TreeNode right = node.right;

        last.right = node;
        last.left = null;
        last = node;
        flat(left);
        flat(right);

    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        t1.left = t2;
        t1.right = t5;
        t2.left = t3;
        t2.right = t4;
        t5.right = t6;
        TreeNode p1 = last = new TreeNode(0);
        flatten(t1);
        while (p1 != null) {
            System.out.print(p1.val + ",");
            p1 = p1.right;
        }
        System.out.println();
    }
}
