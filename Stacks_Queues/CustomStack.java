package Stacks_Queues;

 public class CustomStack{

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    // Insert the value and increment the ptr by 1
    // initially the stack is empty
    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[item] = ptr;
        return true;
    }

    public int pop() throws StackException{
        if (isEmpty()){
            throw new StackException("Can not pop from empty stack");
        }
        // return removed = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }
    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("Can not peek from empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
       return ptr == data.length -1; // ptr is at last index
    }
    
    public boolean isEmpty(){
        return ptr == -1;
    }
}
