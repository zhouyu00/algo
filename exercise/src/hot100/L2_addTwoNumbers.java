package hot100;

import base.ArrayUtil;
import base.ListNode;

public class L2_addTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        int len1 = 0, len2 = 0;
        ListNode p1 = l1, p2 = l2;
        ListNode last1 = l1, last2 = l2;
        while (p1 != null || p2 != null) {
            int t = c;
            if (p1 != null) {
                t += p1.val;
            }
            if (p2 != null) {
                t += p2.val;
            }
            c = t / 10;
            if (p1 != null) {
                p1.val = t % 10;
                len1++;
                p1 = p1.next;

            }
            if (p2 != null) {
                p2.val = t % 10;
                len2++;
                p2 = p2.next;
            }
            if (p1!=null&&p1.next == null) {
                last1 = p1;
            }
            if (p2!=null&&p2.next == null) {
                last2 = p2;
            }
        }
        if (c != 0) {
            last1.next = last2.next = new ListNode(c);
        }
        return len1 > len2 ? l1 : l2;
    }

    public static int len(ListNode l1) {
        int l = 0;
        while (l1 != null) {
            l++;
            l1 = l1.next;
        }
        return l;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(4);
        n4.next = n5;
        n5.next = n6;
        ListNode l = addTwoNumbers(n1, n4);
        ArrayUtil.printArray(l);
    }
}
