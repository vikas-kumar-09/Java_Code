package Stacks_Queues.StackQUeue_Interview;

import java.util.Stack;

// Implements Queue using Stack in java :
 public class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }
    // add items into stack
    public void add(int item){
         first.push(item);
    }
    // remove from first to second
    public int remove() throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int  removed = second.pop();

        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int  peeked = second.peek();

        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}
