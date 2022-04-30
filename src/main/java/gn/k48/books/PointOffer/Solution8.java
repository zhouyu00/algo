package gn.k48.books.PointOffer;

public class Solution8 {
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode father;
          TreeNode(int x) { val = x; }
      }
      private TreeNode getMostLeft(TreeNode node){
          if(node==null)return node;
          while(node.left!=null)node=node.left;
          return node;
      }

      public TreeNode inorderSuccessor(TreeNode p) {
          if(p==null)return null;
          if(p.right!=null){
            return getMostLeft(p.right);
          }
          else{
              TreeNode father=p.father;
              while(father!=null&&father.left!=p){
                  p=p.father;
                  father=p.father;
              }
              return father;
          }
      }
      public static void main(String[] args) {

      }
}
