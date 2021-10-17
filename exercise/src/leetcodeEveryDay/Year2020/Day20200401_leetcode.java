package leetcodeEveryDay.Year2020;

import base.TreeNode;

import java.util.LinkedList;

public class Day20200401_leetcode {
    static TreeNode last = null;
    public static void flatten(TreeNode root) {
       if(root==null)return;
       flatten(root.right);
       flatten(root.left);
       root.right = last;
       root.left = null;
       last = root;
    }


    public static void InOrderTravel(TreeNode root){
        TreeNode res = root,c = root;
        LinkedList<TreeNode> s = new LinkedList<>();
        if(root==null)return;
        s.push(root);
        while(!s.isEmpty()) {
            c=s.peek();
            while(c!=null) {
                c=c.left;
                s.push(c);
            }
            s.pop();
            if(!s.isEmpty()){
                c= s.pop();
                s.push(c.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        t1.left = t2;t1.right=t5;
        t2.left=t3;t2.right=t4;
        t5.right= t6;

        flatten(t1);
        TreeNode.preTravelTree(t1);
    }
}
