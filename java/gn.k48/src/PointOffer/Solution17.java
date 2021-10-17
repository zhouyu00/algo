package PointOffer;

public class Solution17 {
    public static class ListNode{
        public int val;
        ListNode next;
        public ListNode(int x){this.val=x;}
    }
    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static void printLinkList(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode n1=new  ListNode(1);
        ListNode n2 =new ListNode(4);
        ListNode n3 = new ListNode(6);
        ListNode n4 = new ListNode(8);
        ListNode n5 = new ListNode(3);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        printLinkList(n1);
        deleteNode(n3);
        printLinkList(n1);
    }
}
