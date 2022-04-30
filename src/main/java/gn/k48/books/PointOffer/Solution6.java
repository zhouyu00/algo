package gn.k48.books.PointOffer;
import java.util.ArrayList;
import java.util.Stack;

public class Solution6 {
    public static class ListNode{
        public int val;
         public ListNode next;
         public ListNode(int x) { val = x; }
    }
    public static int[] printListReversingly(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        int len =0;
        while(head!=null){
            stack.push(head.val);
            head=head.next;
            len++;
        }
        int[] arr = new int[len];
        int index=0;
        while(!stack.isEmpty()){
            arr[index++]=stack.pop();
        }
        return arr;
    }

    public static void main(String[] args) {
        ListNode ln1 = new ListNode(2);
        ListNode ln2 = new ListNode(3);
        ListNode ln3 = new ListNode(5);
        ln1.next= ln2;
        ln2.next=ln3;
        int[] p = printListReversingly(ln1);
        for(int x:p){
            System.out.print(x+" ");
        }
    }
}
