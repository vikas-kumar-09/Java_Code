package LinkedList;

// import java.util.LinkedList;

public class SLL {

    private Node head;
    private Node tail;

    private int size;

    public SLL() {
        this.size = 0;
    }
    
    // find the length of the linked list
    public int length() {
        int count = 0;
        Node current = head; // Initialize current node
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    // To insert at last index
    public void insertLast(int val){
      if(tail == null){
        insertFirst(val);
        return;
      }
      Node node = new Node(val); // Node means creating a box
      tail.next = node;
      tail = node;
      size++;
    }

    
    // To insert value at  first index
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        // if no linkedlist is provided ..or there is only one element exist which is head
        if(tail == null){
            tail = head;
        }
      size += 1;
    }

    // Insert value at particular index
    // public void insert(int val, int index){
    //          if(index == 0){
    //           insertFirst(val);
    //           return;
    //          }

    //          if(index == size){
    //           insertLast(val);
    //           return;
    //          }
    //          Node temp = head;
    //          for(int i=1; i<index; i++){
    //              temp = temp.next;
    //          }
    //          Node newnode = new Node(val, temp.next);
    //          temp.next = newnode;

    //          size++;

    // }

   // To delete last element in LL
    public Node get(int index){
         Node node = head;
         for(int i=0; i<index; i++){
          node = node.next;
         }
         return node;
    }

    public int deleteLast(){
      if(size <= 1){
        return deleteFirst();
      }
      Node secondLast = get(size-2);
      int val = tail.value;
      tail = secondLast;
      tail.next = null;
      return val;
    }

    // To delete the element at particular index
    // public int delete(int index){
    //   if(index == 0){
    //     return deleteFirst();
    //   }
    //   if(index == size-1){
    //     return deleteLast();
    //   }

    //   Node prev = get(index -1);
    //   int val = prev.next.value;

    //   prev.next = prev.next.next;

    //   return val;

    // }

    // to find the node of element in LL (EX - n/k node as well)
    public Node findNode(int value){
      Node  node = head;
       while (node != null) {
        if(node.value == value) {
          return node;
        }
        node = node.next;
       }
       return null;
 }

    

    // to delete first in LL
      // public int deleteFirst(){
      //   int val = head.value;
      //   head = head.next;

      //   if(head == null){
      //     tail = null;
      //   }
      //     size--;
      //     return val;
      // }

    private int deleteFirst() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'deleteFirst'");
    }

    // Display function
    public void Display(){
        Node temp = head;
        while(temp != null) {
          System.out.print(temp.value + " -> ");
          temp = temp.next;
        }
        System.out.println("END");
    }
    
    private class Node {
      private int value;
      private Node next;

      private Node(int value){
        this.value = value;
      }
      private Node(int value, Node next){
        this.value = value;
        this.next = next;
      } 
    }  
}
