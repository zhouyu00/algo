package gn.k48.leetcode.Year2020;


import gn.k48.utils.TreeNode;

public class Day20200402_leetcodem27 {
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)return null;
        TreeNode tmpNode = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmpNode);

        return root;
    }
}
