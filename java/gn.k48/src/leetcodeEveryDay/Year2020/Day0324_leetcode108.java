package leetcodeEveryDay.Year2020;


import base.TreeNode;

public class Day0324_leetcode108 {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums,0,nums.length-1);
    }

    public static TreeNode buildTree(int[] nums,int left, int right){
        if(left>=right)return null;
        int mid = (left+right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left= buildTree(nums,left,mid-1);
        root.right=buildTree(nums,mid+1,right);
        return root;
    }

    public static void main(String[] args) {
        int[] nums= new int[]{-10,-2,0,5,9};
        TreeNode t = sortedArrayToBST(nums);
        TreeNode.preTravelTree(t);
    }
}
