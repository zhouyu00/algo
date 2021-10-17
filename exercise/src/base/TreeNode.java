package base;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x){val=x;}

    public static void preTravelTree(TreeNode root){
        if(root==null)return;
            System.out.println(root.val);
        if(root.left!=null)preTravelTree(root.left);
        if(root.right!=null)preTravelTree(root.right);
    }
}
