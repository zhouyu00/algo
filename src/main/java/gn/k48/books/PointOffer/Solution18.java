package gn.k48.books.PointOffer;

public class Solution18 {
    public static class ListNode{
        public int val;
        ListNode next;
        public ListNode(int x){this.val=x;}
    }
    public static ListNode deleteDuplication(ListNode head) {
        ListNode d=new ListNode(0);
        d.next=head;
        ListNode p=d;
        while(p.next!=null){
            ListNode q=p.next;
            while(q!=null&&p.next.val==q.val){
                q=q.next;
            }
            if(p.next.next==q)p=p.next;
            else p.next=q;
        }
        return d.next;
    }
    public static void printLinkList(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        ListNode n1= new ListNode(1);
        ListNode n2= new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4= new ListNode(2);
        ListNode n5 = new ListNode(3);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        printLinkList(deleteDuplication(n1));

    }
}
