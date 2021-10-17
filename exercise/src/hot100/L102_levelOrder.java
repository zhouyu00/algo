package hot100;

import base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L102_levelOrder {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offerLast(root);
        queue.offerLast(null);
        List<Integer> level = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode t = queue.pollFirst();
            if (t != null) {
                level.add(t.val);
                if (t.left != null) {
                    queue.offerLast(t.left);
                }
                if (t.right != null) {
                    queue.offerLast(t.right);
                }
            } else {
                if (queue.isEmpty()) break;
                res.add(level);
                level = new ArrayList<>();
                queue.offerLast(null);
            }
        }
        if (!level.isEmpty()) res.add(level);
        return res;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;

        List<List<Integer>> res = levelOrder(t1);
        System.out.println(res.size());
        for (int i = 0; i < res.size(); i++) {
            for (int j = 0; j < res.get(i).size(); j++) {
                System.out.print(res.get(i).get(j) + ",");
            }
            System.out.println();
        }
    }
}
