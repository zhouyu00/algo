package PointOffer;

import java.util.Stack;

public class Solution9 {
    public static class MyQueue {
        Stack<Integer> pushStack;
        Stack<Integer> popStack;

        /** Initialize your data structure here. */
        public MyQueue() {
            pushStack=new Stack<>();
            popStack=new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            pushStack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if(popStack.isEmpty()){
                while(!pushStack.isEmpty())popStack.push(pushStack.pop());
            }
            if(popStack.isEmpty())throw new RuntimeException("queue is Empty");
            return popStack.pop();
        }

        /** Get the front element. */
        public int peek() {
            if(popStack.isEmpty()){
                while(!pushStack.isEmpty())popStack.push(pushStack.pop());
            }
            if(popStack.isEmpty())throw new RuntimeException("queue is Empty");
            return popStack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return pushStack.isEmpty()&&popStack.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(3);
        int param_3 = obj.peek();
        int param_2 = obj.pop();
        boolean param_4 = obj.empty();
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
