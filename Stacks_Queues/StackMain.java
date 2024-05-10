package Stacks_Queues;

public class StackMain {
    public static void main(String[] args) throws StackException{
        
        CustomStack stack = new CustomStack(5);

        stack.push(12);
        stack.push(13);
        stack.push(88);
        stack.push(15);
        stack.push(16);
        // stack.push(99);

        System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
    }
}
