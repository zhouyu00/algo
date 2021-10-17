package chapter4;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class LessMoney {
    public static int getLessMoney(int[] arr,Comparator comparator){
        PriorityQueue<Integer> Q = new PriorityQueue<>(comparator);
        for(int x:arr){
            Q.add(x);
        }
        int sum=0;
        while(Q.size()>1){
            int cur=Q.poll()+Q.poll();
            sum+=cur;
            Q.add(cur);
        }
        return sum;
    }

    public static class MinheapComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1,Integer o2){
            return o1-o2;
        }
    }

    public static class MaxheapComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1,Integer o2){
            return o2-o1;
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[15];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*50);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(getLessMoney(arr,new MinheapComparator()));
        System.out.println(getLessMoney(arr,new MaxheapComparator()));
    }
}
