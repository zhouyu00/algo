package gn.k48.books.codeInterviewPointer.chapter4;

public class NewTypeBiTree {
    public static class Node{
        public int val;
        public Node left;
        public Node right;
        public Node parent;
        public Node(int data){
            this.val=data;
        }
    }
    public static Node getLeftMost(Node node){
        if(node==null){
            return node;
        }
        while(node.left!=null)node=node.left;
        return node;
    }

    public static Node getNextNode(Node node){
        if(node==null){
            return node;
        }
        else if(node.right!=null){
            return getLeftMost(node.right);
        }else{
            Node parent = node.parent;
            while(parent!=null&& parent.left!=node){
                node=parent;
                parent=node.parent;
            }
            return parent;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        root.left=node1;
        root.right=node2;
        node1.parent=root;
        node2.parent=root;
        node1.left=node3;
        node1.right=node4;
        node3.parent=node1;
        node4.parent=node1;

        node2.left=node5;
        node2.right=node6;
        node5.parent=node2;
        node6.parent=node2;
        for(Node node=getLeftMost(root);node!=null;node=getNextNode(node)){
            System.out.print(node.val+" ");
        }
    }
}
