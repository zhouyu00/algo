package gn.k48.leetcode.Year2020;


import gn.k48.utils.TreeNode;

public class Day20200408_leetcodem0402 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums,0,nums.length-1);
    }
    public TreeNode buildTree(int[] nums,int start,int end){
        if(start>end)return null;
        int mid = (start+end)/2;
        TreeNode root =  new TreeNode(nums[mid]);
        root.left = buildTree(nums,start,mid-1);
        root.right = buildTree(nums,mid+1,end);
        return root;
    }
}
