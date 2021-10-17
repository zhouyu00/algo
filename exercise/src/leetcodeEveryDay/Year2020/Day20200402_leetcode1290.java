package leetcodeEveryDay.Year2020;

import leetcodeEveryDay.util.ListNode;

public class Day20200402_leetcode1290 {
    static int pos = -1;
    public static int getDecimalValue(ListNode head) {
        if(head==null)return 0;

        int res = getDecimalValue(head.next);
        pos++;
        return res+head.val*((int)Math.pow(2,pos));
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(0);
        l1.next=l2;l2.next=l3;
        System.out.println(getDecimalValue(l1));
    }
}
