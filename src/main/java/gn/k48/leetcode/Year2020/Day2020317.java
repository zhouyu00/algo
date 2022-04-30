package gn.k48.leetcode.Year2020;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Day2020317 {
    public static class MaxQueue {
        Queue<Integer> num;
        Deque<Integer> max;
        public MaxQueue() {
            num = new LinkedList<>();
            max = new LinkedList<>();
        }

        public int max_value() {
            return max.isEmpty()?-1:max.peek();
        }

        public void push_back(int value) {
            num.offer(value);
            while(!max.isEmpty()&&max.getLast()<value){
                max.pollLast();
            }
            max.offerLast(value);
        }

        public int pop_front() {
            Integer r = null;
            if(!num.isEmpty())
                r = num.poll();
            if(!max.isEmpty()&&max.peek().equals(r))max.poll();
            return r==null?-1:r;
        }
    }

    public static void main(String[] args) {
        MaxQueue maxQueue = new MaxQueue();
        int[] testQ = new int[]{5,2,3,6};
        for(int i=0;i<testQ.length;i++){
            maxQueue.push_back(testQ[i]);
            System.out.println(maxQueue.max_value());
        }
    }
}
