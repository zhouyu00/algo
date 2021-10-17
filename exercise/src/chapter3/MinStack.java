package chapter3;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    MinStack(){
        stack=new Stack<>();
        minStack=new Stack<>();
    }
    public int pop(){
        if(stack.empty())
            throw new RuntimeException("stack is empty");
        else{
            int t=stack.pop();
            minStack.pop();
            return t;
        }
    }
    public void push(int e){
        if(stack.empty()){
            stack.push(e);
            minStack.push(e);
        }
        else{
            int t= minStack.peek();
            minStack.push(t<e?t:e);
        }
    }
    public int getMin(){
        if(stack.empty()){
            throw new RuntimeException("stack is empty");
        }
        else{
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        int[] randomArray= new int[10];
        for(int i=0;i<10;i++){
            randomArray[i]=(int)(80*Math.random());
            System.out.print(randomArray[i]+" ");
        }
        System.out.println();
        for(int i=0;i<10;i++){
            minStack.push(randomArray[i]);
            System.out.print(minStack.getMin()+" ");
        }
    }
}
