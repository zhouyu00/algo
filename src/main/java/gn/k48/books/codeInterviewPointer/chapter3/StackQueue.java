package gn.k48.books.codeInterviewPointer.chapter3;

import java.util.LinkedList;
import java.util.Stack;

public class StackQueue {
    private Stack<Integer> push;
    private Stack<Integer> pop;
    StackQueue(){
        this.push= new Stack<>();
        this.pop= new Stack<>();
    }
    public void add(int e){
        push.push(e);
    }
    public int poll(){
        if(pop.empty()){
            while(!push.empty())pop.push(push.pop());

        }
        return pop.pop();
    }
    public int peek(){
        if(pop.empty()){
            while(!push.empty())pop.push(push.pop());
        }
        return pop.peek();
    }
}
