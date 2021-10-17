package leetcodeEveryDay.Year2020;

import leetcodeEveryDay.util.ListNode;

public class Day20200402_leetcodem22 {
    static int pos = 0;
    public static ListNode getKthFromEnd(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode res = getKthFromEnd(head.next,k);
        pos++;
        if(pos==k)return head;
        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;
        ListNode res = getKthFromEnd(l1,2);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }
}
