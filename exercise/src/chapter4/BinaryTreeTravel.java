package chapter4;

import java.util.Stack;

public class BinaryTreeTravel {
    public static class Node{
        public int val;
        public Node left;
        public Node right;
        public Node(int data){
            this.val=data;
        }
    }

    public static void preOrderTravel(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.val+" ");
        preOrderTravel(head.left);
        preOrderTravel(head.right);
    }

    public static void inOrderTravel(Node head){
        if(head==null)return;
        inOrderTravel(head.left);
        System.out.print(head.val+" ");
        inOrderTravel(head.right);
    }

    public static void postOrderTravel(Node head){
        if(head==null)return;
        postOrderTravel(head.left);
        postOrderTravel(head.right);
        System.out.print(head.val+" ");
    }

    public static void preOrderTravel1(Node head){
        Stack<Node> stack = new Stack<>();
        stack.push(head);
        while(!stack.isEmpty()){
            Node tnode = stack.pop();
            System.out.print(tnode.val+" ");
            if(tnode.right!=null)
            stack.push(tnode.right);
            if(tnode.left!=null)
            stack.push(tnode.left);
        }
    }

    public static void inOrderTravel1(Node head){
        Stack<Node> stack = new Stack<>();
        while(!stack.isEmpty()||head!=null){
            if(head!=null){
                stack.push(head);
                head=head.left;
               // System.out.println("push");
            }
            else{
                head=stack.pop();//在到达末尾的时候如果右子树位null会连续pop()
                System.out.print(head.val+" ");
                head=head.right;
               // System.out.println("pop");
            }
        }
    }

    public static void postOrderTravel1(Node head){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(head);
        while(!s1.isEmpty()){
            Node t = s1.pop();
            if(t.left!=null)
            s1.push(t.left);
            if(t.right!=null)
            s1.push(t.right);
            s2.push(t);
        }
        while(!s2.isEmpty()){
            System.out.print(s2.pop().val+" ");
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
        node1.left=node3;
        node1.right=node4;
        node2.left=node5;
        node2.right=node6;
        preOrderTravel(root);
        System.out.println();
        inOrderTravel(root);
        System.out.println();
        postOrderTravel(root);
        System.out.println();
        preOrderTravel1(root);
        System.out.println();
        inOrderTravel1(root);
        System.out.println();
        postOrderTravel1(root);
        System.out.println();
    }
}
