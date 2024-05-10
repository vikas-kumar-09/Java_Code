package LinkedList.My_Practice_LL;

public class Insert_Value {

    private Node head;
    private Node tail;

    private int size;

    
    public Insert_Value() {
        this.size = 0;
    }

    // Insert value at first in LL
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    // To display the LL
    public void display(){
        Node temp = head;
        while (temp !=null){
            System.out.print(temp.value +" -> ");
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
