package chapter4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class IPO {
    public static class Node{
        public int p;
        public int c;
        public Node(int p,int c){
            this.p=p;
            this.c=c;
        }
    }

    public static class MinCostComparator implements Comparator<Node>{
        @Override
        public int compare(Node n1,Node n2){
            return n1.c-n2.c;
        }
    }

    public static class MaxProfitComparator implements Comparator<Node>{
        @Override
        public int compare(Node n1,Node n2){
            return n2.p-n1.p;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Node> costHeap = new PriorityQueue<>(new MinCostComparator());
        PriorityQueue<Node> profitHeap = new PriorityQueue<>(new MaxProfitComparator());

        for(int i=0;i<10;i++){
            int cost=(int)(Math.random()*50);
            int profit=(int)(Math.random()*50);
            costHeap.add(new Node(profit,cost));
            System.out.print(cost+" ");
            System.out.println(profit+" ");
        }
        int k=5;
        int m = (int)(Math.random()*30);
        for(int i=0;i<k;i++){
            System.out.println("m="+m);
            while(!costHeap.isEmpty()&&costHeap.peek().c<m){
                profitHeap.add(costHeap.poll());
            }
            if (profitHeap.size()>0){
                Node node = profitHeap.poll();
                m+=node.p;
                System.out.println(m);
            }
            else{
                System.out.println("profitHeap is empty");
            }
        }

    }
}
