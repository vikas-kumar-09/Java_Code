package Stacks_Queues;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        
        CustomQueue queue = new CustomQueue();

        queue.insert(12);
        queue.insert(13);
        queue.insert(124);
        queue.insert(125);

        queue.display();

        System.out.println(queue.remove());
        queue.display();

    }
}
