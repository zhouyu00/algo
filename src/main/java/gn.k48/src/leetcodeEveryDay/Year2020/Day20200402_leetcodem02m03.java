package leetcodeEveryDay.Year2020;

import base.ListNode;

public class Day20200402_leetcodem02m03 {
    public void deleteNode(ListNode node) {
        ListNode next = null;
        while(node.next!=null){
            next= node.next;
            node.val = next.val;
            if(next.next==null)node.next = null;
            node=next;
        }
    }
    //
    public void deleteNode1(ListNode node) {
        ListNode next = node.next;
        node.val=next.val;
        node.next=next.next;
    }
}
