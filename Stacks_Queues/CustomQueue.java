package Stacks_Queues;

public class CustomQueue{
    
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length; // ptr is at last index
     }
     
     public boolean isEmpty(){
         return end == 0;
     }
     // To insert the value in queue
     public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end] = item;
        end++;
        return true;
     }
    // remove items from first
     public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }

        int removed = data[0];

        // shift the element to left
        for(int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
     }
     // to display the item from front
     public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
     }
     // display the items
     public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i] +" <- ");
        }
        System.out.println("END");
     }
}
