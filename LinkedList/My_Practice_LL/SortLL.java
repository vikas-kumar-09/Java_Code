package LinkedList.My_Practice_LL;

// sort a linkedList in java
public class SortLL {

    private Node head;
    private Node tail;

    private int size;

    public SortLL(){
        this.size = 0;
    }

    // Insert value
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    // Display the values
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    // swap two values
    public  void swap(Node ptr1, Node ptr2) {
        int tmp = ptr2.value;
        ptr2.value = ptr1.value;
        ptr1.value = tmp;
    }

    // sort using bubble sort
    public void bubbleSort(){
          boolean swapped;
          Node node;

          if(head == null){
            return;
          }

          do{

            swapped = false;
            node = head;

            while (node.next != null){
                if(node.value > node.next.value){
                    swap(node, node.next);
                    swapped = true;
                }
                node = node.next;
            }
          }while (swapped);
    }
    private class Node{
     private int value;
     private Node next;
     
    private Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    private Node(int value) {
        this.value = value;
    }
        
    }
}
