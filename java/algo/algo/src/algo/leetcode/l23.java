// package algo.leetcode;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;

public class l23 {
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

    //采用基数排序的方式
    public static ListNode mergeKLists(ListNode[] lists) {
        Map<Integer,ListNode> linkMaps = new TreeMap<>(Comparator.reverseOrder());
        
        for(int i=0;i<lists.length;i++){
            ListNode c = lists[i],ne;
            while(c!=null){
                ne = c.next;
                if(!linkMaps.keySet().contains(c.val)){
                    linkMaps.put(c.val, c);
                    c.next =null;
                }
                else{
                    //头插法
                    ListNode n = linkMaps.get(c.val);
                    c.next = n;
                    linkMaps.put(c.val, c);
                }
                c = ne;
            }
        }
        //打印map
        for(ListNode t:linkMaps.values()){
            ListNode temp = t;
            while(temp!=null){
                System.out.print(temp.val+",");
                temp = temp.next;
            }
            System.out.println();

        }

        //连接成一个链表
        ListNode tHead =null,tTail = null;
        ListNode tail,temp;

        for(ListNode t:linkMaps.values()){
            temp=t;
            while(temp.next!=null)temp=temp.next;
            tail = temp;
            tail.next = tHead;
            tHead = t;
        }

        //打印最终链表
        ListNode tNode = tHead;
        while(tNode!=null){
            System.out.print(tNode.val+",");
            tNode =tNode.next;
        }
        System.out.println();
        return tHead;
    }

    public static void main(String[] aStrings){
        
        Set<Integer> treeSet = new TreeSet<>();
        Integer[] arr = {98,2,324,5,123,83,33,67,23};
        for(int i=0;i<arr.length;i++){
            treeSet.add(arr[i]);
        }
        ListNode[] lists = new ListNode[3];
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(1);
        ListNode l5 = new ListNode(3);
        ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(2);
        ListNode l8 = new ListNode(6);
        lists[0]=l1;l1.next = l2;l2.next=l3;
        lists[1]=l4;l4.next = l5;l5.next=l6;
        lists[2]=l7;l7.next=l8;

        mergeKLists(lists);
    }

}
