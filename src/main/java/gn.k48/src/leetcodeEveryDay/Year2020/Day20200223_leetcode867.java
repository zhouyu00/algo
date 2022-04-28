package leetcodeEveryDay.Year2020;

import base.ListNode;


public class Day20200223_leetcode867 {
    public static ListNode middleNode(ListNode head){
        ListNode h1,h2;
        h1=h2=head;
        while(h2.next!=null&&h2.next.next!=null){
            h2=h2.next.next;
            h1=h1.next;
        }
        return h2.next==null?h1:h1.next;
    }

    public static void main(String[] args) {

    }
}
