// package algo.leetcode;

public class l25 {

    public static class ListNode{
        public int val;
        public ListNode next;
        
        public ListNode(){}
        public ListNode(int val){this.val =val;}
        public ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }


    public static <T> void printLinkList(ListNode head){
        while(head!=null){
            System.out.print(head.val+",");
            head =head.next;
        }
        System.out.println();
    }

    //单个列表反转
    public static ListNode reverseOne(ListNode start,ListNode end){
        if(start==null||end == null)return null;
        ListNode pre=null,t=start,next = t;
        while(t!=null&&pre!=end){
            next = t.next;
            //调整指针
            t.next = pre;
            //更新上面的量
            pre = t;
            t = next;
        }
        return end;
    }
    //按k个为一组进行反转
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode start= head,end=null;
        ListNode v = new ListNode();
        ListNode pre = v,next;
        ListNode h = head;

        for(int c=0;h!=null;h=next,c++){
            next = h.next;
            if(c%k==0)start = h;  
            if(c%k==k-1) {
                //标记end
                end = h;
                reverseOne(start,end);
                //处理指针
                start.next = next;
                pre.next = end;
                pre = start;
            }
        }
        
        return v.next;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;l2.next = l3;l3.next =l4;l4.next=l5;
        ListNode h =reverseKGroup(l1, 2);
        for(ListNode s =h;s!=null;s=s.next){
            System.out.println(s.val);
        }
    }
}
