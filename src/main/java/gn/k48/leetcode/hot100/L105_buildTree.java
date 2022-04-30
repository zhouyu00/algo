package gn.k48.leetcode.hot100;


import gn.k48.utils.TreeNode;

public class L105_buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildNode(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode buildNode(int[] preorder, int[] inorder, int ps, int pe, int is, int ie) {
        if (ps > pe || is > ie) {
            return null;
        }
        int rootVal = preorder[ps];
        TreeNode t = new TreeNode(rootVal);
        int inorderIdx = 0;
        for (; inorderIdx < inorder.length; inorderIdx++) {
            if (inorder[inorderIdx] == rootVal) break;
        }
        //左子树长度 inorderIdx - is
        int leftLen = inorderIdx - is;
        //右子树长度 ie - inorderIdx
        int rightLen = ie - inorderIdx;
        t.left = buildNode(preorder, inorder, ps + 1, ps + leftLen, inorderIdx - leftLen, inorderIdx - 1);
        t.right = buildNode(preorder, inorder, ps + leftLen + 1, pe, inorderIdx + 1, inorderIdx + rightLen);
        return t;
    }
}
