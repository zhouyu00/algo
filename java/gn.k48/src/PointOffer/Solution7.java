package PointOffer;
import chapter4.BinaryTreeTravel.*;

public class Solution7 {
    public static class TreeNode{
        public int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){this.val=x;}
    }
    public static void preOrderTravel(TreeNode head){
        if(head==null){
            return;
        }
        System.out.print(head.val+" ");
        preOrderTravel(head.left);
        preOrderTravel(head.right);
    }

    public static void inOrderTravel(TreeNode head){
        if(head==null)return;
        inOrderTravel(head.left);
        System.out.print(head.val+" ");
        inOrderTravel(head.right);
    }

    public static void postOrderTravel(TreeNode head){
        if(head==null)return;
        postOrderTravel(head.left);
        postOrderTravel(head.right);
        System.out.print(head.val+" ");
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTreeNode(preorder,inorder,0,preorder.length-1);
    }
    private static TreeNode buildTreeNode(int [] preorder,int[] inorder,int left,int right){
        if(left>right)return null;
        int value = preorder[left];
        TreeNode node = new TreeNode(value);
        int midIndex = getInOrderIndex(inorder,value);
        node.left=buildTreeNode(preorder,inorder,left+1,midIndex);
        node.right=buildTreeNode(preorder,inorder,midIndex+1,right);
        return node;
    }

    private static int getInOrderIndex(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] preOrder={3, 9, 20, 15, 7};
        int[] inOrder={9, 3, 15, 20, 7};
        TreeNode root = buildTree(preOrder,inOrder);
        preOrderTravel(root);
        System.out.println();
        inOrderTravel(root);
        System.out.println();
        postOrderTravel(root);
        System.out.println();
    }
}
