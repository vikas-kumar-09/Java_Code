package LinkedList.My_Practice_LL;

// https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions
public class ReverseList_LL {

    private Node head;
    private Node tail;
    private int size;
    
    public ReverseList_LL(){
        this.size = 0;
    }

    // Insert values
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        
        if (tail == null){
            tail = head;
        }
        size += 1;
    }
    // Reverse the LinkedList using Recursion
    // public void reverseList(Node node){
    //    if(node == tail){
    //     tail = head;
    //     return;
    //    }
    //    reverseList(node.next);
    //    node.next = node;
    //    tail = node;
    //    tail.next = null;
    // }

       // Reverse LL using three pointer
       Node reverseList1(Node head)
       {
           Node current = head;
           Node previous = null;
           Node next = null;
           while(current != null)
           {
               next = current.next;
               current.next = previous;
               previous = current;
               current = next;
           }
           return  previous;
        }
        
       // Get the length of LinkedList
    public int getLength(){
        int count = 0;
        Node temp = head;

        while (temp != null){
            count++;
            temp = temp.next;
            
        }
        return count;
    }

    // Display the Linkedlist
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private Node next;
        private int value;

        private Node(int value) {
            this.value = value;
        }
        private Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
}
