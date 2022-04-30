package gn.k48.interview.Tencent;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tencent2 {
    //将二叉树每一层最右边的节点保存至一个list中。
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val = val ;}
    }
    //
    public static List<TreeNode> saveRight(TreeNode r){
        List<TreeNode> result = new ArrayList<>();
        if(r==null)return result;
        LinkedList<TreeNode> q1 = new LinkedList<>();
        LinkedList<TreeNode> q2 = new LinkedList<>();
        q1.offerLast(r);
        while(!q1.isEmpty()){
            TreeNode t = q1.pollFirst();
            if(t.left!=null)q2.offerLast(t.left);
            if(t.right!=null)q2.offerLast(t.right);
            if(q1.isEmpty()){
                result.add(t);
                q1= q2;
                q2= new LinkedList<>();
            }
        }
        return result;
    }

    public static void printList(List<TreeNode> treeNodes){
        for(int i=0;i<treeNodes.size();i++){
            System.out.print(treeNodes.get(i).val +",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        //  1
        //  /\
        // 2 3
        // / /
        // 4 5
        //    \
        //     6
        t1.left = t2;t1.right= t3;
        t2.left = t4;t3.left = t5;
        t4.right = t6;
        List<TreeNode> res = saveRight(t1);
        printList(res);
    }
}
