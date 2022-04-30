package gn.k48.interview.Tencent;

public class Tencent3 {
    public static class LinkNode{
        int val;
        public LinkNode next;
        public LinkNode(int val){
            this.val = val;
        }
    }

    public static int findLoop(LinkNode node){
        LinkNode fast = node,slow = node;
        if(node.next==null||node.next.next==null)return -1;
        while(slow.next!=null&&fast.next!=null&&fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow)return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkNode l1 = new LinkNode(1);
        LinkNode l2 = new LinkNode(2);
        LinkNode l3 = new LinkNode(3);
        LinkNode l4 = new LinkNode(4);
        LinkNode l5 = new LinkNode(5);
        LinkNode l6 = new LinkNode(6);
        LinkNode l7 = new LinkNode(7);
        l1.next= l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next = l7;
        System.out.println(findLoop(l1));
    }
}
