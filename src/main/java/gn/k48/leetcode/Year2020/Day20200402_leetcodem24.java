package gn.k48.leetcode.Year2020;

import gn.k48.utils.ListNode;

public class Day20200402_leetcodem24 {
    static ListNode last = null;
    public static ListNode reverseList(ListNode head) {
        if(head==null)return null;
        ListNode next = head.next;
        head.next= last;
        last=head;
        reverseList(next);
        return last;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next=l2;l2.next=l3;l3.next=l4;l4.next=l5;
        ListNode t = reverseList(l1);
        while(t!=null){
            System.out.println(t.val);
            t=t.next;
        }
    }
}
