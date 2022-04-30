package gn.k48.leetcode.hot100;


import gn.k48.utils.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class L113_hasPath2 {

    public static List<List<Integer>> result ;

    public static LinkedList<Integer> path;

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        result = new LinkedList<>();
        path = new LinkedList<>();
        dfs(root, targetSum);
        return result;
    }

    public static void dfs(TreeNode root, int targetSum) {
        if (root == null) return;
        path.offerLast(root.val);
        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            List<Integer> res = new LinkedList<>(path);
            result.add(res);
        }
        dfs(root.left, targetSum - root.val);
        dfs(root.right, targetSum - root.val);
        path.pollLast();
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
        TreeNode t10 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t3.left = t5;
        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t6.right = t9;
        t6.left = t10;
        List<List<Integer>> lists = pathSum(t1, 22);
        for (int i = 0; i < lists.size(); i++) {
            List<Integer> integers = lists.get(i);
            for (int j = 0; j < integers.size(); j++) {
                System.out.print(integers.get(j) + ",");
            }
            System.out.println();
        }
    }

}
