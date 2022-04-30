package gn.k48.leetcode.hot100;

import gn.k48.utils.ArrayUtil;
import gn.k48.utils.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L96_inorderTraversal {

    //1
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        LinkedList<TreeNode> stack = new LinkedList<>();

        TreeNode p = root;

        while (!stack.isEmpty() || p != null) {

            while (p != null) {
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if (p != null) {
                res.add(p.val);
            }
            if (p != null) {
                p = p.right;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);

        t1.left = t2;
        t1.right = t3;

        List<Integer> res = inorderTraversal(t1);
        ArrayUtil.printList(res);
    }
}
